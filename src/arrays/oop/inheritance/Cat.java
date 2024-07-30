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

    @Override
    public void makeNoise() {
        System.out.println("MEOW");
    }

    public void bask() {
        System.out.println("so sunny");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.getName() + '\'' +
                ", owner=" + this.getOwner() +
                ", noOfLegs=" + this.getNoOfLegs() +
                ", fur=" + this.isFur() +
                ", diet='" + this.getDiet() + '\'' +
                '}';
    }
}
