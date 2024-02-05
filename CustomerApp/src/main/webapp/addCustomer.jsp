<%@ page language="java" session="true" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Customer Details | Customer Sync</title>
    	<link rel="stylesheet" type="text/css" href="addCustomer.css">
    	
    	<link rel="icon" type="image" href="man.png">
	</head>
	<body>
		<p>Customer Details</p>
	    <div class="details">
	        <div class="form">
	            <form action="addCustomer" method="get">
	                <input type="text" name="firstname" placeholder="First Name" id="text-box" required>
	                <input type="text" name="lastname" placeholder="Last Name" id="text-box" required><br>
	                <input type="text" name="street" placeholder="Street" id="text-box" required>
	                <input type="text" name="address" placeholder="Address" id="text-box" required><br>
	                <input type="text" name="city" placeholder="City" id="text-box" required>
	                <input type="text" name="state" placeholder="State" id="text-box" required><br>
	                <input type="email" name="email" placeholder="Email" id="text-box" required>
	                <input type="tel" name="phone" placeholder="Phone" id="text-box" required><br>
	                <input type="submit" name="submit" id="submit">
	            </form>
	        </div>
	    </div>
	</body>
</html>