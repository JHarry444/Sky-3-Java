package arrays.oop.polymorphism.vehicle;

public class Car extends Vehicle {
	

	public Car(int numWheels, String colour) {
		super(numWheels, colour);
	}

	@Override
	public int calcBill() {
		return 10;
	}

	@Override
	public String toString() {
		return "Car [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
	}
}
