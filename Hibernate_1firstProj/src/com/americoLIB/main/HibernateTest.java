package com.americoLIB.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.americoLIB.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		//SET USER_ID AND USER_NAME
		UserDetails user = new UserDetails();
		double random = (Math.random()*10000);
		random = (double) Math.round(random);
		user.setUserId(random);
		
		String userName = "UserName" + random;
		user.setUserName(userName);
		
		//PRINT.
		System.out.println("user_id = " + user.getUserId());
		System.out.println("user_name = " + user.getUserName());
		
		//CONFIGURATION OF SESSION
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
	}
}
