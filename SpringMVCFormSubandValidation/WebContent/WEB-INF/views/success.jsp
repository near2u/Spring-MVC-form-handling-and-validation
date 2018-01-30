<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./">Back</a>
<table> 
	<caption>List of Users</caption>
	<tr>
		<th>Name </th>
		<th>Email </th>
		<th>Age </th>
		<th>Country</th>
	</tr>
	<html:forEach var="user" items="${userList }">
	<tr>
			<td>${user.name }</td>
			<td>${user.email }</td>
			<td>${user.age }</td>
			<td>${user.country }</td>
		</tr>
	</html:forEach>
		
		</table>
</body>
</html>