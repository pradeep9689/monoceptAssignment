<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="Drashan"></c:set>
	<h2>welcome ${name }</h2>
	<c:if test="${name.length()>=5}">
		<h2>name ${name } is 5 or more long</h2>

	</c:if>
	<c:choose>
		<c:when test="${name=='pradeep'}">
	your name is pradeep
	</c:when>
		<c:when test="${name=='satish'}">
	your name is satish
	</c:when>
		<c:otherwise>
	i dont know
	</c:otherwise>

	</c:choose>


</body>
</html>