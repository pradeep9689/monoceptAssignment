<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Transfer Amount</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa; /* Light background color */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .transfer-container {
            background-color: #ffffff; /* White background for the card */
            border-radius: 0.25rem;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Shadow for better visibility */
            width: 100%;
            max-width: 400px; /* Max width for the form container */
        }
        .transfer-container h1 {
            margin-bottom: 20px;
            color: #007bff; /* Blue text color */
        }
        .form-group label {
            font-weight: bold; /* Bold labels */
        }
        .btn-primary {
            width: 100%; /* Full width button */
            padding: 10px;
        }
    </style>
</head>
<body>
    <div class="transfer-container">
        <h2>Transfer Amount</h2>
        <form action="BankController?action=transferAmount" method="post">
            <div class="form-group">
                <label for="toAccountId">Recipient Account ID:</label>
                <input type="number" id="toAccountId" name="toAccountId" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="amount">Amount:</label>
                <input type="number" step="0.01" id="amount" name="amount" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary">Transfer</button>
        </form>
          <form action="BankController" method="post">
            <button type="submit" name="action" value ="backCustomerHome"  class="btn btn-link">Back</button>
            </form>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
