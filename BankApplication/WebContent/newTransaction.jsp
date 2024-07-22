<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <title>New Transaction</title>
</head>
<body>
<h2>New Transaction</h2>
    <form action="customer?action=newTransaction" method="post">
        Sender Account ID: <input type="text" name="senderAccountId" required><br>
        Receiver Account ID: <input type="text" name="receiverAccountId" required><br>
        Amount: <input type="text" name="amount" required><br>
        Type: <input type="radio" name="type" value="deposit" required> Deposit
              <input type="radio" name="type" value="withdrawal" required> Withdrawal
              <input type="radio" name="type" value="transfer" required> Transfer<br>
        <input type="submit" value="Submit Transaction">
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