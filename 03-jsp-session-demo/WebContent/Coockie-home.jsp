<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  
String favLanguage="Java";
Cookie[] cookies=request.getCookies();
if(cookies!=null){
	for(Cookie c:cookies){
		if(c.getName().equals("favoriteLang")){
			favLanguage=c.getValue();
			break;
		}
	}
	
}

%>
<hr>
<h2>You language <%= favLanguage %></h2>
<a href="coockie-form.jsp">Goto to home Page</a>

</body>
</html>