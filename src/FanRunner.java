public class FanRunner {

    public static void main(String[] args) {
        Fan fan = new Fan("Bajaj", 45, "Ivory");

        System.out.println(fan);

        fan.switchOn();
        System.out.println(fan);

        fan.changeSpeed((byte) 4);
        System.out.println(fan);

        fan.switchOff();
        System.out.println(fan);
    }

}
