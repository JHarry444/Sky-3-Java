package oop.polymorphism.vehicle;

import oop.interfaces.Flyable;

public class Plane extends Vehicle implements Flyable {

	public Plane(int numWheels, String colour) {
		super(numWheels, colour);
	}

	@Override
	public int calcBill() {
		return 23 * getNumWheels();
	}

	@Override
	public String toString() {
		return "Plane [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
	}


	@Override
	public void fly() {
		System.out.println("nyooom");
	}
}
