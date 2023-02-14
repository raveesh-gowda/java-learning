package concurrency;

public class BiCounter {
    private int i = 0;
    private int j = 0;

    synchronized public void incrementI() {
        i++;
    }

    synchronized public void incrementJ() {
        j++;
    }

    public int getIValue() {
        return i;
    }

    public int getJValue() {
        return j;
    }
}
