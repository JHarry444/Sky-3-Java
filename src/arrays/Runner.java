package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println(nums[0]);
        nums[0] = 12;
        System.out.println(nums[0]);

        System.out.println(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("I: " + i + " NUM: " + nums[i]);
        }

        for (int num : nums) {
            System.out.println("NUM: " + num);

        }


        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(3);
        numList.add(5);
        numList.add(7);
        numList.add(9);
        numList.add(11);

        System.out.println("NUMLIST: " + numList);

        System.out.println(numList.get(0));

        numList.remove(1);

        System.out.println(numList);


        List<String> words = new LinkedList<>();

        words.add("Hello");
        words.add("World!");

        System.out.println(words);

        words.remove(0);
        words.remove("World!");

        System.out.println(words);

        List<String> trainers = new ArrayList<>(List.of("Jordan", "Victoria"));
        System.out.println(trainers);

        trainers.add("Piers");

        for (int  i = 0; i < trainers.size(); i++) {
            System.out.println("I: " + i + " TRAINER: " + trainers.get(i));
        }


    }
}
