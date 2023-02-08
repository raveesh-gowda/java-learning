package functionalprogramming;

import java.util.List;

public class OddEvenSumRunner {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
        printFPEvenSum(numbers);
        printFPOddSum(numbers);
    }

    static void printFPEvenSum(List<Integer> numbers) {
        int sum = numbers.stream()
                .filter(elem -> elem % 2 == 0)
                .reduce(0, (num1, num2) -> num1 + num2);
        System.out.println("Even Numbers Sum: " + sum);
    }

    static void printFPOddSum(List<Integer> numbers) {
        int sum = numbers.stream()
                .filter(elem -> elem % 2 != 0)
                .reduce(0, (num1, num2) -> num1 + num2);
        System.out.println("Odd Numbers Sum: " + sum);
    }

}
