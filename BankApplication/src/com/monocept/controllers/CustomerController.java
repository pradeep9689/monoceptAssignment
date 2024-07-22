package com.monocept.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.DAO.AccountDAO;
import com.monocept.DAO.CustomerDAO;
import com.monocept.DAO.TransactionDAO;
import com.monocept.model.Customer;
import com.monocept.model.Transaction;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String action = request.getParameter("action");
	        if (action == null) {
	            response.sendRedirect("customer.jsp");
	            return;
	        }

	        switch (action) {
	            case "newTransaction":
	                request.getRequestDispatcher("newTransaction.jsp").forward(request, response);
	                break;
	            case "viewTransactions":
	                handleViewTransactions(request, response);
	                break;
	            case "editProfile":
	                request.getRequestDispatcher("editProfile.jsp").forward(request, response);
	                break;
	            default:
	                response.sendRedirect("customer.jsp");
	                break;
	        }
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String action = request.getParameter("action");
	        if (action == null) {
	            response.sendRedirect("customer.jsp");
	            return;
	        }

	        switch (action) {
	            case "newTransaction":
	                handleNewTransaction(request, response);
	                break;
	            case "editProfile":
	                handleEditProfile(request, response);
	                break;
	            default:
	                response.sendRedirect("customer.jsp");
	                break;
	        }
	    }

	    private void handleNewTransaction(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	        int senderAccountId = Integer.parseInt(request.getParameter("senderAccountId"));
	        int receiverAccountId = Integer.parseInt(request.getParameter("receiverAccountId"));
	        double amount = Double.parseDouble(request.getParameter("amount"));
	        String type = request.getParameter("type");
	        Date date = new Date();

	        Transaction transaction = new Transaction();
	        transaction.setSenderAccountId(senderAccountId);
	        transaction.setReceiverAccountId(receiverAccountId);
	        transaction.setAmount(amount);
	        transaction.setType(type);
	        transaction.setDate(date);

	        boolean success = TransactionDAO.addTransaction(transaction);
	        if (success) {
	            request.setAttribute("message", "Transaction successful.");
	        } else {
	            request.setAttribute("error", "Transaction failed.");
	        }
	        request.getRequestDispatcher("newTransaction.jsp").forward(request, response);
	    }

	    private void handleViewTransactions(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	        int accountId = Integer.parseInt(request.getParameter("accountId"));
	        List<Transaction> transactions = TransactionDAO.getTransactionsByAccountId(accountId);
	        if (transactions != null) {
	            request.setAttribute("transactions", transactions);
	            request.getRequestDispatcher("viewTransactions.jsp").forward(request, response);
	        } else {
	            request.setAttribute("error", "No transactions found.");
	            request.getRequestDispatcher("customer.jsp").forward(request, response);
	        }
	    }

	    private void handleEditProfile(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	        // Logic to edit profile
	    }
	}