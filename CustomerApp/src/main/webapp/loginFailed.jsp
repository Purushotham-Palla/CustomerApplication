<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login | Customer Sync</title>
		<link rel="icon" type="image/png" href="boy.png">
		<link rel="stylesheet" href="login.css ">
		
	</head>
	<body>
		
		<div class="backgro">
        <div class="login-details">
            
            <div class="details">
                
                <h2 id="login">Login</h2>
                <br>
                <form action="">
					<p style="color:#787878; text-decoration: none">Login Failed Try again <button ><a style="text-decoration: none" href="login.jsp">Ok</a></button></p><br>
					
                    <!-- <input type="text" id="username" name="username" required> -->
                    <input type="text"  placeholder="Login id" name="login-id"id="text-box" ><br><br>
                    <input type="password" required placeholder="Password" name="password" id="text-box"><br><br>
                    <input type="submit"  id="submit" >
                  </form>
                
            </div>
            
        </div>
        </div>
	</body>
</html>