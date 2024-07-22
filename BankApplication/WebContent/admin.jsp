<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <title>Admin Dashboard</title>
</head>
<body>
<h1>Admin Dashboard</h1>
    <form action="admin/addCustomer" method="post">
        <h2>Add Customer</h2>
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required><br>
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>
        <label for="gender">Gender:</label>
        <input type="radio" id="male" name="gender" value="Male" required> Male
        <input type="radio" id="female" name="gender" value="Female" required> Female<br>
        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br>
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" id="phoneNumber" name="phoneNumber" required><br>
        <button type="submit">Add Customer</button>
    </form>

    <form action="admin/addAccount" method="post">
        <h2>Add Account</h2>
        <label for="customerId">Customer ID:</label>
        <input type="text" id="customerId" name="customerId" required><br>
        <label for="balance">Initial Balance:</label>
        <input type="text" id="balance" name="balance" required><br>
        <button type="submit">Add Account</button>
    </form>

    <form action="admin/viewCustomer" method="get">
        <h2>View Customer</h2>
        <label for="customerId">Customer ID:</label>
        <input type="text" id="customerId" name="customerId" required><br>
        <button type="submit">View Customer</button>
    </form>

    <form action="admin/viewTransaction" method="get">
        <h2>View Transactions</h2>
        <label for="accountId">Account ID:</label>
        <input type="text" id="accountId" name="accountId" required><br>
        <button type="submit">View Transactions</button>
    </form>

    <c:if test="${not empty message}">
        <p style="color:green;">${message}</p>
    </c:if>
    <c:if test="${not empty error}">
        <p style="color:red;">${error}</p>
    </c:if>
</body>
</html>