package com.bridgelabz.shoppingcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.shoppingcart.dao.DBConnetion;
import com.bridgelabz.shoppingcart.dao.SellerDAO;
import com.bridgelabz.shoppingcart.model.ProductDTO;

@SuppressWarnings("serial")
public class AddProduct extends HttpServlet {
	Connection con;

	@Override

	public void init() throws ServletException {
		con = DBConnetion.getCon();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ProductDTO product=new ProductDTO();
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		HttpSession hs = req.getSession();
		if (hs == null) {
			RequestDispatcher rd = req.getRequestDispatcher("SellerLogin.jsp");
			rd.forward(req, res);
		}
		String UName = (String) hs.getAttribute("uname");
		pw.println("Wellcome" + UName);

		pw.println("<br><a href='SellerDashBoard.jsp'>Home</a><br>");
		product.setProductCode(req.getParameter("pcode"));
		product.setProductName( req.getParameter("pname"));
		product.setProductPrice( Double.parseDouble(req.getParameter("pprice")));
		product.setProductQuantity( Integer.parseInt(req.getParameter("pqty")));

		try {
			if (SellerDAO.AddProduct(product,UName) > 0) {
				pw.println("Product Inserted SuccessFully");
				RequestDispatcher rd = req.getRequestDispatcher("AddProduct.html");
				rd.include(req, res);

			} else {
				RequestDispatcher rd = req.getRequestDispatcher("AddProduct.jsp");
				rd.include(req, res);
				pw.println("Invalid Data Please Try Again");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
