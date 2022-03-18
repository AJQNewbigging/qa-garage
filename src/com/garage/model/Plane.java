package com.garage.model;

import java.util.Date;

public class Plane extends Vehicle {
	
	private int capacity;
	
	private int  maxWeightKGs;
	
	private int currentLoad = 0;
	
	public Plane(String make, String model, float value, int capacity, int maxWeight) {
		this(make, model, value, new Date(), Condition.NEW, capacity, maxWeight);
	}

	public Plane(String make, String model, float value, Date datePurchased, Condition condition, int capacity, int maxWeight) {
		super(make, model, value, datePurchased, condition);
		this.capacity = capacity;
		this.maxWeightKGs = maxWeight;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public int getMaxWeightKGs() {
		return maxWeightKGs;
	}

	public int getCurrentLoad() {
		return currentLoad;
	}

	public void load(int load) {
		int total = currentLoad + load;
		if (total > maxWeightKGs) {
			System.out.printf("Failed to load. Max weight is %skg, current weight is %skg.", this.maxWeightKGs, this.currentLoad);
		} else {
			this.currentLoad = total;
			System.out.printf("Current load now: %skg", currentLoad);
		}
	}
	
	public void unload(int load) {
		int total = currentLoad - load;
		if (total < 0) {
			System.out.printf("Failed to unload. Current load is %skg", this.currentLoad);
		} else {
			this.currentLoad = total;
			System.out.printf("Current load now: %skg", currentLoad);
		}
	}

}
