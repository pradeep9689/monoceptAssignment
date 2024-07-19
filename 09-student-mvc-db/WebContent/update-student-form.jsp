<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>s
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<div class="container">
<div class ="text-center">
 <h2>Update Student</h2>
 </div>
 <hr>
    <form action="StudentControlller" method="get">
       
       
         <input type="hidden" name="command" value="update"> 
         <input type="hidden" name="id" value="${theStudent.id}">
      
        <label for="name" class="form-label"> Name</label> <input
          type="text" class="form-control" id="first_name" name="name"
          value="${theStudent.name}">
      
   
     
        <label for="email" class="form-label">Email address</label> <input
          type="email" class="form-control" id="email" name="email"
          value="${theStudent.email}">
     
<input type="submit" value="Update student" class="btn btn-secondary"  >
     
      
    </form>
    </div>
</body>
</html>