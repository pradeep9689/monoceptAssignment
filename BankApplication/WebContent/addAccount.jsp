<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Add Account</title>
</head>
<body>
 <h2>Add Account</h2>
    <form action="admin?action=addAccount" method="post">
        Customer ID: <input type="text" name="customerId" required><br>
        Initial Balance: <input type="text" name="balance" required><br>
        <input type="submit" value="Add Account">
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