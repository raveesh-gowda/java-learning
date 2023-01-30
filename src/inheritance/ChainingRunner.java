package inheritance;

class ChainOne {
    public void one() {
        System.out.println("Chain One!!");
    }
}

class ChainTwo extends ChainOne {
    public void one() {
        super.one();
        System.out.println("Super Chain Two!!");
    }

    public void two() {
        System.out.println("Chain Two!!");
    }
}

class ChainThree extends ChainTwo {
    public void one() {
        super.one();
        System.out.println("Chain Three!!");
    }

    public void two() {
        super.two();
        System.out.println("Chain two and super!!");
    }
}

public class ChainingRunner {

    public static void main(String[] args) {
        ChainThree chainThree = new ChainThree();
        chainThree.one();
    }

}
