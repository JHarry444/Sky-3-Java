package oop.interfaces;

import oop.inheritance.Pet;

public class Bird extends Pet implements Flyable{


    @Override
    public void makeNoise() {

    }

    @Override
    public void fly() {
        System.out.println("Flap flap");
    }
}
