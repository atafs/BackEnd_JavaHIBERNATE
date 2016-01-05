package com.americoLIB.main;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.americoLIB.dao.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		//INSTANTIATE
		UserDetails user = new UserDetails();
		
		//POPULATE DATABASE
		//ID
		double random = (Math.random()*10000);
		random = (double) Math.round(random);
		user.setUserId(random);
		//NAME
		String userName = "UserName" + random;
		user.setUserName(userName);
		//ADDRESS
		user.setAddress("UserAddress" + random);
		//JOINED_DATE
		user.setJoinedDate(new Date());
		//DESCRIPTION
		user.setDescription("UserDescription" + random);
		//GROUP (static: same to all)
		UserDetails.setGroupUser("HibernateRULES");
		
		//PRINT
		System.out.println("-----------PRINT01--------------");
		System.out.println("group_user = " + UserDetails.getGroupUser());
		System.out.println("user_id = " + user.getUserId());
		System.out.println("user_name = " + user.getUserName());
		System.out.println("--------------------------------");

		//CONFIGURATION OF SESSION
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
}
