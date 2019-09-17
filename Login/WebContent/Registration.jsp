<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Epic Lanka</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<!-- This snippet uses Font Awesome 5 Free as a dependency. You can download it at fontawesome.io! -->

<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="">Login System</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="">Page 1-1</a></li>
          <li><a href="">Page 1-2</a></li>
          <li><a href="">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="">Page 2</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="Registration.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
  <div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Sign Up</h5>
            <form class="form-signin" action="Registration" method="POST">
              
              <div class="form-label-group">
    			<label for="inputEmail">First Name</label>
                <input type="text" id="firstName1" class="form-control" placeholder="first Name" name="firstName1" required autofocus>
              </div>
              
              <div class="form-label-group">
                <label for="middleName">Middle Name</label>
                <input type="text" id="middleName" class="form-control" placeholder="middleName" name= "middleName" required>
              </div>

              <div class="form-label-group">
                <label for="middleName">Last Name</label>
                <input type="text" id="lastName" class="form-control" placeholder="Last Name" name= "lastName" required>
              </div>
              
              <div class="form-label-group">
              	<label for="email">Email</label>
                <input type="email" id="email" class="form-control" placeholder="Email" name = "email" required>
              </div>
              
              <div class="form-label-group">
              	<label for="userId">UserId</label>
                <input type="text" id="userId" class="form-control" placeholder="UserId" name="userId" required>
              </div>
              <div class="form-label-group">
              	<label for="password">Password</label>
                <input type="password" id="middleName" class="form-control" placeholder="Password" name="password" required>
              </div>
              
              <div class="form-label-group">
              	<label for="role">Role</label>
                <input type="text" id="role" class="form-control" placeholder="role" name = "role" required>
              </div>
              
             
              <hr><hr>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">login</button>
              <hr class="my-4">
              
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>