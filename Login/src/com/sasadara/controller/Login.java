package com.sasadara.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sasadara.model.Student;
import com.sasadara.model.salt;
import com.sasadara.service.GetPWLogin;
import com.sasadara.service.getHashPW;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	String email;
	String password;
	byte[] salt = new byte[16];
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		email = request.getParameter("email");
		password = request.getParameter("password");
		salt ss = GetPWLogin.saltObjectWithStudentReference(email);
		System.out.println("hi salt "+ss.getSalt());
		System.out.println("hi pw "+ss.getStuid().getPassword());
		salt = ss.getSalt().getBytes();
		//calculate hash value according to user given password
		String hashedPW = getHashPW.getSecurePassword(password,salt );
		System.out.println("make==> "+password+" "+salt);
		System.out.println("hi new pw "+hashedPW);
		//checking part
		if(hashedPW.equals(ss.getStuid().getPassword())) {
			//success
			request.setAttribute("message", "Incorrect Username or Password !!! ");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/StudentDash.jsp");
			dispatcher.forward(request, response);
		
		}else {
			//fail
			request.setAttribute("message", "Incorrect Username or Password !!! ");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
		
			
		}
		
			
	}

}
