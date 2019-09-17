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
  <div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Sign Up</h5>
            <form class="form-signin">
              
              <div class="form-label-group">
    			<label for="inputEmail">First Name</label>
                <input type="text" id="firstName1" class="form-control" placeholder="first Name" name="firstName1" required autofocus>
              </div>

              <div class="form-label-group">
                <label for="middleName">Last Name</label>
                <input type="text" id="lastName" class="form-control" placeholder="Last Name" required>
              </div>
              
              <div class="form-label-group">
              	<label for="email">Email</label>
                <input type="email" id="email" class="form-control" placeholder="Email" required>
              </div>
              
              <div class="form-label-group">
              	<label for="userId">UserId</label>
                <input type="text" id="userId" class="form-control" placeholder="UserId" required>
              </div>
              <div class="form-label-group">
              	<label for="password">Password</label>
                <input type="password" id="middleName" class="form-control" placeholder="Password" required>
              </div>
              
              <div class="form-label-group">
              	<label for="role">Role</label>
                <input type="text" id="role" class="form-control" placeholder="role" required>
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