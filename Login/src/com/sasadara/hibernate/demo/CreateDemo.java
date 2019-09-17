package com.sasadara.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sasadara.model.Student;





public class CreateDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			
			Student st = new Student("Suravi","sasadara","jayaweera", "sasaara@gmail.com","9091", "sasadarattt",
			"admin");
			
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
	}

}





