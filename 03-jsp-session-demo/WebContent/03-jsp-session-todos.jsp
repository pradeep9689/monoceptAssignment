<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,java.util.ArrayList"%>
<%@ page import="com.monocept.servlets.StringUtil"%>
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
this is upprerCaseMethod : <%= StringUtil.upperCase("Hello world") %>
	<div class="container mt-3">
		<h2 class="text-center">Todo's List</h2>
		<hr>
		<form action="#" method="get">
			<div>
				<input type="text" name="item" placeholder="Enter a todo task">
			</div>
			<div class="col-sm-10 mt-2">
				<input type="submit" value="Add Todos" class="btn btn-warning">
			</div>
		</form>
		<hr>
		<%
			//Step 1: Get session variable "todoItem" from session object

		List<String> todoItemList = (List<String>) session.getAttribute("todoItem");

		if (todoItemList == null) {
			todoItemList = new ArrayList<>();
			session.setAttribute("todoItem", todoItemList);
		}

		String todoItem = request.getParameter("item");
		if(todoItem!=null){
		if (!todoItem.trim().equals("") && !todoItemList.contains(todoItem)) {
			todoItemList.add(todoItem);
		}

		//out.println("<h2>Added items:<br>");
		}
		
		for (String s : todoItemList) {
			out.println(s);
		}
		%>
	</div>

</body>
</html>