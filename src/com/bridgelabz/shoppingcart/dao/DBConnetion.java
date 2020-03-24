package com.bridgelabz.shoppingcart.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnetion {

	private static String driver = "com.mysql.jdbc.Driver";
	private static String dbURL = "jdbc:mysql://localhost:3306/shoppingcart";
	private static String userName = "root";
	private static String password = "1234Rp";
	private static Connection con;

	private DBConnetion() {

	}

	public static Connection getCon() {
		if (con == null) {
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(dbURL, userName, password);
				System.out.println(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return con;
	}
}
