package com.monocept.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name = "jdbc/employee")
	private DataSource dataSource;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = dataSource.getConnection();
			String sql = null;
			 sql = "INSERT INTO Employees (emp_id, emp_name, emp_mail, salary) VALUES (?, ?, ?, ?)";
			// sql = "UPDATE Employees SET emp_name = ?, emp_mail = ?, salary = ? WHERE emp_id = ?";
			//sql = "DELETE FROM Employees WHERE emp_id = ?";

			pstmt = conn.prepareStatement(sql);

			// insert
			
			  pstmt.setString(1, "2"); 
			  pstmt.setString(2, "Santosh"); 
			  pstmt.setString(3,"p9689032@gmail.com"); 
			  pstmt.setString(4, "100000");
			 

			// update
			/*
			 * pstmt.setString(1, "Santosh"); pstmt.setString(2, "p96032@gmail.com");
			 * pstmt.setString(3, "20000"); pstmt.setString(4, "2");
			 */

			// delete
			//pstmt.setString(1, "2");

			PrintWriter out = response.getWriter();
			response.setContentType("text/html");

			int rs = pstmt.executeUpdate();

			if (rs > 0) {
				out.println("Changes done successfully!");
			} else {
				out.println("Invalid Employee Id  ");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}
}