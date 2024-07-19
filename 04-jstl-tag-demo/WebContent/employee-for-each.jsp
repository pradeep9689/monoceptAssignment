<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page
	import="java.util.List,java.util.ArrayList,com.monocept.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Employee> emplyees = new ArrayList<Employee>();
	emplyees.add(new Employee(1, "Pradeep", 10000));
	emplyees.add(new Employee(2, "Shankar", 20000));
	emplyees.add(new Employee(3, "Prateek", 30000));
	emplyees.add(new Employee(4, "Manvendra", 40000));
	emplyees.add(new Employee(5, "Suyash", 50000));
	pageContext.setAttribute("EmployeeList", emplyees);
	%>
	<table border="1">
    <tr>
        <td>Emp ID</td>
        <td>Name</td>
        <td>Salary</td>
    </tr>
    <c:forEach var="emp" items="${EmployeeList}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.salray}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>