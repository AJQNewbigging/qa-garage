package com.garage.model;

import java.util.Date;

public class Car extends Vehicle {
	
	private String colour;
	
	private int numOfWheels = 4;
	
	private String transmission;
	
	private String fuelType;
	
	private int fuelRemainingPercentage;
	
	public Car(String make, String model, float value) {
		this(make, model, value, new Date(), Condition.NEW);
	}

	public Car(String make, String model, float value, Date datePurchased, Condition condition) {
		super(make, model, value, datePurchased, condition);
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelRemainingPercentage() {
		return fuelRemainingPercentage;
	}

	public void refuel() {
		this.fuelRemainingPercentage = 100;
	}
	
	public void refuel(int percentage) {
		int total = percentage + this.fuelRemainingPercentage;
		if (total > 100) {
			this.fuelRemainingPercentage = 100;
		}
		else {
			this.fuelRemainingPercentage = total;
		}
	}

}
