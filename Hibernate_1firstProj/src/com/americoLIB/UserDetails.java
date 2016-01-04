package com.americoLIB;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	
	//ATTRIBUTES
	@Id
	private double userId;
	private String userName;
	
	//GETTERS AND SETTERS
	public double getUserId() {
		return userId;
	}
	
	public void setUserId(double userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
