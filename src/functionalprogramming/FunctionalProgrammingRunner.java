package functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

    public static <T> void printBasic(List<T> values) {
        for (T value : values) {
            System.out.println(value);
        }
    }

    public static <T> void printFP(List<T> values) {
        values.stream().forEach(ele -> System.out.println(ele));
    }

    public static void printFilteredValues(List<String> list) {
        list.stream().filter(ele -> ele.endsWith("na")).forEach(el -> System.out.println(el));
    }

    public static void printFilteredNumbers(List<Integer> number) {
        number.stream().filter(ele -> ele % 2 == 0).forEach(el -> System.out.println(el));
    }

    public static void printSum(List<Integer> number) {
        int sum = 0;
        for (int n : number) {
            sum += n;
        }
        System.out.println(sum);
    }

    public static void printSumReduce(List<Integer> number) {
        int sum = number.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
        List<Integer> number = List.of(1, 2, 3, 4);

        printBasic(list);
        printFP(list);
        printFilteredValues(list);

        printBasic(number);
        printFP(number);
        printFilteredNumbers(number);
        printSum(number);
        printSumReduce(number);
    }

}
