public class Menu {
    public void runUsingIfElseIfElse(int choice, int numberOne, int numberTwo) {
        if (choice == 1) {
            System.out.println("Result = " + (numberOne + numberTwo));
        } else if (choice == 2) {
            System.out.println("Result = " + (numberOne - numberTwo));
        } else if (choice == 3) {
            System.out.println("Result = " + (numberOne * numberTwo));
        } else if (choice == 4) {
            System.out.println("Result = " + (numberOne / numberTwo));
        } else {
            System.out.println("Invalid Operation");
        }
    }

    public void runUsingSwitch(int choice, int numberOne, int numberTwo) {
        switch (choice) {
            case 1:
                System.out.println("Result = " + (numberOne + numberTwo));
                break;
            case 2:
                System.out.println("Result = " + (numberOne - numberTwo));
                break;
            case 3:
                System.out.println("Result = " + (numberOne * numberTwo));
                break;
            case 4:
                System.out.println("Result = " + (numberOne / numberTwo));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }

}
