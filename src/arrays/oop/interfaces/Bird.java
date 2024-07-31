package arrays.oop.interfaces;

import arrays.oop.inheritance.Pet;

public class Bird extends Pet implements Flyable{


    @Override
    public void makeNoise() {

    }

    @Override
    public void fly() {
        System.out.println("Flap flap");
    }
}
