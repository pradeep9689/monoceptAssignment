package com.monocept.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.DAO.AccountDAO;
import com.monocept.DAO.CustomerDAO;
import com.monocept.DAO.TransactionDAO;
import com.monocept.model.Account;
import com.monocept.model.Customer;
import com.monocept.model.Transaction;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            response.sendRedirect("admin.jsp");
            return;
        }

        switch (action) {
            case "addCustomer":
                request.getRequestDispatcher("addCustomer.jsp").forward(request, response);
                break;
            case "":
                request.getRequestDispatcher("addCustomer.jsp").forward(request, response);
                break;
            case "addAccount":
                request.getRequestDispatcher("addAccount.jsp").forward(request, response);
                break;
            case "viewCustomer":
                handleViewCustomer(request, response);
                break;
            case "viewTransactions":
                handleViewTransactions(request, response);
                break;
            default:
                response.sendRedirect("admin.jsp");
                break;
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            response.sendRedirect("admin.jsp");
            return;
        }

        switch (action) {
            case "addCustomer":
                handleAddCustomer(request, response);
                break;
            case "addAccount":
                handleAddAccount(request, response);
                break;
            default:
                response.sendRedirect("admin.jsp");
                break;
        }
    }

    private void handleAddCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");

        if (firstName == null || lastName == null || email == null || password == null || gender == null || address == null || phoneNumber == null) {
            request.setAttribute("error", "All fields are required.");
            request.getRequestDispatcher("addCustomer.jsp").forward(request, response);
            return;
        }

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPassword(password);
        customer.setGender(gender);
        customer.setAddress(address);
        customer.setPhoneNumber(phoneNumber);

        boolean success = CustomerDAO.addCustomer(customer);
        if (success) {
            request.setAttribute("message", "Customer added successfully.");
        } else {
            request.setAttribute("error", "Failed to add customer.");
        }
        request.getRequestDispatcher("addCustomer.jsp").forward(request, response);
    }

    private void handleAddAccount(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        double balance = Double.parseDouble(request.getParameter("balance"));

        Account account = new Account();
        account.setCustomerId(customerId);
        account.setBalance(balance);

        boolean success = AccountDAO.addAccount(account);
        if (success) {
            request.setAttribute("message", "Account added successfully.");
        } else {
            request.setAttribute("error", "Failed to add account or customer already has an account.");
        }
        request.getRequestDispatcher("addAccount.jsp").forward(request, response);
    }

    private void handleViewCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        Customer customer = CustomerDAO.getCustomerById(customerId);
        if (customer != null) {
            request.setAttribute("customer", customer);
            request.getRequestDispatcher("viewCustomer.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Customer not found.");
            request.getRequestDispatcher("admin.jsp").forward(request, response);
        }
    }

    private void handleViewTransactions(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int accountId = Integer.parseInt(request.getParameter("accountId"));
        List<Transaction> transactions = TransactionDAO.getTransactionsByAccountId(accountId);
        if (transactions != null) {
            request.setAttribute("transactions", transactions);
            request.getRequestDispatcher("viewTransactions.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Transactions not found.");
            request.getRequestDispatcher("admin.jsp").forward(request, response);
        }
    }
}