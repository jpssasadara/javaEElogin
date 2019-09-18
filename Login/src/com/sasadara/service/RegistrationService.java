package com.sasadara.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sasadara.model.Student;
import com.sasadara.model.salt;

public class RegistrationService {
	public static boolean registerStudent(String firstName1, String middleName, String lastName, String email, String userId, String password,
			String role , byte[] salt) {
		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.addAnnotatedClass(salt.class)
										.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {	
					
					Student st = new Student(firstName1,middleName,lastName, email,userId, password,
					role);
					salt slt = new salt(salt);
					slt.setStuid(st);
					
				
					
					// start a transaction
					session.beginTransaction();
					
					
					System.out.println("Saving instructor: " + st);
					session.save(slt);					
					
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
