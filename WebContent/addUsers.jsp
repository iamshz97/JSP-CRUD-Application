<%@  page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Map,java.util.HashMap"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="ISO-8859-1">
<title>Add Users</title>
	  <!-- ... -->

	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/css/bootstrap-select.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/js/bootstrap-select.min.js"></script>


	
<link href="${pageContext.request.contextPath}/style/bootstrap-4.2.1/dist/css/bootstrap.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">Add Users</h1>
    <p class="lead">ABC Industry</p>
	  <a href="allUsers">View All Users</a>
  </div>
</div>
</head>
<body>
 
 
 
<div class="container">

	
	<form action="addUsers" method="post">
		
		<div class="formgroup">
			<label for="exampleInputEmail1">Name</label>
		<div class="form-row">
			
    <div class="col">
		
      <input type="text" name="firstName" class="form-control" placeholder="First name" important>
    </div>
    <div class="col">
	
      <input type="text" name="lastName" class="form-control" placeholder="Last name">
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
		
		
			<div class="form-row">
		<div class="col-2">
			<label   for="exampleInputEmail1">User Type</label>
			
			</div>
			<div class="col-3">
			<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="usertypeid1" name="uType" value="Job Consultant" class="custom-control-input">
  <label class="custom-control-label" name="gender" for="usertypeid1">Job Consultant</label>
</div>

			
			</div>
			
			<div class="col-3">
			
				<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="usertypeid2" name="uType" value="Job Seeker" class="custom-control-input">
  <label class="custom-control-label"  for="usertypeid2">Job Seeker</label>
</div>
			
			</div>
		
		
				<div class="col-3">
			
				<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="usertypeid3" name="uType" value="Admin" class="custom-control-input">
  <label class="custom-control-label"  for="usertypeid3">Admin</label>
</div>
			
			</div>
		
		</div>
		
		
		
	<br>
		
		
		<div class="form-group">
		
		Birthday:
  <input  class="form-control" name="date" type="date" name="bday">
 
		
		</div>
		
  <div class="form-group">
	 
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="email" name="email"  aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
		 
	  
	  
	 

	  
  </div>
  
  		<div class="form-group">
		
			  <label for="exampleInputPassword1">Username</label>
    <input type="password" class="form-control" name="uName" placeholder="Password">
	  
	  
		
		
		</div>
  
		<div class="form-group">
		
			  <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" name="pWord" placeholder="Password">
	  
	  
		
		
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
</div>

</body>
</html>