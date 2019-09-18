package com.sasadara.service;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sasadara.model.Student;
import com.sasadara.model.salt;



public class Checkemail {
	
	public static boolean result = false;
	public static boolean check(String email) {
		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.addAnnotatedClass(salt.class)
										.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {
					session.beginTransaction();
					
					
					//Student tempInstructor = session.get(Student.class, 1);
					//System.out.println(tempInstructor.getEmail());
					 
					/*Query q = session.createQuery("from Student");
					List<Student> students = q.list();
					 for(Student s : students) {
						 System.out.println(s);
					 }*/
					
					//look ==> https://www.youtube.com/watch?v=RuBfc8kfSas
					Query q = session.createQuery("from Student where email= :xxx");
					q.setParameter("xxx",email);
					List<Student> students = q.list();
					 for(Student s : students) {
						 System.out.println(s);
					 }
					
					// start a transaction
					if(students.size()==0) {
						result=true;
					}
					
					
					
									
					
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("No same user name "+result);
				}
				
				finally {
					factory.close();
				}
		        return result;
	}

}
