package com.bridgelabz.shoppingcart.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class Home extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String submit=req.getParameter("submit");
		if(submit.equals("seller"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("SellerLogin.jsp");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("UserLogin.jsp");
			rd.forward(req, res);
		}
	}
}
