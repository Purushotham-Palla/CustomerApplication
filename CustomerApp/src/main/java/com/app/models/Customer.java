package com.app.models;

public class Customer {
	private int id;
	private String firstname;
	private String lastname;
	private String street;
	private String address;
	private String city;
	private String state;
	private String email;
	private String phone;
	

	
	
	
	public Customer() {
	}





	public Customer(int id, String firstname, String lastname, String street, String address, String city, String state,
			String email, String phone) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phone = phone;
	}
	
	//This for to skip the id insertion (on AddCustomer.java class)
	public Customer( String firstname, String lastname, String street, String address, String city, String state,
			String email, String phone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phone = phone;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getFirstname() {
		return firstname;
	}





	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}





	public String getLastname() {
		return lastname;
	}





	public void setLastname(String lastname) {
		this.lastname = lastname;
	}





	public String getStreet() {
		return street;
	}





	public void setStreet(String street) {
		this.street = street;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public String getCity() {
		return city;
	}





	public void setCity(String city) {
		this.city = city;
	}





	public String getState() {
		return state;
	}





	public void setState(String state) {
		this.state = state;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getPhone() {
		return phone;
	}





	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	

}
