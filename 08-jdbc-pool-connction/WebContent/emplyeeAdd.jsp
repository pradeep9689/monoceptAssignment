<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hr>
<div class="container">
 <h2>Manage Employee</h2>
    <form action="EmployeeServlet" method="get">
        <label for="emp_id">Employee ID:</label><br>
        <input type="text" id="emp_id" name="emp_id" required><br>
        <label for="emp_name">Name:</label><br>
        <input type="text" id="emp_name" name="emp_name"><br>
        <label for="emp_mail">Email:</label><br>
        <input type="text" id="emp_mail" name="emp_mail"><br>
        <label for="salary">Salary:</label><br>
        <input type="text" id="salary" name="salary"><br><br>
        <input type="hidden" id="action" name="action" value="add">
        <input type="submit" class="btn btn-secondary"  >
    </form>
    </div>
</body>
</html>