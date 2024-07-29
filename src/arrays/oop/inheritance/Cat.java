package arrays.oop.inheritance;

public class Cat extends Pet{

    public Cat() {
        super();
        this.setDiet("Carnivore");
        this.setNoOfLegs(4);
        this.setFur(true);
    }

    public Cat(String name, Person owner, int noOfLegs, boolean fur, String diet) {
        super(name, owner, noOfLegs, fur, diet);
    }

    public void meow() {
        System.out.println("MEOW");
    }

    public void bask() {

    }


}
