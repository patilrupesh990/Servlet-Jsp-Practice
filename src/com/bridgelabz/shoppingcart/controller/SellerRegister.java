package com.bridgelabz.shoppingcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.shoppingcart.dao.SellerDAO;
import com.bridgelabz.shoppingcart.model.SellerDTO;

@SuppressWarnings("serial")
public class SellerRegister extends HttpServlet {
	Connection con;

	@Override
	public void init() throws ServletException {
		con = SellerDAO.getCon();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		SellerDTO seller = new SellerDTO();
		res.setContentType("text/html");
		seller.setShopname(req.getParameter("shope"));
		seller.setSellerName(req.getParameter("name"));
		seller.setProductName(req.getParameter("pname"));
		seller.setPrice(Double.parseDouble(req.getParameter("price")));
		seller.setPhNo(Long.parseLong(req.getParameter("phno")));
		seller.setUserName(req.getParameter("uname"));
		seller.setPassword(req.getParameter("pword"));
		if(SellerDAO.isSellerExist(seller.getPhNo(), seller.getUserName())){
		try {

			if (SellerDAO.sellerRegiser(seller) > 0) {
				pw.println("You Have Successfully Registered For Seller");
				RequestDispatcher rd = req.getRequestDispatcher("SellerLogin.jsp");
				rd.include(req, res);
			} else {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		}else {
			pw.println("Alrady Registered Please Login");
			RequestDispatcher rd = req.getRequestDispatcher("SellerLogin.jsp");
			rd.include(req, res);
		}
	}
}
