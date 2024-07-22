package com.monocept.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Transaction;

public class TransactionDAO {
	public static boolean addTransaction(Transaction transaction) {
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "INSERT INTO transactions (accountId, amount, type, date) VALUES (?, ?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, transaction.getAccountId());
			stmt.setDouble(2, transaction.getAmount());
			stmt.setString(3, transaction.getType());

			Date currentDate = new Date(System.currentTimeMillis());
			transaction.setDate(currentDate);
			stmt.setDate(4, currentDate);

			int rowsInserted = stmt.executeUpdate();

			if (rowsInserted > 0) {

				AccountDAO.updateAccountBalance(transaction.getAccountId(), transaction.getAmount(),
						transaction.getType());
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static List<Transaction> getTransactionsByAccountId(int accountId) {
		List<Transaction> transactions = new ArrayList<>();
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "SELECT * FROM transactions WHERE accountId = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, accountId);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Transaction transaction = new Transaction();
				transaction.setTransactionId(rs.getInt("transactionId"));
				transaction.setAccountId(rs.getInt("accountId"));
				transaction.setAmount(rs.getDouble("amount"));
				transaction.setType(rs.getString("type"));
				transaction.setDate(rs.getDate("date"));
				transactions.add(transaction);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return transactions;
	}

	public static List<Transaction> getTransactionsByAccountIdAndDate(int accountId, Date date) {
		List<Transaction> transactions = new ArrayList<>();
		try (Connection conn = DBConnection.getConnection()) {
			String sql = "SELECT * FROM transactions WHERE accountId = ? AND date = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, accountId);
			stmt.setDate(2, date);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Transaction transaction = new Transaction();
				transaction.setTransactionId(rs.getInt("transactionId"));
				transaction.setAccountId(rs.getInt("accountId"));
				transaction.setAmount(rs.getDouble("amount"));
				transaction.setType(rs.getString("type"));
				transaction.setDate(rs.getDate("date"));
				transactions.add(transaction);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return transactions;
	}
}