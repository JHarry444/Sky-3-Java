package objects.trainers;

public class Trainer {

    // instance variables
    private String name;
    private String specialism;
    private int timeServed;

    public Trainer() {
        // default constructor
        // provided if no other constructor exists
    }

    public Trainer(String name, String specialism, int timeServed) {
        this.name = name;
        this.specialism = specialism;
        this.timeServed = timeServed;
    }

    public String intro() {
        return "Hello, my name is " + this.name +
                ". I am a " + this.specialism + " trainer and I have been here for " + this.timeServed + " years.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialism() {
        return specialism;
    }

    public void setSpecialism(String specialism) {
        this.specialism = specialism;
    }

    public int getTimeServed() {
        return timeServed;
    }

    public void setTimeServed(int timeServed) {

        if (timeServed < 0 || timeServed > 30) {
            System.out.println("Invalid time: " + timeServed);
            return;
        }
        this.timeServed = timeServed;
    }
}
