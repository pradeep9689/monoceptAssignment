package com.monocept.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;




@WebServlet("/TestConnctionPool")
public class TestConnctionPool extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/student")
	private DataSource dataSource;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection conn = dataSource.getConnection();
			
			Statement stmt=conn.createStatement();
			
			String q1="select * from students";
			
			ResultSet rs = stmt.executeQuery(q1);
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
