<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Customer</title>
</head>
<body>
 <form action="BankController" method="post">
        <input type="hidden" name="action" value="addCustomer">
        <label>First Name: <input type="text" name="firstName"></label><br>
        <label>Last Name: <input type="text" name="lastName"></label><br>
        <label>Email: <input type="text" name="email"></label><br>
        <label>Password: <input type="password" name="password"></label><br>
        <input type="submit" value="Submit">
        <input type="reset" value="Cancel">
    </form>
</body>
</html>