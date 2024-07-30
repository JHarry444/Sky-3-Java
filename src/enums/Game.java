package enums;

import java.util.Random;

public class Game {

    public boolean flipCoin(String call) {

        if (call == null || (!call.trim().equalsIgnoreCase("heads")
                && !call.trim().equalsIgnoreCase("tails")
                && !call.trim().equalsIgnoreCase("edge"))) {

        }
        CoinFlip actual = null;
        Random rand = new Random();

        int randNum = rand.nextInt(101);

        if (randNum < 50) actual = CoinFlip.TAILS;
        else if (randNum < 100) actual = CoinFlip.HEADS;
        else actual = CoinFlip.EDGE;

        System.out.println("CALL: " + call);
        System.out.println("ACTUAL: " + actual);

        return actual.equals(call.toString().toLowerCase());

    }


    public boolean flipCoin(CoinFlip call) {
        CoinFlip actual = null;
        Random rand = new Random();

        int randNum = rand.nextInt(101);

        if (randNum < 50) actual = CoinFlip.TAILS;
        else if (randNum < 100) actual = CoinFlip.HEADS;
        else actual = CoinFlip.EDGE;

        System.out.println("CALL: " + call);
        System.out.println("ACTUAL: " + actual);

        return actual == call;

    }
}
