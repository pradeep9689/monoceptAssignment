<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Home</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    
    <style>
        body {
            font-family: 'Open Sans', sans-serif;
            background: url('https://images.unsplash.com/photo-1506748686214e9df14f1f7e8d28b8d2e0e4f1a12d0?fit=crop&w=1900&h=1200') no-repeat center center fixed;
            background-size: cover;
            margin: 0;
            padding: 0;
            color: #000000; /* Ensure text is readable */
        }
        .container {
            background-color: rgba(14, 146, 255, 0.9); /* Slightly more opaque for better readability */
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        .mt-5 {
            margin-top: 3rem;
        }
        .navbar {
            margin-bottom: 20px;
        }
        .navbar a {
            color: #6ef102;
            padding: 10px;
            text-decoration: none;
        }
        .card {
            box-shadow: 0 4px 8px rgba(183, 4, 4, 0.97);
        }
        .btn-custom {
            margin: 5px;
            width: 100%;
            text-align: center;
        }
        .welcome-header {
            color: #8A2BE2;
            text-align: center;
            padding: 20px;
            background-color: #FFD700; /* Dark background for text readability */
            border-radius: 8px;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <div class="welcome-header">
            <h2>Welcome Admin</h2>
        </div>
        <div class="card p-4 mt-4">
            <h4 class="card-title">Admin Panel</h4>
            <div class="list-group">
            <form action="BankController">
                <button type="submit" name="action" value="viewCustomersPage" class="list-group-item list-group-item-action btn btn-primary btn-custom">View Customers</button>
                <button type="submit" name="action" value="addCustomerPage" class="list-group-item list-group-item-action btn btn-secondary btn-custom">Add Customer</button>
                <button type="submit" name="action" value="addAccountPage" class="list-group-item list-group-item-action btn btn-success btn-custom">Add Account</button>
                <button type="submit" name="action" value="viewTransactionsPage" class="list-group-item list-group-item-action btn btn-info btn-custom">View Transactions</button>
              
                <button type="submit" name="action" value="logout" class="list-group-item list-group-item-action btn btn-danger btn-custom">Logout</button>
               
                </form>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
