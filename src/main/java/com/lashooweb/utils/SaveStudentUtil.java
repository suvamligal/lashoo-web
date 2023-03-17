package com.lashooweb.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lashooweb.model.Email;
import com.lashooweb.model.Student;

public class SaveStudentUtil {
	
	public static void SaveStudentobject() {
		/*
		 * Student student = new Student(); List<Email> emails = new ArrayList<>();
		 * 
		 * // set parent object student.setName("Mike");
		 * student.setJoinedDate(DateUtils.ConvertDateToMMddyyyy(new Date()));
		 * 
		 * 
		 * // pass that student object to all child emails object emails.add(new
		 * Email(0, "george@gmail.com", student)); emails.add(new Email(0,
		 * "mike@gmail.com", student)); emails.add(new Email(0, "mike@gmail.com",
		 * student));
		 * 
		 * //set emails on student object. inverse side of the association
		 * student.setEmails(emails);
		 * 
		 * SessionFactory sessionFactory = new
		 * Configuration().configure().buildSessionFactory(); Session session =
		 * sessionFactory.openSession(); session.beginTransaction();
		 * session.persist(student); session.getTransaction().commit(); session.close();
		 */
	}

}
  