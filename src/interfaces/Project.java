package interfaces;

public class Project {

    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new DummyComplexAlgorithm();
        System.out.println(algorithm.complexAlgorithm(5, 6));

        ComplexAlgorithm algorithmOne = new RealComplexAlgorithm();
        System.out.println(algorithmOne.complexAlgorithm(5, 6));
    }

}
