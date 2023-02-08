package functionalprogramming;

import java.util.List;

public class MethodReferenceRunner {

    public static void print(Integer number) {
        System.out.println(number);
    }

    public static boolean isEven(Integer number) {
        return (number % 2 == 0);
    }

    public static void main(String[] args) {
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.length())
                .forEach(l -> MethodReferenceRunner.print(l));

        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(String::length)
                .forEach(MethodReferenceRunner::print);  // or forEach(System.out::println);

        int max = List.of(23, 45, 67, 34).stream()
                .filter(num -> num % 2 == 0)
                .max((n1, n2) -> Integer.compare(n1, n2))
                .orElse(0);

        System.out.println(max);
        
        int maximum = List.of(23, 45, 67, 34).stream()
                .filter(MethodReferenceRunner::isEven)
                .max(Integer::compare)
                .orElse(0);

        System.out.println(maximum);
    }

}
