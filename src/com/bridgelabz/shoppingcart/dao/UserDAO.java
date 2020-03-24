package com.bridgelabz.shoppingcart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.shoppingcart.model.UserDTO;

public class UserDAO {
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

	public static boolean isUserExist(long mobile, String email, String uName) {
		String query = "SELECT * FROM usertab17 where pnno=? OR email=? OR UName=?";
		try {
			statement = getCon().prepareStatement(query);
			statement.setLong(1, mobile);
			statement.setString(2, email);
			statement.setString(3, uName);
			statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static int userRegiser(UserDTO user) {
		String query = "insert into usertab17 values(?,?,?,?,?,?,?)";
		try {
			statement = getCon().prepareStatement(query);
			statement.setString(1, user.getUserName());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getFirstName());
			statement.setString(4, user.getLastName());
			statement.setString(5, user.getAddress());
			statement.setLong(6, user.getPhNo());
			statement.setString(7, user.getEmail());
			return statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	public static ResultSet userLogin(UserDTO user) {
		String query = "select * from usertab17 where email=? OR UName=? and PWord=?";
		try {
			statement = getCon().prepareStatement(query);
			statement.setString(1, user.getEmail());
			statement.setString(2, user.getUserName());
			statement.setString(3, user.getPassword());
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
}
