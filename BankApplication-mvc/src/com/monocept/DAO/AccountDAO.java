package com.monocept.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.monocept.model.Account;
import com.monocept.model.Transaction;

public class AccountDAO {

	public static boolean addAccount(Account account) {
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "INSERT INTO accounts (customerId, balance) VALUES (?, ?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, account.getCustomerId());
			stmt.setDouble(2, account.getBalance());

			int rowsInserted = stmt.executeUpdate();
			return rowsInserted > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static Account getAccountById(int accountId) {
		Account account = null;
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "SELECT * FROM accounts WHERE accountId = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, accountId);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				account = new Account();
				account.setAccountId(rs.getInt("accountId"));
				account.setCustomerId(rs.getInt("customerId"));
				account.setBalance(rs.getDouble("balance"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account;
	}

	public static boolean updateAccount(Account account) {
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "UPDATE accounts SET balance = ? WHERE accountId = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setDouble(1, account.getBalance());
			stmt.setInt(2, account.getAccountId());

			int rowsUpdated = stmt.executeUpdate();
			return rowsUpdated > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean updateAccountBalance(int accountId, double newBalance) {
		boolean updated = false;
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "UPDATE accounts SET balance = ? WHERE accountId = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setDouble(1, newBalance);
			stmt.setInt(2, accountId);
			int rowsUpdated = stmt.executeUpdate();
			updated = rowsUpdated > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updated;
	}

	public static void updateAccountBalance(int accountId, double amount, String type) throws SQLException {

		String sql = "";
		if ("deposit".equalsIgnoreCase(type)) {
			sql = "UPDATE accounts SET balance = balance + ? WHERE accountId = ?";
		} else if ("withdrawal".equalsIgnoreCase(type)) {
			sql = "UPDATE accounts SET balance = balance - ? WHERE accountId = ?";
		} else {
			throw new IllegalArgumentException("Invalid transaction type: " + type);
		}

		
		try (Connection conn = DBConnection.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			// Set the parameters
			stmt.setDouble(1, amount);
			stmt.setInt(2, accountId);

			// Execute the update
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 0) {
				throw new SQLException("No rows affected, possibly invalid account ID.");
			}
		}
	}

	public static double getAccountBalance(int accountId) {
		double balance = 0.0;
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "SELECT balance FROM accounts WHERE accountId = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, accountId);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				balance = rs.getDouble("balance");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public static int getAccountIdByCustomerId(int customerId) {
		int accountId = -1;
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "SELECT accountId FROM accounts WHERE customerId = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, customerId);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				accountId = rs.getInt("accountId");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accountId;
	}

	public static boolean transferAmount(int fromAccountId, int toAccountId, double amount) {
		try (Connection conn = DBConnection.getConnection()) {

			conn.setAutoCommit(false);

			String selectSql = "SELECT balance FROM accounts WHERE accountId = ?";
			PreparedStatement selectStmt = conn.prepareStatement(selectSql);
			selectStmt.setInt(1, fromAccountId);
			ResultSet rs = selectStmt.executeQuery();

			if (rs.next()) {
				double fromAccountBalance = rs.getDouble("balance");

				if (fromAccountBalance < amount) {
					conn.rollback();
					return false;
				}

				fromAccountBalance -= amount;
				String updateFromAccountSql = "UPDATE accounts SET balance = ? WHERE accountId = ?";
				PreparedStatement updateFromStmt = conn.prepareStatement(updateFromAccountSql);
				updateFromStmt.setDouble(1, fromAccountBalance);
				updateFromStmt.setInt(2, fromAccountId);
				updateFromStmt.executeUpdate();

				String selectToAccountSql = "SELECT balance FROM accounts WHERE accountId = ?";
				PreparedStatement selectToStmt = conn.prepareStatement(selectToAccountSql);
				selectToStmt.setInt(1, toAccountId);
				ResultSet toRs = selectToStmt.executeQuery();

				if (toRs.next()) {
					double toAccountBalance = toRs.getDouble("balance");
					toAccountBalance += amount;
					String updateToAccountSql = "UPDATE accounts SET balance = ? WHERE accountId = ?";
					PreparedStatement updateToStmt = conn.prepareStatement(updateToAccountSql);
					updateToStmt.setDouble(1, toAccountBalance);
					updateToStmt.setInt(2, toAccountId);
					updateToStmt.executeUpdate();
				} else {
					conn.rollback();
					return false;
				}

				String insertTransactionSql = "INSERT INTO transactions (accountId, amount, type, date) VALUES (?, ?, ?, ?)";
				PreparedStatement insertStmt = conn.prepareStatement(insertTransactionSql);
				insertStmt.setInt(1, fromAccountId);
				insertStmt.setDouble(2, amount);
				insertStmt.setString(3, "transfer");
				insertStmt.setDate(4, new java.sql.Date(System.currentTimeMillis()));
				insertStmt.executeUpdate();

				insertStmt.setInt(1, toAccountId);
				insertStmt.setDouble(2, amount);
				insertStmt.setString(3, "deposit");
				insertStmt.setDate(4, new java.sql.Date(System.currentTimeMillis()));
				insertStmt.executeUpdate();

				conn.commit();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}