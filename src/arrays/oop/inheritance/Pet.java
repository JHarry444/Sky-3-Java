package arrays.oop.inheritance;

public class Pet extends Object{


    private String name;
    private Person owner;
    private int noOfLegs;
    private boolean fur;
    private String diet;

    public Pet() {
        super();
    }

    public Pet(String name, Person owner, int noOfLegs, boolean fur, String diet) {
        super();
        this.name = name;
        this.owner = owner;
        this.noOfLegs = noOfLegs;
        this.fur = fur;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
}
