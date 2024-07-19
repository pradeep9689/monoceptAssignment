package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class StudentDb {

	public static List<Student> getStudentDetails() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Pradeep", "p9689032@gmail.com"));
		students.add(new Student(2, "satish", "ss2@gmail.com"));
		students.add(new Student(3, "somesh", "sab@gmail.com"));
		students.add(new Student(4, "jayash", "jay@gmail.com"));

		return students;
	}
}
