package exceptionhandling;

public class CheckedExceptionRunner {

    public static void main(String[] args) {
        try {
            someOtherMethod();
            Thread.sleep(2000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void someOtherMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

}
