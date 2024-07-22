package com.monocept.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.monocept.controllers.Database;
import com.monocept.model.Transaction;

public class TransactionDAO {

	 public static boolean addTransaction(Transaction transaction) {
	        try (Connection conn = Database.getConnection()) {
	            String sql = "INSERT INTO transactions (sender_account_id, receiver_account_id, amount, type, date) VALUES (?, ?, ?, ?, ?)";
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, transaction.getSenderAccountId());
	            stmt.setInt(2, transaction.getReceiverAccountId());
	            stmt.setDouble(3, transaction.getAmount());
	            stmt.setString(4, transaction.getType());
	            stmt.setDate(5, (java.sql.Date) new Date(transaction.getDate().getTime()));
	            int rows = stmt.executeUpdate();
	            return rows > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false;
	    }

	 public static List<Transaction> getTransactionsByAccountId(int accountId) {
	        List<Transaction> transactions = new ArrayList<>();
	        try (Connection conn = Database.getConnection()) {
	            String sql = "SELECT * FROM transactions WHERE sender_account_id = ? OR receiver_account_id = ?";
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setInt(1, accountId);
	            stmt.setInt(2, accountId);
	            ResultSet rs = stmt.executeQuery();
	            while (rs.next()) {
	                Transaction transaction = new Transaction();
	                transaction.setTransactionId(rs.getInt("transaction_id"));
	                transaction.setSenderAccountId(rs.getInt("sender_account_id"));
	                transaction.setReceiverAccountId(rs.getInt("receiver_account_id"));
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