package conditionals;

import java.util.Random;

public class Runner {

    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(100);

        if (i % 2 == 0) System.out.println("Even");
        else if (i % 2 != 0) System.out.println("Odd");
        else System.out.println("Invalid number");


        if (i > 20 && i %  2 == 0) {

        }

        if (i > 20 & i %  2 == 0) {

        }

        int day = 1;


        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
        }

        System.out.println(isEven(24));
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void print(String s) {
        if (s == null) {
            System.out.println("Please provide a string");
            return;
        }
        System.out.println(s);

    }


}
