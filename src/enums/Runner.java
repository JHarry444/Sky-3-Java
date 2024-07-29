package enums;

import java.time.LocalDate;
import java.time.Month;

public class Runner {


    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 7, 29);
        LocalDate date2 = LocalDate.of(2024, Month.APRIL, 29);


        Game game = new Game();

        for (int i = 0; i < 10; i++) game.flipCoin(CoinFlip.TAILS);
    }
}
