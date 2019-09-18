package com.sasadara.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sasadara.service.Checkemail;
import com.sasadara.service.RegistrationService;
import com.sasadara.service.getHashPW;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Registration() {
        // TODO Auto-generated constructor stub
    }
    String firstName1;
    String middleName;
    String lastName;
    String email;
    String userId;
    String password;
    String role;
    String salt;
    byte[] salt1;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		firstName1 = request.getParameter("firstName1");
		middleName = request.getParameter("middleName");
		lastName = request.getParameter("lastName");
		email = request.getParameter("email");
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		role = request.getParameter("role");
		salt ="hiiamsalt";
		
		if(!Checkemail.check(email)) {
			Checkemail.result=false;
			//response.sendRedirect("Registration.jsp");
			request.setAttribute("message", "Username is alredy Registered !!! ");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Registration.jsp");
			dispatcher.forward(request, response);
			/*<%
			    out.println(request.getAttribute("message"));
			%>*/
		}
		else{
			Checkemail.result=false;
			//generating a salt
			try {
				salt1=getHashPW.getSalt();
				salt= salt1.toString();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//generating the hashed pw according to generated salt
			System.out.println("make==> "+password+" "+salt1);
			password = getHashPW.getSecurePassword(password,salt1);
			
			//call the service
			boolean bb = RegistrationService.registerStudent(firstName1,middleName,lastName,email,userId,password,role,salt);
			System.out.println(bb);
			if(bb) {
				response.sendRedirect("login.jsp");  
			}
		}
	}
	
	

}
