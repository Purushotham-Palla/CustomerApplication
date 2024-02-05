<%@page import="java.util.Scanner"%>
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
		Scanner sc=new Scanner(System.in);
			Connection connection = null;
			String choice=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			
			
		 	String sql = "INSERT into `Girls` (`id`,`name`) values (?,?)";
			PreparedStatement pst = connection.prepareStatement(sql);//not in loop one is enough not to run everytime
			
			do {
				System.out.println("enter Id");
				int id = sc.nextInt();
				System.out.println("enter name");
				String name = sc.next();
								
				
				pst.setInt(1,id);
				pst.setString(2,name);
				
				
				pst.executeUpdate();/*on preparedStatement you are already mentioned (sql) no need to write here and we are not 
									 mentioned in create execute so */
				System.out.println("do you like to add more details (yes/no ???)");
				choice=sc.next();
				
			} while (choice.equals("yes"));
			
//				statement.addBatch(sql1);
//				statement.addBatch(sql2);
//				statement.addBatch(sql3);
//				
//				statement.addBatch(sql4);
//				int[] ar = statement.executeBatch();//it return all four values in one array
//				for(int i =0;i<ar.length;i++)
//				{
//					System.out.println(ar[i]+" ");
//				}
			System.out.println();
			
			
		}
		catch(ClassNotFoundException |SQLException e)
		{
			out.println("An error occured");
		}
		
		%>
		The Insertion a Records is done.
	
	</body>
</html>