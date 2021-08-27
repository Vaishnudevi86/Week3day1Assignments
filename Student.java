package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is Vaishnu");
	}

	public void studentDept() {
		System.out.println("Student Dept is ECE");
	}

	public void studentId() {
		System.out.println("Student Id is 2674785");
	}

	public static void main(String[] args) {
		College cObj = new College();
		cObj.collegeCode();
		cObj.collegeName();
		cObj.collegeRank();

		Department dObj = new Department();
		dObj.collegeCode();
		dObj.collegeName();
		dObj.collegeRank();
		dObj.DeptName();

		Student sObj = new Student();
		sObj.collegeCode();
		sObj.collegeName();
		sObj.collegeRank();
		sObj.DeptName();
		sObj.studentDept();

	}

}
