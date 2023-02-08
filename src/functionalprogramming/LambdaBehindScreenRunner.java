package functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return number % 2 == 0;
    }

}

class NumberSquareMapper implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer number) {
        return number * number;
    }

}

class SysOutConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer num) {
        System.out.println(num);
    }

}

public class LambdaBehindScreenRunner {

    public static void main(String[] args) {
        List.of(23, 43, 34, 45).stream()
                .filter(num -> num % 2 == 0)
                .map(ele -> ele * ele)
                .forEach(e -> System.out.println(e));

        List.of(23, 43, 34, 45).stream()
                .filter(new EvenNumberPredicate())
                .map(new NumberSquareMapper())
                .forEach(new SysOutConsumer());
    }

}
