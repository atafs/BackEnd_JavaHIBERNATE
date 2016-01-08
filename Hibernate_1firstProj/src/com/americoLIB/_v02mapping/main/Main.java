package com.americoLIB._v02mapping.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.americoLIB._v02mapping.dao.UserDetails;
import com.americoLIB._v02mapping.dao.Vehicle;

public class Main {

	public static void main(String[] args) {
		
		//INSTANTIATE USER #############################
		UserDetails user = new UserDetails();
		//ID RANDOM
		int random = (int) (Math.random()*10000);
		//NAME
		String userName = "UserName" + random;
		user.setUserName(userName);
		
		//INSTANTIATE VEHICLE ###########################
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Car" + random);
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("Car" + (random+1));
		
		//ADD ONE-TO-MANY
		user.getVehicleList().add(vehicle1);
		user.getVehicleList().add(vehicle2);
		
		//ADD MANY-TO-ONE
		vehicle1.setUser(user);
		vehicle2.setUser(user);
		
		//HIBERNATE - PUT DATA ##########################
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle1);
		session.save(vehicle2);
		session.getTransaction().commit();

		//CLOSE
		session.close();
	}
}
