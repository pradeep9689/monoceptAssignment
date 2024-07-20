<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page
	import="java.util.List,java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>Customer Home</title>
</head>
<body>
<h2>Welcome ${sessionScope.customer.firstName} ${sessionScope.customer.lastName}</h2>
    <nav>
        <ul>
            <li><a href="BankController?action=viewTransactions&accountId=${sessionScope.customer.customerId}">View Transactions</a></li>
            <li><a href="editProfile.jsp">Edit Profile</a></li>
            <li><a href="newTransaction.jsp">New Transaction</a></li>
            <li><a href="login.jsp">Logout</a></li>
        </ul>
    </nav>
</body>
</html>