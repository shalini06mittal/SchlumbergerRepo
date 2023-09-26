package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	public List<Customer> getCustomers() throws Exception
	{
		String sql = "select * from customer";
		List<Customer> customers = new ArrayList<Customer>();
		try {
			PreparedStatement stat = connection.prepareStatement(sql);
			ResultSet rs = stat.executeQuery();
			while(rs.next())
			{
				Customer customer = new Customer();
				customer.setEmail(rs.getString(1));
				customer.setFristname(rs.getString(2));
				customer.setLastname(rs.getString(3));
				customer.setCity(rs.getString(4));
				customer.setCountry(rs.getString(5));
				customer.setPassword(rs.getString(6));
				customer.setPhone(rs.getString(7));
				customers.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Please contact Admin...");
		}
		return customers;
	}
	public Customer getCustomerByEmail(String email) throws Exception
	{
		String sql = "select * from customer where email=?";
		try {
			PreparedStatement stat = connection.prepareStatement(sql);
			stat.setString(1, email);
			ResultSet rs = stat.executeQuery();
			if(rs.next())
			{
				Customer customer = new Customer();
				customer.setEmail(rs.getString(1));
				customer.setFristname(rs.getString(2));
				customer.setLastname(rs.getString(3));
				customer.setCity(rs.getString(4));
				customer.setCountry(rs.getString(5));
				customer.setPassword(rs.getString(6));
				customer.setPhone(rs.getString(7));
				return customer;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Please contact Admin...");
		}
		return null;
	}
}
