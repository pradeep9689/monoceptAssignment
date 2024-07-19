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
 <title>View Transactions</title>
</head>
<body>
 <h2>Transaction List</h2>
    <table border="1">
        <tr>
            <th>Transaction ID</th>
            <th>Sender Account No</th>
            <th>Receiver Account No</th>
            <th>Type</th>
            <th>Amount</th>
            <th>Date</th>
        </tr>
        <c:forEach var="transaction" items="${transactions}">
            <tr>
                <td>${transaction.transactionId}</td>
                <td>${transaction.senderAccNo}</td>
                <td>${transaction.receiverAccNo}</td>
                <td>${transaction.type}</td>
                <td>${transaction.amount}</td>
                <td><fmt:formatDate value="${transaction.date}" pattern="dd/MM/yyyy"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>