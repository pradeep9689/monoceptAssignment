<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>View Transactions</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa; /* Light background color */
            padding: 20px;
        }
        .container {
            max-width: 900px; /* Max width for the container */
            margin: auto;
            background-color: #ffffff; /* White background for the card */
            border-radius: 0.25rem;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Shadow for better visibility */
        }
        h1 {
            margin-bottom: 20px;
            color: #007bff; /* Blue text color */
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table th, table td {
            border: 1px solid #dee2e6;
            padding: 10px;
            text-align: left;
        }
        table th {
            background-color: #007bff;
            color: #ffffff;
        }
        .btn-link {
            display: inline-block;
            padding: 10px 20px;
            font-size: 1rem;
            text-align: center;
            border-radius: 0.25rem;
            color: #007bff;
            background-color: transparent;
            border: 1px solid #007bff;
            text-decoration: none; /* Remove underline */
        }
        .btn-link:hover {
            background-color: #e9ecef;
            border-color: #0056b3;
            color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Passbook</h2>
        
        <c:if test="${not empty transactions}">
            <table class="table">
                <thead>
                    <tr>
                        <th>Transaction ID</th>
                        <th>Account ID</th>
                        <th>Amount</th>
                        <th>Type</th>
                        <th>Date</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="transaction" items="${transactions}">
                        <tr>
                            <td>${transaction.transactionId}</td>
                            <td>${transaction.accountId}</td>
                            <td>${transaction.amount}</td>
                            <td>${transaction.type}</td>
                            <td>${transaction.date}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <form action="BankController" method="post">
            <button type="submit" name="action" value ="backCustomerHome"  class="btn btn-link">Back</button>
            </form>
        </c:if>
        
       <form action="BankController" method="post">
            <button type="submit" name="action" value ="viewTransactionPage"  class="btn btn-link">Search By Date</button>
            </form>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
