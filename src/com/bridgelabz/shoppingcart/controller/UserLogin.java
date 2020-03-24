package com.bridgelabz.shoppingcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.shoppingcart.dao.UserDAO;
import com.bridgelabz.shoppingcart.model.UserDTO;
@SuppressWarnings("serial")
public class UserLogin extends HttpServlet
{

	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession session=req.getSession();
		UserDTO user=new UserDTO();
		System.out.println("dfdf");
				PrintWriter pw=res.getWriter();
				res.setContentType("text/html");
				
				user.setUserName(req.getParameter("uname"));	
				user.setEmail(req.getParameter("uname"));
				user.setPassword(req.getParameter("password"));
				
					try
					{
						System.out.println("ddd");
							ResultSet rs=UserDAO.userLogin(user);
							  
							if(rs.next())
							  {
								System.out.println("UserLogedIn");
								  HttpSession hs=req.getSession();
								  hs.setAttribute("Name", rs.getString(3));
								  	
//								  pw.println("WELCOME&nbsp&nbsp"+rs.getString(3));
//								  pw.println("<br>");
								  session.setAttribute("uname", rs.getString(1));
								  RequestDispatcher rd=req.getRequestDispatcher("UserDashBoard.jsp");
								  rd.include(req, res);
							  }
							  else 
							  {
								  pw.println("Invalid Username Or Password");
								  RequestDispatcher rd=req.getRequestDispatcher("UserLogin.jsp");
								  rd.include(req, res);
							  }
					}//try block ends
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
