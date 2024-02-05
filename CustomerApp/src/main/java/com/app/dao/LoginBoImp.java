package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.app.models.Login;

public class LoginBoImp implements LoginBo {
	private static Connection connection=null;
	private static PreparedStatement prepareStatement;
	private static Statement statement;
	private static ResultSet res;
	
	
	
	private final static String GET_One_QUERY = "SELECT * FROM  `login` WHERE `login-id`=? AND `password`=?";
	
	
	
	
//	public static void main(String[] args) {
//		
//		LoginBoImp lob = new LoginBoImp();
//		
//		 ArrayList<Login> loginList = lob.login();
////		 new 
////		 Login log = loginList.get(0);
////		 System.out.println(log.getId()); 
////		 System.out.println(log.getPassword());
////		 System.out.println(loginList.get(0));
//		 
//	}
	
	public LoginBoImp() {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerapp","root","root");
				
				
				
				
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			

	 }
	
	

//	@Override
//	public int login() {
//		// TODO Auto-generated method stub
//		
//		return 0;
//	}
	
	/*
	public ArrayList<Login> login() {
		 
		 
		 ArrayList<Login> loginList = new ArrayList<Login>();
//		 Object[] loginList = new Object[1];
		 String password=null;
		 int id=0;
		 
		 
		 try {
			statement = connection.createStatement();
			
			 res = statement.executeQuery(GET_QUERY);
//			 res.getInt("id");
//			 id = Integer.toString(res.getInt("Login-id"));
//			 password = res.getString("password");
			 
			 
			 
			 while(res.next())
			 {
				id = res.getInt("login-id");
				password = res.getString("password");
				 
				 
				 
				 Login e = new Login(id, password);
				 
				 loginList.add(e);
//				 loginList[1]=e;
				 
				 break;
			 }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
//		 System.out.println(id);
//		 System.out.println(loginList.get(0));
//		 System.out.println(password);
		 
		return loginList;
		 
		
//		return employeeList;
	
	
	}
	*/
	public Login getLogin(String loginId,String password)
	{
		Login log=null;
		
		try {
			
			prepareStatement=connection.prepareStatement(GET_One_QUERY);
			prepareStatement.setString(1, loginId);
			prepareStatement.setString(2, password);
			ResultSet res = prepareStatement.executeQuery();
			
			if(res.next())
			{
				loginId = res.getString("login-id");
				 password = res.getString("password");
				 log=new Login(loginId,password);
				 
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return log;
		
	}
	
	

	
	
}

