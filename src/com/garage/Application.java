package com.garage;

import com.garage.model.Boat;
import com.garage.model.Car;
import com.garage.model.Garage;
import com.garage.model.Plane;

public class Application {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car = new Car("Ford", "Fiesta", 600.50f);
		Car car2 = new Car("Vauxhall", "Tigra", 1000.99f);
		Plane plane = new Plane("Boeing", "747", 120000.00f, 170, 300);
		
		garage.addVehicle(car);
		garage.addVehicle(car2);
		garage.addVehicle(plane);
		
		garage.describeGarage();
		
		garage.removeVehicle(car2);
		
		garage.describeGarage();
		
		garage.removeVehiclesByType(Plane.class);
		
		garage.describeGarage();
		
		Boat boat = new Boat("Boaty", "McBoaterson", 199.99f, "Canoe");
		
		boat.voyage(12000);
		
		boat.printSpecs();
		
		boat.repair();
		
		boat.printSpecs();
		
	}
	
}
