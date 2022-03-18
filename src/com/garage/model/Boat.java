package com.garage.model;

import java.util.Date;

public class Boat extends Vehicle {
	
	private String boatType;
	
	private int beds = 0;
	
	private int milesVoyaged = 0;
	
	public Boat(String make, String model, float value, String boatType) {
		this(make, model, value, new Date(), Condition.NEW, boatType);
	}

	public Boat(String make, String model, float value, Date datePurchased, Condition condition, String boatType) {
		super(make, model, value, datePurchased, condition);
		this.boatType = boatType;
	}
	
	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public int getMilesVoyaged() {
		return milesVoyaged;
	}

	public void setMilesVoyaged(int milesVoyaged) {
		this.milesVoyaged = milesVoyaged;
	}

	public String getBoatType() {
		return boatType;
	}

	public void voyage(int distance) {
		this.milesVoyaged += distance;
		
		if (this.milesVoyaged >= 10000) {
			this.setCondition(Condition.DISREPAIR);
		} else if (this.milesVoyaged >= 1000) {
			this.setCondition(Condition.FUNCTIONING);
		}
	}
	
}
