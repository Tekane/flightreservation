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
    <title>Complete Reservation</title>
</head>
<body>
<h2>Complete Reservation</h2>
 AirLine: ${flight.operatingAirlines}<br/>
 Departure City: ${flight.departureCity}<br/>
 Arrival City: ${flight.arrivalCity}<br/>
<form action="completeReservation" method="post">
    <pre>
    <h2>Passenger Details:</h2>
    First Name:<input type="text" name="passengerFirstName"/>
    Last Name:<input type="text" name="passengerLastName"/>
    Email:<input type="text" name="passengerEmail"/>
    Phone:<input type="text" name="passengerPhone"/>

    <h2>Card Details:</h2>
    Card holder name:<input type="text" name="cardHolderName"/>
    Card No:<input type="text" name="cardNumber"/>
    Expiry Date:<input type="text" name="expirationDate"/>
    CCV Code:<input type="text" name="securityCode"/>
        <input type="hidden" name="flightId" value="${flight.id}">
    <input type="submit" value="confirm"/>
    </pre>
</form>
</body>
</html>