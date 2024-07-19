package com.monocept.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/JDBCDemo")
public class JDBCDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement stmt=connection.createStatement();
			/*
			 * String
			 * insertQuery="INSERT INTO students(id,name,email) VALUES (10,'somu','soma@gmail.com')"
			 * ; int rs=stmt.executeUpdate(insertQuery);
			 */
			/*
			 * String updateQuery="update students set name='pradeep' where id=10"; int
			 * rs=stmt.executeUpdate(updateQuery);
			 * System.out.println("number of row updated :"+rs);
			 */
			/*
			 * String deleteQuery="delete from students where id=10"; int
			 * rs=stmt.executeUpdate(deleteQuery);
			 * System.out.println("number of row updated :"+rs);
			 */
			String selectQuery="select * from students";
			ResultSet res1 = stmt.executeQuery(selectQuery);
			
			while(res1.next()) {
				int id=res1.getInt("id");
				System.out.println(id);
				System.out.println("------");
			}
		} catch (SQLException e) {
				e.printStackTrace();
			}
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}