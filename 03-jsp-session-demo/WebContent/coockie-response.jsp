<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.http.Cookie"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String favrLang=request.getParameter("favLang");
Cookie mycookie=new Cookie("FavLanguage",favrLang);
mycookie.setMaxAge(60*10);
response.addCookie(mycookie);


%>
<hr>
<h2>to know your selected languge checkout home Page</h2>
<a href="Coockie-home.jsp">Cookie home page</a>
</body>
</html>