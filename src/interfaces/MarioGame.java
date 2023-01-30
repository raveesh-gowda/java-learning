package interfaces;

public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void right() {
        System.out.println("Go right");
    }

    @Override
    public void down() {
        System.out.println("Go inside a hole");
    }

    @Override
    public void left() {
        System.out.println("Go left");
    }
}
