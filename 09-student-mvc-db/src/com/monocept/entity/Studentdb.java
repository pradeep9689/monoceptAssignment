package com.monocept.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class Studentdb {
	private DataSource dataSource;

	public Studentdb(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public List<Student> getStudents() {

		List<Student> studentList = new ArrayList<Student>();
		try {
			Connection conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from students";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Student student = new Student(id, name, email);
				studentList.add(student);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return studentList;

	}

	public boolean addStudent(Student student) {

		try {
			Connection conn = dataSource.getConnection();
			String sql = "insert into students(name,email) values(?,?)";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, student.getName());
			pmst.setString(2, student.getEmail());

			int rs = pmst.executeUpdate();
			return rs == 1 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Student getStudent(int id) throws SQLException {
		Student student = null;
		String sql = "SELECT * FROM students WHERE id=?";
		try (Connection conn = dataSource.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {

				String name = rs.getString("name");
				String email = rs.getString("email");
				student = new Student(id, name, email);
			}
		}
		return student;
	}

	public void updateStudent(Student updatedStudent) {
		String sql = "UPDATE students SET name=?, email=? WHERE id=?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, updatedStudent.getName());
			pstmt.setString(2, updatedStudent.getEmail());
			;
			pstmt.setInt(3, updatedStudent.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteStudent(int studentId) {
		String sql = "DELETE FROM students WHERE id=?";
		try (Connection conn = dataSource.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, studentId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Student> searchStudents(String name) {
		List<Student> students = new ArrayList<Student>();
		Student student = null;

		try {
			Connection connection = dataSource.getConnection();
			String selectQuery = "SELECT * FROM students WHERE name LIKE ?";
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			preparedStatement.setString(1, "%" + name + "%");
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String names = resultSet.getString("name");

				String email = resultSet.getString("email");

				student = new Student(id, names, email);
				students.add(student);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return students;
	}

	public List<Student> searchStudents(String type, String input) {
		List<Student> students = new ArrayList<Student>();
		try {
			Connection con = dataSource.getConnection();
			String sql;
			System.out.println(type);
			if (type.equals("Name")) {
				sql = "select * from students where name = ?;";
			}

			else {
				sql = "select * from students where email = ?;";
			}
			System.out.println(sql);
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, input);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");

				String email = rs.getString("email");

				Student student = new Student(id, name, email);
				System.out.println(student);
				students.add(student);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("In search dbUtil");
		return students;
	}
}
