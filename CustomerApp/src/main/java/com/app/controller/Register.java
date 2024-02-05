package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.LoginBoImp;
import com.app.models.Login;

@WebServlet("/register")
public class Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id");
		String password =request.getParameter("password");
		
	
		Login log = new Login(id,password);
		 
		
		LoginBoImp loginBoImp = new LoginBoImp();
		int i = loginBoImp.save(log);
		PrintWriter out = response.getWriter();
		if(i ==1)
		{
//			out.println();
			response.sendRedirect("registersucess.jsp");
		}
		else {
			response.sendRedirect("registerunsucess.jsp");
		}
		
		
	}
}