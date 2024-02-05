<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CustomerList | Customer sync</title>
<link rel="icon" type="image" href="man.png">
<link rel="stylesheet" href="customerlist.css">

</head>
<body>



	<div class="customerlist">
		<h1>Customer List</h1>
		
		
			<button id="button1" style=" margin-left: 84rem;">
				<a href="logout">LogOut</a>
			</button>

		<p id="status">status</p>
		<div class="elements">
			<button>
				<a href="addCustomer.jsp">Add Customer</a>
			<!-- 	<a href="addCustomer.jsp">Add Customer</a>-->
			</button>
			<!-- <button><a href="">Search</a></button> -->

			<div class="search">
				<select name="status">
					<option value="">Search by</option>
					<option value="firstname">Firstname</option>
					<option value="city">City</option>
					<option value="email">Email</option>
					<option value="phone">Phone</option>
				</select>
				<!-- <div class="add-icon"> -->
				<input type="search" id="search-in" placeholder="Sam"><img
					src="search-icon.png" height="20px" width="20px" alt="">

				<!-- </div> -->
			</div>
		</div>

		<!-- <div class="nav-search ">
            <select class="search-select">
                <option>All</option>
                <input placeholder="Search Amazon" class="search-input">
                <div class="add-iconed">
                    <i class="fa-solid fa-magnifying-glass"></i>
                </div>
            </select>
        </div> -->



	</div>
</body>
</html>