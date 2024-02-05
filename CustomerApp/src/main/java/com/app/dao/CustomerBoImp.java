package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.app.models.Customer;

public class CustomerBoImp implements CustomerBo {
	private static Connection connection=null;
	private static PreparedStatement prepareStatement;
//	private static Statement statement;
	private static ResultSet res;
	private final static String INSERT_QUERY = "INSERT into `customerdetails`(`firstname`,`lastname`,`street`,`address`,`city`,`state`,`email`,`phone`) values(?,?,?,?,?,?,?,?)";
//	 																	firstname,  lastname,  street,  address,  city,  state, email,  phone
	private final static String UPDATE_QUERY = "UPDATE `customerdetails` SET firstname=?,lastname=?, street = ?, address = ?,  city = ?, state = ?, email = ?, phone = ? WHERE id = ?";
	private final static String GET_ALL_QUERY = "SELECT * FROM  `customerdetails`";
	
	
	private final static String DELETE_QUERY = "DELETE from `customerdetails` WHERE `id` = ?";
	private final static String GET_ONE_QUERY = "SELECT * FROM  `customerdetails` WHERE `id` = ?";
	
	
	//During creating the connections and drivers are establishing
	public CustomerBoImp() {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerapp","root","root");
				
				
				
				
			} catch (ClassNotFoundException c1) {
				c1.printStackTrace();
			} catch (SQLException c1) {
				c1.printStackTrace();
			}
			

	 }
	
	
	//inserting the values
	//	table colums: firstname,  lastname,  street,  address,  city,  state, email,  phone
	@Override
	public int save(Customer c) {
		try {
			
			prepareStatement = connection.prepareStatement(INSERT_QUERY);
			prepareStatement.setString(1, c.getFirstname());
			prepareStatement.setString(2, c.getLastname());
			prepareStatement.setString(3, c.getStreet());
			prepareStatement.setString(4, c.getAddress());
			prepareStatement.setString(5, c.getCity());
			prepareStatement.setString(6, c.getState());
			prepareStatement.setString(7, c.getEmail());
			prepareStatement.setString(8, c.getPhone());
			 
			 int i = prepareStatement.executeUpdate();
			 
			 return i;
			 
			 
			 
		} catch (SQLException c2)
		{
			
			c2.printStackTrace();
		}
		return 0;//if try block is not executed this will return 
		
	}

	
	
	
	//Update a customer
	
	@Override
	public int update(Customer c) {

		try {
			prepareStatement = connection.prepareStatement(UPDATE_QUERY);
			//attaching to ??
			prepareStatement.setString(1, c.getFirstname());
			prepareStatement.setString(2, c.getLastname());
			prepareStatement.setString(3, c.getStreet());
			prepareStatement.setString(4, c.getAddress());
			prepareStatement.setString(5, c.getCity());
			prepareStatement.setString(6, c.getState());
			prepareStatement.setString(7, c.getEmail());
			prepareStatement.setString(8, c.getPhone());
			
			int i = prepareStatement.executeUpdate();
			
			return i;
			
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return 0;
		
		
	}
	
	
//Deleting the object by using id
	
	@Override
	public int delete(int id) {
		try {
			prepareStatement = connection.prepareStatement(DELETE_QUERY);
			
			prepareStatement.setInt(1, id);
			
			int i = prepareStatement.executeUpdate();
			return i;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	
//Delete a customer object
	
	@Override
	public int delete(Customer c) {
		
		//removes entire object i.e one row
				int i = delete(c.getId());
				
				return i;
		
	}

	
	
	@Override
	public Customer getOne(int id) {
		
		Customer e=null;
		try {
//			statement = connection.createStatement();
//			
//			res = statement.executeQuery(GET_ONE_QUERY);
			
			prepareStatement = connection.prepareStatement(GET_ONE_QUERY);
			
			prepareStatement.setInt(1, id);
			
			res  = prepareStatement.executeQuery();
			
			if(res.next()){
				
				int id1 = res.getInt("id");
				String firstname = res.getString("firstname");
				String lastname = res.getString("lastname");
				String street = res.getString("street");
				String address = res.getString("address");
				String city = res.getString("city");
				String state = res.getString("state");
				String email = res.getString("email");
				String phone = res.getString("phone");
//				public Customer(int id, String firstname, String lastname, String street, String address, String city, String state,
//				String email, String phone) 
				e=new Customer(id1,firstname,lastname,street,address,city,state,email,phone);
//				e = new Customer(id1, name, email, department, salary);
			}
			
				
				
				
			
				 
			 
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		
		return e;
		

//		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
