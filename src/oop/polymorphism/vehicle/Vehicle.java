package oop.polymorphism.vehicle;

public abstract class Vehicle {

	private int numWheels;

	private String colour;

	private int id;


	public Vehicle(int numWheels, String colour) {
		super();
//		this.id = ?;
		this.numWheels = numWheels;
		this.colour = colour;
	}

	public abstract int calcBill();

	public int getId() {
		return this.id;
	}

	public int getNumWheels() {
		return this.numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [numWheels=" + this.numWheels + ", colour=" + this.colour + "]";
	}

	public void setId(int id) {
		this.id = id;
	}
}
