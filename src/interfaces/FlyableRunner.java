package interfaces;

interface Flyable {
    void fly();
}

class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird can fly.");
    }
}

class Animal implements Flyable {

    @Override
    public void fly() {
        System.out.println("Animal cannot fly.");
    }
}

public class FlyableRunner {

    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Animal(), new Bird()};
        for (Flyable object : flyingObjects) {
            object.fly();
        }
    }

}
