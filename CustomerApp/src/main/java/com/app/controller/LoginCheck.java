package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.LoginBoImp;
import com.app.models.Login;

@WebServlet("/login")
public class LoginCheck extends HttpServlet {
	/*
	 * getting data from database and front-end here we are checking*/
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String loginId = req.getParameter("login-id");
		String password = req.getParameter("password");
		resp.setContentType("text/html");
		LoginBoImp lob = new LoginBoImp();
		
		
		
		
		Login log = lob.getLogin(loginId,password);
		
		
		if (log !=null)
		{
			HttpSession session = req.getSession();
			session.setAttribute("log-obj",log );
			
			resp.sendRedirect("customerlist.jsp");
		}
		else {
			
			
			resp.sendRedirect("loginFailed.jsp");
		}
	}
	
	

}
