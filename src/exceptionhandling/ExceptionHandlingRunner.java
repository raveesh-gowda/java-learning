package exceptionhandling;

public class ExceptionHandlingRunner {

    public static void main(String[] args) {
        methodOne();
        System.out.println("Main Ended");
    }

    private static void methodOne() {
        methodTwo();
        System.out.println("Method One Ended");
    }

    private static void methodTwo() {
        String str = null;
        str.length();
        System.out.println("Method Two Ended");
    }

}
