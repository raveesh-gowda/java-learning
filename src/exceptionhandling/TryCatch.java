package exceptionhandling;

public class TryCatch {

    public static void main(String[] args) {
        methodOne();
        System.out.println("Main Ended");
    }

    private static void methodOne() {
        methodTwo();
        System.out.println("Method One Ended");
    }

    private static void methodTwo() {
        try {
            String str = null;
            str.length();
//            int[] i = {1, 2};
//            int number = i[3];
            System.out.println("Method Two Ended");
        } catch (NullPointerException ex) {
            System.out.println("Matched Null Pointer Exception");
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Matched Array Index Out Of Bounds Exception");
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
