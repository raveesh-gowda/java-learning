package basics;

public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike ninja = new MotorBike(100);
        MotorBike honda = new MotorBike(200);

        MotorBike somethingElse = new MotorBike();

        System.out.println(ninja.getSpeed());
        System.out.println(honda.getSpeed());

        ninja.start();
        ninja.setSpeed(100);
        System.out.println(ninja.getSpeed());

        ninja.increaseSpeed(100);
        System.out.println(ninja.getSpeed());

        ninja.decreaseSpeed(80);
        System.out.println(ninja.getSpeed());

        honda.start();
        honda.setSpeed(80);
        System.out.println(honda.getSpeed());

        honda.increaseSpeed(100);
        System.out.println(honda.getSpeed());

        honda.decreaseSpeed(180);
        System.out.println(honda.getSpeed());
    }

}
