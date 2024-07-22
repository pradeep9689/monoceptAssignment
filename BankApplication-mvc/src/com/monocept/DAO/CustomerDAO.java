package com.monocept.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Customer;
import com.monocept.model.Transaction;

public class CustomerDAO {

	// Add Customer
	public static boolean addCustomer(Customer customer) {
		boolean success = false;
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBConnection.getConnection();
			String sql = "INSERT INTO customer (firstName, lastName, password, email, gender, address, phoneNumber) VALUES (?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getFirstName());
			pstmt.setString(2, customer.getLastName());
			pstmt.setString(3, customer.getPassword());
			pstmt.setString(4, customer.getEmail());
			pstmt.setString(5, customer.getGender());
			pstmt.setString(6, customer.getAddress());
			pstmt.setString(7, customer.getPhoneNumber());

			int rowsAffected = pstmt.executeUpdate();
			success = (rowsAffected > 0);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
		return success;
	}

	public static boolean updateCustomer(Customer customer) {
		boolean success = false;
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBConnection.getConnection();
			String sql = "UPDATE customer SET firstName = ?, lastName = ?, password = ?, email = ?, address = ?, phoneNumber = ? WHERE customerId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getFirstName());
			pstmt.setString(2, customer.getLastName());
			pstmt.setString(3, customer.getPassword());
			pstmt.setString(4, customer.getEmail());

			pstmt.setString(5, customer.getAddress());
			pstmt.setString(6, customer.getPhoneNumber());
			pstmt.setInt(7, customer.getCustomerId());

			int rowsAffected = pstmt.executeUpdate();
			success = (rowsAffected > 0);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
		return success;
	}

	public static Customer getCustomerByEmailAndPassword(String email, String password) {
		Customer customer = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection.getConnection();
			String sql = "SELECT * FROM customer WHERE email = ? AND password = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				customer = new Customer();
				customer.setCustomerId(rs.getInt("customerId"));
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("lastName"));
				customer.setPassword(rs.getString("password"));
				customer.setEmail(rs.getString("email"));
				customer.setGender(rs.getString("gender"));
				customer.setAddress(rs.getString("address"));
				customer.setPhoneNumber(rs.getString("phoneNumber"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
		return customer;
	}

	public static Customer getCustomerById(int customerId) {
		Customer customer = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection.getConnection();
			String sql = "SELECT * FROM customer WHERE customerId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, customerId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				customer = new Customer();
				customer.setCustomerId(rs.getInt("customerId"));
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("lastName"));
				customer.setPassword(rs.getString("password"));
				customer.setEmail(rs.getString("email"));
				customer.setGender(rs.getString("gender"));
				customer.setAddress(rs.getString("address"));
				customer.setPhoneNumber(rs.getString("phoneNumber"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
		return customer;
	}

	public static List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		try (Connection conn = DBConnection.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM customer")) {
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt("customerId"));
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("lastName"));
				customer.setEmail(rs.getString("email"));
				customer.setGender(rs.getString("gender"));
				customer.setAddress(rs.getString("address"));
				customer.setPhoneNumber(rs.getString("phoneNumber"));
				customers.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}

	public static int getAccountIdByCustomerId(int customerId) {
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "SELECT accountId FROM accounts WHERE customerId = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, customerId);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("accountId");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
