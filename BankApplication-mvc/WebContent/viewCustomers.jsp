<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>View Customers</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa; /* Light background color */
            padding: 20px;
        }
        .container {
            max-width: 800px; /* Max width for the container */
            margin: auto;
            background-color: #ffffff; /* White background for the card */
            border-radius: 0.25rem;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Shadow for better visibility */
        }
        h2 {
            margin-bottom: 20px;
            color: #007bff; /* Blue text color */
        }
        .form-group {
            margin-bottom: 15px;
        }
        .btn-primary {
            margin-top: 10px;
        }
        .customer-info {
            margin-top: 20px;
        }
        .alert {
            margin-top: 20px;
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
    </style>
</head>
<body>
    <div class="container">
        <h2>Customer List</h2>
        <form action="BankController" method="post">
            <input type="hidden" name="action" value="viewCustomers">
            <div class="form-group">
                <label for="customer_id">Customer ID:</label>
                <input type="text" id="customer_id" name="customerId" class="form-control">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>

        <c:if test="${not empty customer}">
            <div class="customer-info">
                <h3>Customer Details</h3>
                <p><strong>Customer ID:</strong> ${customer.customerId}</p>
                <p><strong>First Name:</strong> ${customer.firstName}</p>
                <p><strong>Last Name:</strong> ${customer.lastName}</p>
                <p><strong>Email:</strong> ${customer.email}</p>
                <p><strong>Gender:</strong> ${customer.gender}</p>
                <p><strong>Address:</strong> ${customer.address}</p>
                <p><strong>Phone Number:</strong> ${customer.phoneNumber}</p>
            </div>
        </c:if>

        <c:if test="${param.success == 'false'}">
            <div class="alert alert-danger">
                Failed to fetch customer details. Please try again.
            </div>
        </c:if>

        <a href="BankController?action=viewAllcustomer" class="btn btn-link">View All Customer List</a>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
