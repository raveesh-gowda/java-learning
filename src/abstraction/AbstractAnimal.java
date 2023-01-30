package abstraction;

abstract class Animal {
    public abstract void bark();
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Bow Bow");
    }
}

class Cat extends Animal {
    public void bark() {
        System.out.println("Meow Meow");
    }
}

public class AbstractAnimal {

    public static void main(String[] args) {
        Animal[] animalObject = {new Cat(), new Dog()};
        for (Animal object : animalObject) {
            object.bark();
        }
    }

}
