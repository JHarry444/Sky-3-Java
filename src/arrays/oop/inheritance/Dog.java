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

    @Override
    public void makeNoise() {
        System.out.println("BARK!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + this.getName() + '\'' +
                ", owner=" + this.getOwner() +
                ", noOfLegs=" + this.getNoOfLegs() +
                ", fur=" + this.isFur() +
                ", diet='" + this.getDiet() + '\'' +
                '}';
    }
}
