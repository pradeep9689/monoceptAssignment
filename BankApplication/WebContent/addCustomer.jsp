<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Add Customer</title>
</head>
<body>
 <h2>Add Customer</h2>
    <form action="admin?action=addCustomer" method="post">
        First Name: <input type="text" name="firstName" required><br>
        Last Name: <input type="text" name="lastName" required><br>
        Email: <input type="email" name="email" required><br>
        Password: <input type="password" name="password" required><br>
        Gender: <input type="radio" name="gender" value="Male" required> Male
                <input type="radio" name="gender" value="Female" required> Female<br>
        Address: <input type="text" name="address" required><br>
        Phone Number: <input type="text" name="phoneNumber" required><br>
        <input type="submit" value="Add Customer">
    </form>
    <br>
    <c:if test="${not empty error}">
        <p style="color: red;">${error}</p>
    </c:if>
    <c:if test="${not empty message}">
        <p style="color: green;">${message}</p>
    </c:if>
</body>
</html>