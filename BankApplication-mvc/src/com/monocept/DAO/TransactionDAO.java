package com.monocept.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Transaction;

public class TransactionDAO {
    public static boolean addTransaction(Transaction transaction) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Transaction (senderAccNo, receiverAccNo, type, amount, date) VALUES (?, ?, ?, ?, ?)")) {
            stmt.setInt(1, transaction.getSenderAccNo());
            stmt.setInt(2, transaction.getReceiverAccNo());
            stmt.setString(3, transaction.getType());
            stmt.setDouble(4, transaction.getAmount());
            stmt.setDate(5, new java.sql.Date(transaction.getDate().getTime()));
            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<Transaction> getTransactionsByAccountId(int accountId) {
        List<Transaction> transactions = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Transaction WHERE senderAccNo = ? OR receiverAccNo = ?")) {
            stmt.setInt(1, accountId);
            stmt.setInt(2, accountId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Transaction transaction = new Transaction();
                    transaction.setTransactionId(rs.getInt("transactionId"));
                    transaction.setSenderAccNo(rs.getInt("senderAccNo"));
                    transaction.setReceiverAccNo(rs.getInt("receiverAccNo"));
                    transaction.setType(rs.getString("type"));
                    transaction.setAmount(rs.getDouble("amount"));
                    transaction.setDate(rs.getDate("date"));
                    transactions.add(transaction);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transactions;
    }
}

