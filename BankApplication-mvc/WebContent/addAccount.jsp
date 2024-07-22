<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Bank Account</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="styles.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Add Bank Account</h1>
        <form action="BankController" method="post">
            <input type="hidden" name="action" value="addAccount">
            
            <div class="form-group">
                <label for="customer_id">Customer ID:</label>
                <input type="text" class="form-control" id="customer_id" name="customerId">
            </div>
            
            <div class="form-group">
                <label for="initial_balance">Initial Balance:</label>
                <input type="text" class="form-control" id="initial_balance" name="initialBalance">
            </div>
            
            <button type="submit" class="btn btn-primary">Submit</button>
            <a href="adminHome.jsp" class="btn btn-secondary">Back</a>
        </form>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
