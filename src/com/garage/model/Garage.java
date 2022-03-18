package com.garage.model;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private List<Vehicle> vehicles = new ArrayList<>();
	
	public void addVehicle(Vehicle v) {
		this.vehicles.add(v);
	}
	
	public void removeVehicle(Vehicle v) {
		this.vehicles.remove(v);
	}
	
	public void removeVehicle(int id) {
		for (int i = 0; i < this.vehicles.size(); i++) {
			if (this.vehicles.get(i).getId() == id) {
				this.vehicles.remove(i);
				break;
			}
		}
	}
	
	public void removeVehiclesByType(Class<? extends Vehicle> c) {
		for (int i = 0; i < this.vehicles.size(); i++) {
			if (this.vehicles.get(i).getClass() == c) {
				this.vehicles.remove(i);
			}
		}
	}
	
	public void describeGarage() {
		System.out.println("\nGarage:");
		for (Vehicle vehicle : vehicles) {
			vehicle.printSpecs();
		}
	}

}
