package com.app.dao;

import com.app.models.Login;

//import com.t.models.Employee;

public interface LoginBo {
//	extends HttpServlet

	
/*	int save(Customer c);
	int update(Customer c);
	int delete(int id);
	int delete(Customer c);
	Customer  get(int id);
	List<Customer > getAll();*/
//	ArrayList<Login> login();
	
    Login getLogin(String userId,String password);
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//	int userId = Integer.parseInt(req.getParameter("userid"));
//	String password = req.getParameter("password");
//	resp.setContentType("text/html");
//	LoginBoImp lB = new LoginBoImp();
//	int i = lB.login(userId,password,req,resp);
//	if (i==0)
//	{
//		RequestDispatcher rd = req.getRequestDispatcher("homePage");
//		rd.forward(req, resp);
//	}
//	
//	else {
//		
//		
//		resp.sendRedirect("blocked.html");
////		RequestDispatcher rd3 = req.getRequestDispatcher("/blocked.html");
////		rd3.forward(req, resp);
//	}
//	}

}
