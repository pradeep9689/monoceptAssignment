<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Transactions</title>
</head>
<body>
<h2>Transaction History</h2>
    <c:if test="${not empty transactions}">
        <table border="1">
            <tr>
                <th>Transaction ID</th>
                <th>Sender Account ID</th>
                <th>Receiver Account ID</th>
                <th>Amount</th>
                <th>Type</th>
                <th>Date</th>
            </tr>
            <c:forEach var="transaction" items="${transactions}">
                <tr>
                    <td>${transaction.transactionId}</td>
                    <td>${transaction.senderAccountId}</td>
                    <td>${transaction.receiverAccountId}</td>
                    <td>${transaction.amount}</td>
                    <td>${transaction.type}</td>
                    <td>${transaction.date}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <c:if test="${not empty error}">
        <p style="color: red;">${error}</p>
    </c:if>
</body>
</html>