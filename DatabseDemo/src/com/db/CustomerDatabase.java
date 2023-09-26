package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.entities.Customer;


public class CustomerDatabase {

	private static Connection connection = DBConnection.connect();

	public boolean insertCustomer(Customer customer) {
		// Ref of Statement
		try {
//			Statement stat = connection.createStatement();
//			String sql = "insert into customer values("
//					+ "'" + customer.getEmail()+"',"
//					+ "'" + customer.getFristname()+"',"
//					+ "'" + customer.getLastname()+"',"
//					+ "'" + customer.getCity()+"',"
//					+ "'" + customer.getCountry()+"',"
//					+ "'" + customer.getPassword()+"',"
//					+ "'" + customer.getPhone()+"'"
//					+ ")";
//			System.out.println(sql);
			
			String sql = "insert into customer values(?,?,?,?,?,?,?)";
			PreparedStatement stat = connection.prepareStatement(sql);
			stat.setString(1, customer.getEmail());
			stat.setString(2, customer.getFristname());
			stat.setString(3, customer.getLastname());
			stat.setString(4, customer.getCity());
			stat.setString(5, customer.getCountry());
			stat.setString(6, customer.getPassword());
			stat.setString(7, customer.getPhone());
			stat.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;

	}
}
