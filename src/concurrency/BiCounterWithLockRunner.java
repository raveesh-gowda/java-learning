package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BiCounterWithLocks {
    private final Lock lockForI = new ReentrantLock();
    private final Lock lockForJ = new ReentrantLock();
    private int i = 0;
    private int j = 0;

    public void incrementI() {
        lockForI.lock();
        i++;
        lockForI.unlock();
    }

    public void incrementJ() {
        lockForJ.lock();
        j++;
        lockForJ.unlock();
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}

public class BiCounterWithLockRunner {

    public static void main(String[] args) {
        BiCounterWithLocks counter = new BiCounterWithLocks();

        counter.incrementI();
        counter.incrementJ();
        counter.incrementI();

        System.out.println(counter.getI());
        System.out.println(counter.getJ());
    }

}
