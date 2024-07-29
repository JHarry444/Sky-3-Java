package objects;

import objects.trainers.Trainer;

public class Runner {

    public static void main(String[] args) {
        Trainer me = new Trainer();
        me.setName("Jordan");
        me.setSpecialism("Software");
        me.setTimeServed(-Integer.MAX_VALUE);

        System.out.println(me.intro());

        Trainer pb = new Trainer("Piers", "DevOps", 28);


        System.out.println(pb.intro());
    }
}
