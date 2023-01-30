package basics;

public class Fan {
    //state
    private final String make;
    private final float radius;
    private final String color;
    private boolean isOn;
    private byte speed;

    //constructor
    public Fan(String make, float radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    //methods
    public void switchOn() {
        this.isOn = true;
        changeSpeed((byte) 1);
    }

    public void switchOff() {
        this.isOn = false;
        changeSpeed((byte) 0);
    }

    public void changeSpeed(byte num) {
        this.speed = num;
    }

    public String toString() {
        return String.format("Make : %s, Radius : %f, Color : %s, Is On : %b, Speed : %d",
                make,
                radius,
                color,
                isOn,
                speed);
    }

}
