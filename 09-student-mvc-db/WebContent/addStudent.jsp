<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
<div class ="text-center">
 <h2>Add Student</h2>
 </div>
 <hr>
    <form action="StudentControlller" method="get">
       
       
        <label for="name">Name:</label><br>
        <input type="text" name="student_name"><br>
        <label for="mail">Email:</label><br>
        <input type="text"  name="student_mail"><br>
        <input type="hidden"  name="command" value="add"/><br>
        <input type="submit" class="btn btn-secondary"  >
    </form>
    </div>
</body>
</html>