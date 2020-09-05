<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
	<!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<title>Register user</title>
</head>
<body>
<form action="registerUser" method="post">
  Fist Name: <input type="text" name= "firstName"/>
  Last Name: <input type="text" name="lastName"/>
  User Name: <input type="text" name="email"/>
  Password:  <input type="password" name="password"/>
  Confirm password:<input type="password" name="Confirmpassword"/>
  <input type="submit" value ="register"/>
</form>
</body>
</html>