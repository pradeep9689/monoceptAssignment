<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Customer Details</title>
</head>
<body>
  <h2>Customer Details</h2>
    <c:if test="${not empty customer}">
        <p>Customer ID: ${customer.customerId}</p>
        <p>First Name: ${customer.firstName}</p>
        <p>Last Name: ${customer.lastName}</p>
        <p>Email: ${customer.email}</p>
        <p>Gender: ${customer.gender}</p>
        <p>Address: ${customer.address}</p>
        <p>Phone Number: ${customer.phoneNumber}</p>
    </c:if>
    <c:if test="${not empty error}">
        <p style="color: red;">${error}</p>
    </c:if>
</body>
</html>