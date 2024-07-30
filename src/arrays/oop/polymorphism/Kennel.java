package arrays.oop.polymorphism;

import arrays.oop.inheritance.Pet;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Pet> pets = new ArrayList<>();


    public boolean addPet(Pet p) {
        return this.pets.add(p);
    }


    @Override
    public String toString() {
        return "Kennel{" +
                "pets=" + pets +
                '}';
    }
}
