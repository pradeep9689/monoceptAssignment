<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Account Balance</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa; /* Light background color */
            padding: 20px;
        }
        .container {
            max-width: 600px; /* Max width for the container */
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
        .btn-link {
            font-size: 1rem;
            color: #007bff;
            text-decoration: none;
            padding: 10px 20px;
        }
        .btn-link:hover {
            color: #0056b3;
            text-decoration: underline;
        }
        .balance-info {
            font-size: 1.25rem;
            font-weight: bold;
            color: #28a745; /* Green color for balance */
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Your Account Balance</h2>
        <c:choose>
            <c:when test="${not empty balance}">
                <p class="balance-info">Your current balance is: ${balance}</p>
            </c:when>
            <c:otherwise>
                <p class="text-danger">Unable to retrieve balance. Please try again later.</p>
            </c:otherwise>
        </c:choose>
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
