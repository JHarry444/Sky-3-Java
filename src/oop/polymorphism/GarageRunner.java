package oop.polymorphism;

import oop.polymorphism.vehicle.Bike;
import oop.polymorphism.vehicle.Boat;
import oop.polymorphism.vehicle.Car;

public class GarageRunner {


    public static void main(String[] args) {
        Garage g = new Garage();

        g.addVehicle(new Car(4, "blue"));
        g.addVehicle(new Car(3, "red"));
        g.addVehicle(new Bike(2, "grey"));
        g.addVehicle(new Boat(0, "white"));

        System.out.println(g);

        g.remove(Car.class);
        System.out.println(g);
        g.remove("Bike");
        System.out.println(g);
        g.remove(4);
        System.out.println(g);
    }

}
