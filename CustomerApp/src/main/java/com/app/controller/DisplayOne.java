package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.CustomerBoImp;
import com.app.models.Customer;

@WebServlet("/displayOne")
public class DisplayOne extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			
			int id = Integer.parseInt(request.getParameter("number-id"));
			CustomerBoImp employeeBo = new CustomerBoImp();
			Customer one = employeeBo.getOne(id);
			
			PrintWriter out =response.getWriter();
			if(one !=null)
			{
	//			out.println("DOne");
				
			}
			else
			{
				out.println("null");
//				response.sendRedirect("blocked.html");
				
			}
//Customer(int id, String firstname, String lastname, String street, String address, String city, String state,
//			String email, String phone) {			
			Customer em = new Customer(one.getId(),one.getFirstname(),one.getLastname(),one.getStreet(),one.getAddress(),one.getCity(),one.getState(),one.getEmail(),one.getPhone());
			
	/*		em.setId(id);
			one.getId();*/
			
			out.println(em.getId()+" "+em.getFirstname()+" "+em.getStreet()+" "+em.getAddress()+" "+em.getCity()+" "+em.getState());
	//		out.println();
			
	}
		
	

}
