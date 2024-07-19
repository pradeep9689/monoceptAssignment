<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page
	import="java.util.List,java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hr>
<form action="addStudent.jsp" method="get">
       
       
        <input type="submit" value="Add student" class="btn btn-secondary"  >
    </form>
    <form class="input-group" action="StudentControlller" method="get">
    <input type="hidden" name="command" value="search" />
    <div class="form-group">
      <select class="form-control" id="type" name="type" style="height:50px;">
        <option value="Id">Id</option>
        <option value="Name">Name</option>
       
        <option value="Email">Email</option>
      </select>
    </div>
    <div class="form-outline">
      <input type="search" id="input" name="input" style="height:50px;"class="form-control" placeholder="Search" />
    </div>
    <span class="input-group-append">
     <input type="submit" value=" search" class="btn btn-secondary"  >
        
      </button>
    </span>
  </form>
<table  class="table table-dark table-borderless">
		<tr>
			<td>Student ID</td>
			<td>Name</td>
			<td>Email</td>
			<td>Update    Delete</td>
			
			
		</tr>
		<c:forEach var="student" items="${theStudentList}">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.email}</td>
				<td>
				<a href="StudentControlller?command=load&id=${student.id}" class="btn btn-secondary">Update</a>
				<%-- <c:url var="updateLink" value="StudentControlller">
          <c:param name="command" value="load" />
          <c:param name="id" value="${student.id}" />
        </c:url> --%>
				<a href="StudentControlller?command=delete&id=${student.id}" class="btn btn-warning">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>