package oop.interfaces;

import oop.inheritance.Cat;
import oop.inheritance.Dog;
import oop.inheritance.Pet;
import oop.polymorphism.vehicle.Plane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Flyable> flying = List.of(new Bird(), new Plane(6, "Polka Dots"));
        for (Flyable f : flying) f.fly();

        List<Integer> nums = new ArrayList<>(List.of(2,4,1,123,45,34,13));
        Collections.sort(nums);
        System.out.println(nums);

        List<String> words = new ArrayList<>(List.of("aardvark", "hamster", "glasses", "red", "blue"));
        Collections.sort(words);
        System.out.println(words);

        List<Pet> pets = new ArrayList<>();

        pets.add(new Cat("Garfield", null, 4, true, "Lasagne"));
        pets.add(new Cat("Jess", null, 4, true, "Carnivore"));

        pets.add(new Dog("Ajax", null, 4, true, "postmen"));


        System.out.println("hello");

        Collections.sort(pets);

        System.out.println(pets);
    }
}
