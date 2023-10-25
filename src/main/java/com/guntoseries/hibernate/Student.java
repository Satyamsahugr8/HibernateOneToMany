package com.guntoseries.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {
	
	@Id
	@Column(name = "STUDENT_ID")
	@GeneratedValue
	private int student_id;
	private String student_name;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CATEGORY_ID")
	private StudentAddress studentAddress;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public StudentAddress getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}
	

}
