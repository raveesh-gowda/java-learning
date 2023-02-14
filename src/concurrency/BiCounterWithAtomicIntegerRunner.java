package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

class BiCounterWithAtomicInteger {
    private final AtomicInteger i = new AtomicInteger();
    private final AtomicInteger j = new AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger AtomicInteger = new AtomicInteger();

    public void incrementI() {
        i.incrementAndGet();
    }

    public void incrementJ() {
        j.incrementAndGet();
    }

    public int getI() {
        return i.get();
    }

    public int getJ() {
        return j.get();
    }
}

class BiCounterWithAtomicIntegerRunner {

    public static void main(String[] args) {
        BiCounterWithAtomicInteger counter = new BiCounterWithAtomicInteger();

        counter.incrementI();
        counter.incrementJ();
        counter.incrementI();

        System.out.println(counter.getI());
        System.out.println(counter.getJ());
    }

}
