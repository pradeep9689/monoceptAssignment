package com.monocept.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.monocept.DAO.AccountDAO;
import com.monocept.DAO.CustomerDAO;
import com.monocept.DAO.TransactionDAO;
import com.monocept.model.Account;
import com.monocept.model.Customer;
import com.monocept.model.Transaction;

@WebServlet("/BankController")
public class BankController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action == null) {
			action = "";
		}

		switch (action) {
		case "login":
			handleLogin(request, response);
			break;
		case "transferAmount":
			handleTransferAmount(request, response);
			break;
		case "viewAllcustomer":
			handleViewAllcustomer(request, response);
			break;
		case "checkBalance":
			handleCheckBalance(request, response);
			break;
		case "addCustomer":
			handleAddCustomer(request, response);
			break;
		case "searchByDate":
			handleSearchByDate(request, response);
			break;
		case "viewCustomers":
			handleViewCustomers(request, response);
			break;
		case "viewCustomersPage":
			handleViewCustomersPage(request, response);
			break;
		case "viewTransactions":
			handleViewTransactions(request, response);
			break;
		case "addAccount":
			handleAddAccount(request, response);
			break;
		case "newTransaction":
			handleNewTransaction(request, response);
			break;
		case "editProfile":
			handleEditProfile(request, response);
			break;
		case "passbook":
			handlePassbook(request, response);
			break;
		case "addCustomerPage":
			handleAddCustomerPage(request, response);
			break;
		case "addAccountPage":
			handleAddAccountPage(request, response);
			break;
		case "viewTransactionsPage":
			handleViewTransactionsPage(request, response);
			break;
		case "transferPage":
			handleTransferPage(request, response);
			break;
		case "logout":
			handleLogout(request, response);
			break;
		case "backCustomerHome":
			handleBackCustomerHome(request, response);
			break;
		case "backAdminHome":
			handleBackAdminHome(request, response);
			break;
		case "viewTransactionPage":
			handleViewTransactionPage(request, response);
			break;
		case "editProfilePage":
			handleEditProfilePage(request, response);
			break;
		default:
			response.sendRedirect("index.jsp");
		}
	}

	private void handleBackAdminHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("adminHome.jsp").forward(request, response);	
		
	}

	private void handleEditProfilePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("editProfile.jsp").forward(request, response);	
		
	}

	private void handleViewTransactionPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("viewTransaction.jsp").forward(request, response);		
	}

	private void handleBackCustomerHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("customerHome.jsp").forward(request, response);
		
	}

	private void handleTransferPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Transfer.jsp").forward(request, response);
		
	}

	private void handleLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		response.sendRedirect("login.jsp");
	}

	private void handleViewTransactionsPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("viewTransactions.jsp").forward(request, response);

	}

	private void handleAddAccountPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("addAccount.jsp").forward(request, response);

	}

	private void handleAddCustomerPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("addCustomer.jsp").forward(request, response);

	}

	private void handleViewCustomersPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("viewCustomers.jsp").forward(request, response);

	}

	private void handleTransferAmount(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Customer customer = (Customer) request.getSession().getAttribute("customer");

		if (customer != null) {
			int fromCustomerId = customer.getCustomerId();
			int fromAccountId = AccountDAO.getAccountIdByCustomerId(fromCustomerId);
			int toAccountId = Integer.parseInt(request.getParameter("toAccountId"));
			double amount = Double.parseDouble(request.getParameter("amount"));

			if (fromAccountId != -1) {
				boolean transferSuccess = AccountDAO.transferAmount(fromAccountId, toAccountId, amount);

				if (transferSuccess) {
					request.setAttribute("message", "Transfer successful.");

				} else {
					request.setAttribute("error", "Transfer failed. Insufficient funds or invalid recipient account.");
				}
			} else {
				request.setAttribute("error", "No account found for the logged-in customer.");
			}
			request.getRequestDispatcher("success.jsp").forward(request, response);
		} else {
			response.sendRedirect("login.jsp");
		}
	}

	private void handleViewAllcustomer(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Customer> customers = CustomerDAO.getAllCustomers();
		request.setAttribute("customers", customers);
		request.getRequestDispatcher("viewAllCustomerList.jsp").forward(request, response);
	}

	private void handleCheckBalance(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Customer customer = (Customer) request.getSession().getAttribute("customer");

		if (customer != null) {
			int customerId = customer.getCustomerId();
			int accountId = AccountDAO.getAccountIdByCustomerId(customerId);
			if (accountId != -1) {
				double balance = AccountDAO.getAccountBalance(accountId);
				request.setAttribute("balance", balance);
				request.getRequestDispatcher("viewBalance.jsp").forward(request, response);
			} else {
				request.setAttribute("error", "Account not found for this customer.");
				request.getRequestDispatcher("customer.jsp").forward(request, response);
			}
		} else {
			response.sendRedirect("login.jsp");
		}
	}

	private void handleSearchByDate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String dateStr = request.getParameter("date");
		List<Transaction> transactions;
		int accountId = Integer.parseInt(request.getParameter("accountId"));
		System.out.println(accountId);
		if (dateStr != null && !dateStr.isEmpty()) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				java.util.Date date = sdf.parse(dateStr);
				java.sql.Date sqlDate = new java.sql.Date(date.getTime());
				transactions = TransactionDAO.getTransactionsByAccountIdAndDate(accountId, sqlDate);
			} catch (ParseException e) {
				e.printStackTrace();
				request.setAttribute("errorMessage", "Invalid date format. Please use dd/mm/yyyy.");
				transactions = TransactionDAO.getTransactionsByAccountId(accountId);
			}
		} else {
			transactions = TransactionDAO.getTransactionsByAccountId(accountId);
		}

		request.setAttribute("transactions", transactions);
		request.getRequestDispatcher("viewTransaction.jsp").forward(request, response);
	}

	private void handlePassbook(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int accountId = Integer.parseInt(request.getParameter("accountId"));
		List<Transaction> transactions = TransactionDAO.getTransactionsByAccountId(accountId);

		request.setAttribute("transactions", transactions);
		request.getRequestDispatcher("passbook.jsp").forward(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	private void handleLogin(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String role = request.getParameter("role");

		if (email == null || password == null || role == null) {
			request.setAttribute("errorMessage", "Missing login parameters");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		String adminEmail = "admin@bank.com";
		String adminPassword = "admin123";

		if ("admin".equals(role)) {
			if (email.equals(adminEmail) && password.equals(adminPassword)) {
				HttpSession session = request.getSession();
				session.setAttribute("role", role);
				request.getRequestDispatcher("adminHome.jsp").forward(request, response);
				return;
			} else {
				request.setAttribute("errorMessage", "Invalid admin credentials");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return;
			}
		} else {
			Customer customer = CustomerDAO.getCustomerByEmailAndPassword(email, password);

			if (customer == null) {
				request.setAttribute("errorMessage", "Invalid email or password");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return;
			}
			HttpSession session = request.getSession();
			session.setAttribute("customer", customer);
			session.setAttribute("role", role);
			request.getRequestDispatcher("customerHome.jsp").forward(request, response);
		}
	}

	private void handleAddCustomer(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		String phoneNumber = request.getParameter("phoneNumber");
		if (firstName == null || lastName == null || email == null || phoneNumber == null || password == null
				|| address == null || gender == null) {
			request.setAttribute("error", "All fields are required.");
			request.getRequestDispatcher("addCustomer.jsp").forward(request, response);
			return;
		}

		Customer customer = new Customer();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setPassword(password);
		customer.setEmail(email);
		customer.setGender(gender);
		customer.setAddress(address);
		customer.setPhoneNumber(phoneNumber);

		boolean success = CustomerDAO.addCustomer(customer);

		if (success) {
			response.sendRedirect("addCustomer.jsp?success=true");
		} else {
			response.sendRedirect("addCustomer.jsp?success=false");
		}
	}

	private void handleViewCustomers(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		Customer customer = CustomerDAO.getCustomerById(customerId);

		request.setAttribute("customer", customer);
		request.getRequestDispatcher("viewCustomers.jsp").forward(request, response);
	}

	private void handleViewTransactions(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		int accountId = Integer.parseInt(request.getParameter("accountId"));
		List<Transaction> transactions = TransactionDAO.getTransactionsByAccountId(accountId);

		request.setAttribute("transactions", transactions);
		request.getRequestDispatcher("viewTransactions.jsp").forward(request, response);
	}

	private void handleAddAccount(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		double initialBalance = Double.parseDouble(request.getParameter("initialBalance"));

		Account account = new Account();
		account.setCustomerId(customerId);
		account.setBalance(initialBalance);

		boolean success = AccountDAO.addAccount(account);

		if (success) {
			response.sendRedirect("addAccount.jsp?success=true");
		} else {
			response.sendRedirect("addAccount.jsp?success=false");
		}
	}

	private void handleNewTransaction(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Customer customer = (Customer) request.getSession().getAttribute("customer");

		if (customer != null) {
			int customerId = customer.getCustomerId();
			int accountId = AccountDAO.getAccountIdByCustomerId(customerId);

			if (accountId != -1) {
				double amount = Double.parseDouble(request.getParameter("amount"));
				String type = request.getParameter("type");
				LocalDate currentDate = LocalDate.now();
				Date currentDateUtil = Date.from(currentDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

				double currentBalance = AccountDAO.getAccountBalance(accountId);

				if (type.equals("withdrawal") && amount > currentBalance) {
					request.setAttribute("error", "Insufficient balance for this transaction.");
					request.getRequestDispatcher("error.jsp").forward(request, response);
				} else {
					Transaction transaction = new Transaction();
					transaction.setAccountId(accountId);
					transaction.setAmount(amount);
					transaction.setType(type);
					transaction.setDate(currentDateUtil);

					boolean success = TransactionDAO.addTransaction(transaction);

					if (success) {
						if (type.equals("withdrawal")) {
							currentBalance -= amount;
						} else if (type.equals("deposit")) {
							currentBalance += amount;
						}
						AccountDAO.updateAccountBalance(accountId, currentBalance);

						request.setAttribute("message", "Transaction successful!");
						request.getRequestDispatcher("success.jsp").forward(request, response);
					} else {
						request.setAttribute("error", "Failed to process transaction.");
						request.getRequestDispatcher("error.jsp").forward(request, response);
					}
				}
			} else {
				request.setAttribute("error", "Account not found for this customer.");
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}
		} else {
			response.sendRedirect("login.jsp");
		}
	}

	private void handleEditProfile(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String customerIdStr = request.getParameter("customerId");
		System.out.println(customerIdStr);
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phoneNumber = request.getParameter("phoneNumber");
		String address = request.getParameter("address");
		if (customerIdStr == null || firstName == null || lastName == null || email == null || phoneNumber == null
				|| password == null || address == null) {
			HttpSession session = request.getSession(false);
			if (session != null) {
				Customer customer = (Customer) session.getAttribute("customer");
				if (customer != null) {
					request.setAttribute("customer", customer);
					request.getRequestDispatcher("editProfile.jsp").forward(request, response);
					return;
				}
			}
			request.setAttribute("errorMessage", "User not logged in or missing profile parameters");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}

		int customerId = Integer.parseInt(customerIdStr);

		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);

		customer.setEmail(email);
		customer.setAddress(address);
		customer.setPhoneNumber(phoneNumber);
		customer.setPassword(password);
		System.out.println(customer);

		boolean success = CustomerDAO.updateCustomer(customer);

		if (success) {
			HttpSession session = request.getSession();
			session.setAttribute("customer", customer);

			response.sendRedirect("editProfile.jsp");
		} else {
			request.setAttribute("errorMessage", "Failed to update profile");
			request.setAttribute("customer", customer);
			request.getRequestDispatcher("editProfile.jsp").forward(request, response);
		}
	}
}