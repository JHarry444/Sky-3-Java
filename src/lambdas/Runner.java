package lambdas;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Runner {


    public static void main(String[] args) {
        Calculation add = (a, b) -> a + b;

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = num -> num % 2 == 0;

        Predicate<Integer> isOdd = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 != 0;
            }
        };

        nums.stream().filter(isEven).forEach(num -> System.out.println("NUM: " + num));

        List<Integer> even = nums.stream().filter(num -> num % 2 == 0).toList();

        nums.stream().reduce((acc, next) -> {
            if (next > acc) return next;
            else return acc;


        }).ifPresent(num -> System.out.println("MAX: " + num));

        nums.stream().reduce((acc, next) -> acc + next).ifPresent(num -> System.out.println("SUM: " + num));

        nums.forEach(num -> System.out.println(num));
        // shortcut
        nums.forEach(System.out::println);


        Optional<Integer> optInt =  nums.stream().reduce(Math::max);

        optInt.ifPresentOrElse(
                (max) -> System.out.println("MAX: " + max),
                () ->System.out.println("No max found")
        );
    }
}
