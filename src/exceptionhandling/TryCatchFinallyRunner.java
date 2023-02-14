package exceptionhandling;

import java.util.Scanner;

public class TryCatchFinallyRunner {

    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//            int number = numbers[2];
            int number = numbers[33];
            System.out.println(number);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Before Scanner Closed");
            scanner.close();
        }

        System.out.println("Just Before Closing Out Main");
    }

}
