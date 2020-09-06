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
<h2>Find Flights:</h2>
<form action="findFlights"  method="post">
    From: <input type="text" name="departureCity"/>
    </br>
    to: <input type="text" name="arrivalCity"/>
    </br>
    Departure date: <input type="text" name="departureDate">
    </br>
    <input type="submit" value ="search"/>
    </br>
</form>
</body>
</html>