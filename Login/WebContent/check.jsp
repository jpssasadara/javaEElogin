<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
check
<%
String userName = null;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("role")) userName = cookie.getValue();
}
}
if(userName == null) response.sendRedirect("login.html");
%>
<h3>Hi <%=userName %>, Login successful.</h3>
<br>
</body>
</html>