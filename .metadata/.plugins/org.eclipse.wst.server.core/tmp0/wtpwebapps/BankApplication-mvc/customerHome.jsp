<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Customer Home</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom Styles -->
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
   
       
 
        <h2 class="welcome-header">Welcome ${sessionScope.customer.firstName} ${sessionScope.customer.lastName}</h2>
        <div class="card p-4 mt-4">
            <h4 class="card-title">Customer Panel</h4>
            <div class="list-group">
        <nav>
            <ul class="list-group">
                <li class="list-group">
                    <a  class="list-group-item list-group-item-action btn btn-primary btn-custom" href="BankController?action=passbook&accountId=${sessionScope.customer.customerId}">PassBook</a>
                </li>
                <form >
                <li class="list-group">
                    <button type="submit" name="action" value="editProfilePage" class="list-group-item list-group-item-action btn btn-primary btn-custom" >Edit Profile</a>
                </li></form>
                <li class="list-group">
                    <a  class="list-group-item list-group-item-action btn btn-primary btn-custom" href="newTransaction.jsp?accountId=${sessionScope.customer.customerId}">New Transaction</a>
                </li>
                
                <li class="list-group">
                    <a  class="list-group-item list-group-item-action btn btn-primary btn-custom" href="BankController?action=checkBalance&accountId=${sessionScope.customer.customerId}">Check Account Balance</a>
                    
                </li>
                <li class="list-group">
                <form action="BankController" method="post">
                    <button name="action" value="transferPage" class="list-group-item list-group-item-action btn btn-primary btn-custom" >Transfer to account</button>
                </form></li>
               
                
            </ul>
        </nav>
         
                <form action="logout" method="get">
                   <button type="submit" class="text-danger">Logout<button>
               </form> 
    </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>