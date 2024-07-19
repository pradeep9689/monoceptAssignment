<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hello world</h1>
	<!-- Expression Tag
 -->
	<!--  Expression Tag -->
	Today's date is
	<%=new java.util.Date()%>
	<br> Sum of 10 and 20 is
	<%=10 + 20%>
	<br> Is 10 greater than 20
	<%=10 > 20%>
	<br> String in caps
	<%=new String("Hello World").toUpperCase()%>
	<br>

	<!-- Scriplet Tag -->
	<%
		for (int i = 1; i <= 10; i++) {
		out.println("<h4>Number " + i + "</h4>");
	}
	%>

	<!-- Declaration Tag -->

	<%!String upperCase(String input) {
		String[] words = input.split(" ");
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
		}
		String output = String.join(" ", words);
		return output;
	}%>
	<%= upperCase("india is my country") %>>

</body>
</html>