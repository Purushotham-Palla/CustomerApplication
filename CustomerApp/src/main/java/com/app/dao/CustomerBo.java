package com.app.dao;

import java.util.List;

import com.app.models.Customer;


public interface CustomerBo {
	int save(Customer c);
	int update(Customer c);
	int delete(int id);
	int delete(Customer c);
	Customer  getOne(int id);
	List<Customer > getAll();

}
