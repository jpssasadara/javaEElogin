package com.sasadara.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sasadara.model.Student;

public class RegistrationService {
	public static boolean registerStudent(String firstName1, String middleName, String lastName, String email, String userId, String password,
			String role) {
		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {	
					
					Student st = new Student(firstName1,middleName,lastName, email,userId, password,
					role);
					
					// start a transaction
					session.beginTransaction();
					
					
					System.out.println("Saving instructor: " + st);
					session.save(st);					
					
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}
				
				finally {
					factory.close();
				}
		        return true;
	}

}
