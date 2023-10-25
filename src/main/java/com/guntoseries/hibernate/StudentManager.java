package com.guntoseries.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentManager {

	public static void main(String[] args) {

		StudentAddress studentaddress = new StudentAddress();
		studentaddress.setAddress_detail("MP, India");

		Student student1 = new Student();
		student1.setStudent_name("satyam");
		student1.setStudentAddress(studentaddress);

		Student student2 = new Student();
		student2.setStudent_name("mayank");
		student2.setStudentAddress(studentaddress);
		
//		Set<Student> students = new HashSet<Student>();
//		students.add(student1);
//		students.add(student2);
//		studentaddress.setStudents(students);

		studentaddress.getStudents().add(student1);
		studentaddress.getStudents().add(student2);

		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		
//		session.save(student1);
//		session.save(student2);
		
		session.save(studentaddress);
		

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
