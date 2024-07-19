package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.monocept.entity.Student;
import com.monocept.entity.Studentdb;

@WebServlet("/StudentControlller")
public class StudentControlller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Studentdb studentdb;
	@Resource(name = "jdbc/student")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {

		super.init();
		studentdb = new Studentdb(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command;
		command = request.getParameter("command");
		System.out.println(command);

		if (command == null) {
			command = "list";
		}

		switch (command) {
		case "add":
			addStudent(request, response);
			break;

		case "load":
			try {
				loadStudent(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;

		case "delete":
			deleteStudent(request, response);
			break;
		case "update":
			updateStudent(request, response);
			break;
		case "search":
			try {
				searchStudent(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			listOfStudent(request, response);
		}
	}

	private void searchStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String input = request.getParameter("input");
		String type = request.getParameter("type");
		List<Student> studentList = new ArrayList<Student>();
		switch (type) {
		case "Id":
			int id = Integer.parseInt(input);
			Student student = studentdb.getStudent(id);
			studentList.add(student);
			break;

		default:
			studentList = studentdb.searchStudents(type, input);
			break;
		}
		System.out.println(studentList);
		request.setAttribute("theStudentList", studentList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("view.jsp");

		requestDispatcher.forward(request, response);

	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("update method");
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		String name = request.getParameter("name");

		String email = request.getParameter("email");

		Student updatedStudent = new Student(id, name, email);
		System.out.println(updatedStudent);
		studentdb.updateStudent(updatedStudent);
		// listOfStudent(request, response);
		response.sendRedirect(request.getContextPath() + "/StudentControlller?command=list");

	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		Student student = studentdb.getStudent(id);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("update-student-form.jsp");
		request.setAttribute("theStudent", student);
		requestDispatcher.forward(request, response);

	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int studentId = Integer.parseInt(request.getParameter("id"));
		studentdb.deleteStudent(studentId);
		response.sendRedirect(request.getContextPath() + "/StudentControlller?command=list");

	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("student_name");
		String email = request.getParameter("student_mail");
		Student student = new Student(name, email);
		boolean isAdded = studentdb.addStudent(student);
		// listOfStudent(request, response);
		response.sendRedirect(request.getContextPath() + "/StudentControlller?command=list");

	}

	private void listOfStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Student> studentList = studentdb.getStudents();

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("view.jsp");
		request.setAttribute("theStudentList", studentList);
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
