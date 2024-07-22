<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Dashboard</title>
</head>
<body>
 <h1>Welcome, ${customer.firstName}</h1>
    <h2>Account Details</h2>
    <p>Account ID: ${account.accountId}</p>
    <p>Balance: ${account.balance}</p>

    <h2>New Transaction</h2>
    <form action="customer/newTransaction" method="post">
        <label for="amount">Amount:</label>
        <input type="number" id="amount" name="amount" step="0.01" required>
        <br>
        <label for="type">Type:</label>
        <select id="type" name="type">
            <option value="deposit">Deposit</option>
            <option value="withdrawal">Withdrawal</option>
        </select>
        <br>
        <button type="submit">Submit</button>
    </form>

    <h2>Transfer Funds</h2>
    <form action="customer/transfer" method="post">
        <label for="receiverAccountId">Receiver Account ID:</label>
        <input type="number" id="receiverAccountId" name="receiverAccountId" required>
        <br>
        <label for="amount">Amount:</label>
        <input type="number" id="amount" name="amount" step="0.01" required>
        <br>
        <button type="submit">Transfer</button>
    </form>

    <h2>Transactions</h2>
    <a href="customer/viewTransactions">View Transactions</a>
    
    <c:if test="${not empty message}">
        <p>${message}</p>
    </c:if>
    <c:if test="${not empty error}">
        <p style="color:red">${error}</p>
    </c:if>
</body>
</html>