package code_with_harry;

import java.util.Scanner;

public class cwh_areaofrectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Area is: " + area);
    }

}
