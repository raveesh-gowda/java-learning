public class MultiplicationTable {

    void multiply() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
        }
    }

    void multiplyUsingParameter(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", a, i, a * i).println();
        }
    }

}
