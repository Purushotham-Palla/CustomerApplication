<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insertion</title>
	</head>
	<body>
		<h1>Insertion a Records</h1>
		<%
			Connection connection = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			Statement statement = connection.createStatement();
			
			String query = "INSERT into `Girls` (`id`,`name`) values (4,'Radha')";
			
			
		 	int i = statement.executeUpdate(query);
		 	out.println(i);
			
			
		}
		catch(ClassNotFoundException |SQLException e)
		{
			out.println("An error occured");
		}
		
		%>
		The Insertion a Records is done.
	
	</body>
</html>