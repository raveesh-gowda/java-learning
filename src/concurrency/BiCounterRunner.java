package concurrency;

public class BiCounterRunner {

    public static void main(String[] args) {
        BiCounter counter = new BiCounter();
        
        counter.incrementI();
        counter.incrementJ();
        counter.incrementI();

        System.out.println(counter.getIValue());
        System.out.println(counter.getJValue());
    }

}
