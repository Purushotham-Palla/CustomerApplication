package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.CustomerBoImp;

public class DisplayingAll {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			CustomerBoImp customerBoimp = new CustomerBoImp();
			customerBoimp.getAll();
	//		List<Employee> all = employeeBo.getAll();
	//		System.out.println(all.get(0));
	//		System.out.println(all.get(0));
		
	}

}
