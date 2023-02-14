package exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // ... Program logic, probably using scanner input
            int[] numbers = {1, 2, 3, 4};
            int num = numbers[5];
        }
    }

}
