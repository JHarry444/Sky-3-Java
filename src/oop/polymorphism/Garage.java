package oop.polymorphism;

import oop.polymorphism.vehicle.Boat;
import oop.polymorphism.vehicle.Car;
import oop.polymorphism.vehicle.Plane;
import oop.polymorphism.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles;

	private int count = 0;

	public Garage() {
		super();
		this.vehicles = new ArrayList<>();
	}

	public Garage(Vehicle... vehicles) {
		super();
		this.vehicles = new ArrayList<>(Arrays.asList(vehicles));
	}

	public boolean addVehicle(Vehicle v) {
		if (this.vehicles.contains(v) ) return false;
		v.setId(++count);

		return this.vehicles.add(v);
	}

	public boolean empty() {
		this.vehicles.clear();
		return this.vehicles.isEmpty();
	}

	public int calcBillInstance() {
		int bill = 0;
		for (Vehicle v : this.vehicles) {
			if (v instanceof Car)
				bill += 10;
			else if (v instanceof Boat)
				bill += 15;
			else if (v instanceof Plane)
				bill += 23;
		}
		return bill;
	}

	public int calcBill() {
		int bill = 0;
		for (Vehicle v : this.vehicles)
			bill += v.calcBill();
		return bill;
	}

	public Vehicle find(int id)  {
		for (Vehicle v : this.vehicles) {
			if (v.getId() == id)
				return v;
		}
		return null;
	}

	public boolean remove(int id) {
		for (Vehicle v : this.vehicles) {
			if (v.getId() == id) {
				return this.vehicles.remove(v);
			}
		}
		return false;
	}

	// name -> com.qa.vehicles.Car
	// simple name -> Car
	public boolean remove(String type) {
		List<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : this.vehicles) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(type))
				toRemove.add(v);
		}
		return this.vehicles.removeAll(toRemove);
	}

	public boolean remove(Class clazz) {
		List<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : new ArrayList<>(this.vehicles)) {
			if (v.getClass() == clazz)
				vehicles.remove(v);
		}
		return this.vehicles.removeAll(toRemove);
	}

	@Override
	public String toString() {
		return "Garage [vehicles=" + this.vehicles + "]";
	}

}
