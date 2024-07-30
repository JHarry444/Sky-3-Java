package arrays.oop.polymorphism;

import arrays.oop.inheritance.Cat;
import arrays.oop.inheritance.Dog;
import arrays.oop.inheritance.Pet;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Cat c = new Cat("Tiddles", null, 4, true, "vegan");

        Dog d = new Dog();


        c.makeNoise();

        d.makeNoise();

        System.out.println(c);
        System.out.println(d);

        Pet p = new Dog("Rex", null, 4, true, "seafood");

        System.out.println(p);

        Pet p2 = new Cat();

        System.out.println(p2);

        System.out.println(p2 instanceof Cat);

        List<Pet> pets = List.of(p, p2);

        for (Pet pet : pets) {
            pet.makeNoise();
            if (pet instanceof Cat)
                ((Cat) pet).bask();

            if (pet.getClass().getSimpleName().equals("Cat"))
                ((Cat) pet).bask();
        }

    }
}
