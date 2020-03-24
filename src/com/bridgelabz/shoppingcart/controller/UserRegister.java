package com.bridgelabz.shoppingcart.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.shoppingcart.dao.UserDAO;
import com.bridgelabz.shoppingcart.model.UserDTO;

@SuppressWarnings("serial")
public class UserRegister extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		UserDTO user = new UserDTO();
		user.setUserName(req.getParameter("uname"));
		user.setPassword(req.getParameter("password"));
		user.setFirstName(req.getParameter("fname"));
		user.setLastName(req.getParameter("lname"));
		user.setAddress(req.getParameter("addr"));
		user.setPhNo((Long.parseLong(req.getParameter("phno"))));
		user.setEmail(req.getParameter("mail"));
		if (UserDAO.isUserExist(user.getPhNo(), user.getEmail(), user.getUserName())) {
			try {
				int result = UserDAO.userRegiser(user);
				if (result > 0) {
					System.out.println("Registered Successfully");
					pw.println("Registration successfully Login Now");

					RequestDispatcher rd = req.getRequestDispatcher("UserLogin.jsp");
					rd.include(req, res);
				} else {
					pw.println("User Not Registered");
					RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
					rd.include(req, res);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			pw.println("User Alrady Exist");
		}

	}
}
