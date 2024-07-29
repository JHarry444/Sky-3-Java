package loops;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            if (i > 5) break;
            System.out.println("I: "+ i);
        }
        for (int i = 9; i >= 0; i-= 3) {
            System.out.println("I: "+ i);
        }

        Scanner scan = new Scanner(System.in);

        Integer num = null;
        do {
            System.out.println("Please enter a number from 1 -> 10");

            num = Integer.parseInt(scan.nextLine());

            if (num < 1 || num > 10) {
                System.out.println("Invalid num: " + num);
            }
        }while (num < 0 || num > 10);

        System.out.println("NUM: " + num);
    }
}
