<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>New Transaction</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f8f9fa; /* Light background color */
        }
        .transaction-container {
            border: 1px solid #ddd;
            border-radius: 0.25rem;
            padding: 20px;
            background-color: #ffffff; /* White background for form */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Shadow for better visibility */
            width: 100%;
            max-width: 400px; /* Max width for form container */
        }
        .transaction-container h1 {
            margin-bottom: 20px;
            color: #007bff; /* Blue text color */
        }
        .form-group label {
            font-weight: bold; /* Bold labels */
        }
        .form-control {
            border-radius: 0.25rem; /* Rounded corners for input fields */
        }
        .btn-primary {
            width: 100%; /* Full width button */
            padding: 10px;
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
    <div class="transaction-container">
        <h2>Debit and Credit</h2>
        <form action="BankController?action=newTransaction&accountId=${sessionScope.customer.customerId}" method="post">
            <div class="form-group">
                <label for="amount">Amount:</label>
                <input type="text" id="amount" name="amount" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="type">Type:</label>
                <select name="type" id="type" class="form-control">
                    <option value="deposit">Deposit</option>
                    <option value="withdrawal">Withdrawal</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
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
