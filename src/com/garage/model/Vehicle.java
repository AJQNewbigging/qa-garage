package com.garage.model;

import java.util.Date;

public class Vehicle {
	
	private static int counter;
	
	private int id;
	
	private String make;
	
	private String model;
	
	private String notes = "NA";
	
	private Date datePurchased;
	
	private float value;
	
	private Condition condition;
	
	public Vehicle(String make, String model, float value, Date datePurchased, Condition condition) {
		super();
		this.id = counter++;
		this.make = make;
		this.model = model;
		this.value = value;
		this.datePurchased = datePurchased;
		this.condition = condition;
	}
	
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public int getId() {
		return id;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public Date getDatePurchased() {
		return datePurchased;
	}

	public void printSpecs() {
		System.out.println(this.toString());
	}
	
	public int calculateRepairCost() {
		switch (this.condition) {
		case NEW:
			return (int) this.value/10;
		case FUNCTIONING:
			return (int) this.value/30;
		case DISREPAIR:
			return (int) this.value/50;
		default:
			return (int) this.value/50;
		}
	}
	
	public void repair() {
		System.out.println("Repair cost: " + this.calculateRepairCost());
		System.out.printf("Fixing to %s condition...", Condition.FUNCTIONING.toString());
		this.condition = Condition.FUNCTIONING;
	}
	
	public void repair(float newValue) {
		repair();
		this.value = newValue;
		System.out.println("Now valued at: £" + newValue);
	}
	
	public String toString() {
		return String.format("%s: %s \nValued at: £%s \nPurchased on: %s \nCondition: %s \nNotes: %s", 
				make, model, value, datePurchased, condition.toString(), notes);
	}

}
