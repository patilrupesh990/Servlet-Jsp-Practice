package com.bridgelabz.shoppingcart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.shoppingcart.model.ProductDTO;
import com.bridgelabz.shoppingcart.model.SellerDTO;

public class SellerDAO {
	private static Connection con;
	private static PreparedStatement statement;
	private static ResultSet resultSet;

	public static Connection getCon() {
		try {
			con = DBConnetion.getCon();
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static boolean isSellerExist(long mobile, String uName) {
		String query = "SELECT * FROM Seller17 where phno=? OR UName=?";
		try {
			statement = getCon().prepareStatement(query);
			statement.setLong(1, mobile);
			statement.setString(2, uName);
			statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static int sellerRegiser(SellerDTO seller) {
		String query = "insert into Seller17 values(?,?,?,?,?,?,?)";
		try {
			statement = getCon().prepareStatement(query);
			statement.setString(1, seller.getShopname());
			statement.setString(2, seller.getSellerName());
			statement.setString(3, seller.getProductName());
			statement.setDouble(4, seller.getPrice());
			statement.setLong(5, seller.getPhNo());
			statement.setString(6, seller.getUserName());
			statement.setString(7, seller.getPassword());
			return statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	public static ResultSet sellerLogin(SellerDTO seller) {
		String query = "select * from Seller17 where UName=? and PWord=?";
		try {
			statement = getCon().prepareStatement(query);
			statement.setString(1, seller.getUserName());
			statement.setString(2, seller.getPassword());
			resultSet = statement.executeQuery();
			if (resultSet != null) {
				return resultSet;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	public static int AddProduct(ProductDTO product,String uname) {
		try {
			PreparedStatement ps = getCon().prepareStatement("insert into Product18 values(?,?,?,?,?)");
			ps.setString(1, product.getProductCode());
			ps.setString(2, product.getProductName());
			ps.setDouble(3, product.getProductPrice());
			ps.setInt(4, product.getProductQuantity());
			ps.setString(5, uname);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public static ResultSet getProduct(String uName) {
		try {
			PreparedStatement ps = getCon().prepareStatement("select * from Product18 where Uname=?");
			ps.setString(1, uName);
			return ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
