package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection connect() {
		
		Connection conn = null;
		try {
			System.out.println("laoding..");
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connect
			conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/ecomm?useSSL=false", "root","root");
			System.out.println("DB Conencted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
