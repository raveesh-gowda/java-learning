package concurrency;

public class Counter {
    private int i = 0;

    synchronized public void increment() {
        i++;
        // operations involved
        // get value of i
        // increment by 1
        // set the value of i
    }

    public int getValue() {
        return i;
    }

}
