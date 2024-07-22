package com.monocept.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.monocept.controllers.Database;
import com.monocept.model.Account;

public class AccountDAO {

	public static boolean addAccount(Account account) {
        try (Connection conn = Database.getConnection()) {
            String checkSql = "SELECT * FROM accounts WHERE customer_id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setInt(1, account.getCustomerId());
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                return false; // Customer already has an account
            }

            String sql = "INSERT INTO accounts (customer_id, balance) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, account.getCustomerId());
            stmt.setDouble(2, account.getBalance());
            int rows = stmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Account getAccountByCustomerId(int customerId) {
        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT * FROM accounts WHERE customer_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setAccountId(rs.getInt("account_id"));
                account.setCustomerId(rs.getInt("customer_id"));
                account.setBalance(rs.getDouble("balance"));
                return account;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static boolean updateAccountBalance(int accountId, double amount, String type) {
        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT balance FROM accounts WHERE account_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, accountId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                double currentBalance = rs.getDouble("balance");
                double newBalance = type.equalsIgnoreCase("withdrawal") ? currentBalance - amount : currentBalance + amount;
                if (newBalance < 0) {
                    return false; // Insufficient balance
                }
                String updateSql = "UPDATE accounts SET balance = ? WHERE account_id = ?";
                PreparedStatement updateStmt = conn.prepareStatement(updateSql);
                updateStmt.setDouble(1, newBalance);
                updateStmt.setInt(2, accountId);
                int rows = updateStmt.executeUpdate();
                return rows > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}