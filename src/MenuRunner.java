import java.util.Scanner;

public class MenuRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("The first number you entered is: " + numberOne);

        System.out.println("Enter second number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("The second number you entered is: " + numberTwo);

        System.out.println("Select The Operation Choice");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        System.out.println("Your Inputs Are:");
        System.out.println("Number 1: " + numberOne);
        System.out.println("Number 2: " + numberTwo);
        System.out.println("Choice: " + choice);

        Menu menu = new Menu();

        menu.runUsingIfElseIfElse(choice, numberOne, numberTwo);
        menu.runUsingSwitch(choice, numberOne, numberTwo);
    }

}
