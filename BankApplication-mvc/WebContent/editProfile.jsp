<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit Profile</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="styles.css" rel="stylesheet">
    <style>
        .form-container {
            border: 1px solid #ddd;
            border-radius: 0.25rem;
            padding: 20px;
            margin-top: 30px;
            background-color: #f8f9fa; /* Light background for contrast */
        }

        .form-container h1 {
            border-bottom: 2px solid #007bff; /* Blue border under the heading */
            padding-bottom: 10px;
            margin-bottom: 20px;
            color: #007bff; /* Blue text color */
        }

        .form-group label {
            font-weight: bold; /* Bold labels */
        }

        .form-control {
            border-radius: 0.25rem; /* Rounded corners for input fields */
        }

        .btn, .btn-link {
            display: inline-block;
            padding: 10px 20px; /* Same padding for consistency */
            font-size: 1rem; /* Same font size */
            text-align: center;
            border-radius: 0.25rem; /* Same rounded corners */
        }

        .btn-primary {
            background-color: #007bff;
            border: 1px solid #007bff;
            color: #fff;
        }

        .btn-primary:hover {
            background-color: #0056b3; /* Darker blue on hover */
            border-color: #0056b3;
        }

        .btn-link {
            color: #007bff;
            background-color: transparent;
            border: 1px solid #007bff;
            text-decoration: none; /* Remove underline */
        }

        .btn-link:hover {
            color: #0056b3;
            background-color: #e9ecef;
            border-color: #0056b3;
        }

        .form-actions {
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="form-container">
            <h1>Edit Profile</h1>
            <form action="BankController" method="post">
                <input type="hidden" name="action" value="editProfile">
                <input type="hidden" name="customerId" value="${customer.customerId}">

                <div class="form-group">
                    <label for="first_name">First Name:</label>
                    <input type="text" id="first_name" name="firstName" class="form-control" value="${customer.firstName}">
                </div>

                <div class="form-group">
                    <label for="last_name">Last Name:</label>
                    <input type="text" id="last_name" name="lastName" class="form-control" value="${customer.lastName}">
                </div>

                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" class="form-control" value="${customer.password}">
                </div>

                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" class="form-control" value="${customer.email}">
                </div>

                <div class="form-group">
                    <label for="address">Address:</label>
                    <input type="text" id="address" name="address" class="form-control" value="${customer.address}">
                </div>

                <div class="form-group">
                    <label for="phone_number">Phone Number:</label>
                    <input type="text" id="phone_number" name="phoneNumber" class="form-control" value="${customer.phoneNumber}">
                </div>

                <div class="form-actions">
                    <button type="submit" class="btn btn-primary">Submit</button>
                   <form action="BankController" method="post">
            <button type="submit" name="action" value ="backCustomerHome"  class="btn btn-link">Back</button>
            </form>
                </div>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
