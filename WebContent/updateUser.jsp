<%@  page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Map,java.util.HashMap"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/css/bootstrap-select.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/js/bootstrap-select.min.js"></script>


		<link href="${pageContext.request.contextPath}/style/bootstrap-4.2.1/dist/css/bootstrap.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update User Details</title>
		<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">Edit User Details </h1>
    <p class="lead">ABC Industry</p>
 <a href="allUsers">View All Users</a> | 
 <a href="AddUsers.html">Add User</a>
  </div>
</div>
	
	
	
</head>
<body>
	
	
<div class="container">
		<c:forEach items="${getUserByID}" var="u"> 

<form action="addUsers" method="post" >
	<div class="formgroup">
			<label for="exampleInputEmail1">Name</label>
		<div class="form-row">
			
    <div class="col">
		
      <input type="text" name="firstName" value="${u.firstName}" class="form-control" placeholder="First name">
    </div>
    <div class="col">
	
      <input type="text" name="lastName" value="${u.lastName}" class="form-control" placeholder="Last name">
    </div>
  </div></div>
	<br>

		<div class="form-row">
		<div class="col-2">
			<label   for="exampleInputEmail1">Gender</label>
			
			</div>
			<div class="col-3">
			<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="customRadioInline1" name="gender" value="M" class="custom-control-input">
  <label class="custom-control-label" name="gender" for="customRadioInline1">Male</label>
</div>

			
			</div>
			
			<div class="col-3">
			
				<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="customRadioInline2" name="gender" value="F" class="custom-control-input">
  <label class="custom-control-label"  for="customRadioInline2">Female</label>
</div>
			
			</div>
		
		
			
		</div>
			<br>
			
		<%
   Map<String, String> uType = new HashMap<String, String>();
   uType.put(request.getParameter("uType"), "selected");
   request.setAttribute("uType", uType);
%> 
		
	<div class="form-group">
			<label for="exampleInputEmail1">User Type : </label>
		<select name="uType">
  <option name="uType" value="Admin" ${uType.Admin}>Admin</option>
  <option name="uType"  value="Job Seeker"  ${uType.JobSeeker}>Job Seeker</option>
  <option name="uType" value="Job Consultant"  ${uType.JobConsultant}>Job Consultant</option>

</select>
  
		
		</div>
		
		
		
		<div class="form-group">
		
		Birthday:
  <input  class="form-control" name="date" value="${u.DOB}" type="date" name="bday">
 
		
		</div>
		
  <div class="form-group">
	 
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" value="${u.email}" id="email" name="email"  aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
		 
	  
	  
	 

	  
  </div>
  
  		<div class="form-group">
		
			  <label for="exampleInputPassword1">Username</label>
    <input type="password" class="form-control" value="${u.uName}" name="uName" placeholder="Password">
	  
	  
		
		
		</div>
  
		<div class="form-group">
		
			  <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" value="${u.pWord}" name="pWord" placeholder="Password">
	  
	  
		
		
		</div>
  
		
		<script>$('select').selectpicker();</script>
		
	<div class="form-group">
		<label for="exampleInputPassword1">Select Interested/Specialized Countries </label>
		<select name="Countries" class="selectpicker" multiple data-live-search="true">
  <option value="Sri Lanka" >Sri Lanka</option>
  <option value="Dubai"  >Dubai</option>
  <option value="Australia">Australia</option>
		<option value="England" >England</option>
		<option value="United States" >USA</option>
		<option value="Singapore" >Singapore</option>
</select>	
		
		</div>	
		
		
				<script>$('select').selectpicker();</script>
		
	<div class="form-group">
		<label for="exampleInputPassword1">Select Interested/Specialized Job Fields </label>
		<select name="Jobs" class="selectpicker" multiple data-live-search="true">
  <option value="Software Engineering">Software Engineering</option>
  <option value="Business Management">Business Management</option>
  <option value="Accounting">Accounting</option>
		<option value="Hospitality">Hospitality</option>
		<option value="Automobile">Automobile</option>
		<option value="Engineering">Engineering</option>
</select>	
		
		</div>	
		
		
		
   <div class="form-group">
    <div class="form-check">
      <input class="form-check-input is-invalid" type="checkbox" value="" id="invalidCheck3" required>
      <label class="form-check-label" for="invalidCheck3">
        Agree to terms and conditions
      </label>
      <div class="invalid-feedback">
        You must agree before submitting.
      </div>
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
	
</form>

   </c:forEach>
   
	
	
	</div>
 
</body>
</html>