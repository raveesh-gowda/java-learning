public class MotorBike {
    //data or state
    private int speed; //member variable

    MotorBike() {
        //this.speed = 5; //to set default value
        this(5);
    }

    MotorBike(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }

    //behaviour or action
    void start() {
        System.out.println("Bike started");
    }

}
