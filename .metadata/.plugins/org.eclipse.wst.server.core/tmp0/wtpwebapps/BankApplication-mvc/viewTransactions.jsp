<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        .form-group {
            margin-bottom: 20px;
        }
        .table thead th {
            background-color: #007bff; /* Blue header background */
            color: #ffffff; /* White text color */
        }
        .btn-primary {
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>View Transactions</h1>
        <form action="BankController?action=viewTransactions" method="post">
            <div class="form-group">
                <label for="accountId">Account ID:</label>
                <input type="text" id="accountId" name="accountId" class="form-control" placeholder="Enter Account ID" required>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>

        <c:if test="${not empty transactions}">
            <br>
            <table class="table table-bordered">
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
        </c:if>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
