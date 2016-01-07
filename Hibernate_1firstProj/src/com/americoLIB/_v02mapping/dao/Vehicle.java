package com.americoLIB._v02mapping.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Vehicle {
	
	//ATTRIBUTES
	@Id @GeneratedValue
	private int vehicleId;
	private String vehicleName;
	
	//GETTERS AND SETTERS
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	

	
	

}