<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Restaurants Application</title>
</head>
<body>
	<h1>Hello Welcome To Restaurants For you website</h1>

	<table bordercolor="green">
		<tr>
			<th>Restaurant Name</th>
			<th>Street</th>
			<th>City</th>
			<th>State</th>
			<th>Zip Code</th>
			<th>Hours Of Operation</th>
			<th>Rating</th>
		</tr>
		
	<tr>
		<td>${current.restaurantName}</td>
		<td>${current.street}</td>
		<td>${current.city}</td>
		<td>${current.state}</td>
		<td>${current.zipCode}</td>
		<td>${current.hoursOfOperation}</td>
		<td>${current.rating}</td>
	</tr>
	<c:forEach items="${restaurants}" var="current">
	</c:forEach>

	</table>

</body>
</html>