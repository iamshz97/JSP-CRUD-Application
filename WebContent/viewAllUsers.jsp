<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link href="${pageContext.request.contextPath}/style/bootstrap-4.2.1/dist/css/bootstrap.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">Manage Users</h1>
    <p class="lead">ABC Industry</p>
	 
<a href="addUsers.jsp">Add Users</a>
  </div>
</div>
<title>View All Users</title>
</head>
<body>

<div class="container"><table class="table" cellpadding="10">  <thead class="thead-dark">
	<tr>
		<th>User ID</th>	
		<th>First Name</th>	
		<th>Last Name</th>	
		<th>Email Address</th>	
		<th>DOB</th>	
		<th>Gender</th>	
			
		<th>User Type</th>	
		<th>User Status</th>	

	
	</tr></thead>
	<c:forEach items="${viewAllUsers}" var="u"> 
		<tr>
			<th scope="row">${u.userID}</th>
			<td>${u.firstName}</td>
			<td>${u.lastName}</td>
			<td>${u.email}</td>
			<td>${u.DOB}</td>
			<td>${u.gender}</td>
		
			<td>${u.uType}</td>
			<td>Available</td>
			
			
			<td>
				<a href="edit?id=${u.userID}">Edit</a>
				<a href="delete?id=${u.userID}">Delete</a>
				<a href="disable?id=${u.userID}">Disable</a>
			
			</td>
			
		</tr>
		</c:forEach>
		<tr>

		
		
		
		</tr>
		
</table></div>

</body>
</html>