<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>

<body>
	<h1 class="text-center">student Details</h1>
	<div class="lead">
		First Name is :
		<%= request.getParameter("first_name") %>
	</div>
	<div class="lead">
		Second Name is :
		<%= request.getParameter("second_name")%>
	</div>

	<div class="lead">
		City Name :
		<%= request.getParameter("city")%>
	</div>

	<div class="lead">
		Gender :
		<%= request.getParameter("RadioDefault")%>
	</div>

	<div class="lead">
		Languages Known :
		<%
String [] languages=request.getParameterValues("language");
String lang=String.join(",",languages);
if(lang!=null){
	out.println(lang);
}
else{
	out.println("None");
}
%>
	</div>

</body>
</html>