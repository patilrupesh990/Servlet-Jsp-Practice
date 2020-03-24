package com.bridgelabz.shoppingcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.shoppingcart.dao.SellerDAO;
import com.bridgelabz.shoppingcart.dao.UserDAO;
import com.bridgelabz.shoppingcart.model.SellerDTO;

@SuppressWarnings("serial")
public class SellerLogin extends HttpServlet {
	Connection con;

	@Override
	public void init() throws ServletException {
		con = UserDAO.getCon();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		SellerDTO seller = new SellerDTO();
		seller.setUserName(req.getParameter("uname"));
		seller.setPassword(req.getParameter("password"));
		try {
			ResultSet rs = SellerDAO.sellerLogin(seller);

			if (rs.next()) {
				HttpSession hs = req.getSession();
				hs.setAttribute("uname", rs.getString(6));
				pw.println("WELCOME&nbsp&nbsp" + rs.getString(3));
				pw.println("<br>");
				RequestDispatcher rd = req.getRequestDispatcher("SellerDashBoard.jsp");
				rd.include(req, res);
			} else {

				pw.println("Invalid Username Or Password");

				RequestDispatcher rd = req.getRequestDispatcher("SellerLogin.jsp");
				rd.include(req, res);
			}
		} // try block ends
		catch (Exception e) {
			e.printStackTrace();
		}
	}// doGet method ends
}
