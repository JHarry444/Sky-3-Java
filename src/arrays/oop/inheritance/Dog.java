package arrays.oop.inheritance;

public class Dog extends Pet{


    public Dog() {
        super();
        this.setDiet("Omnivore");
        this.setNoOfLegs(4);
        this.setFur(true);
    }

    public Dog(String name, Person owner, int noOfLegs, boolean fur, String diet) {
        super(name, owner, noOfLegs, fur, diet);
    }

    public void woof() {
        System.out.println("BARK!");
    }

}
