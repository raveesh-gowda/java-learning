package functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExerciseRunner {

    public static void integersSquare() {
        IntStream.range(1, 11).map(ele -> ele * ele).forEach(ele -> System.out.println(ele));
    }

    public static void maximumValue() {
        System.out.println(List.of(4, 2, 5, 88, 0, 7).stream().max((a, b) -> Integer.compare(a, b)).get());
    }

    public static void minimumValue() {
        System.out.println(List.of(4, 2, 5, 88, 0, 7).stream().min((a, b) -> Integer.compare(a, b)).get());
    }

    public static void collectList() {
        System.out.println(List.of(4, 3, 2, 5, 6, 7).stream().filter(ele -> ele % 2 == 0).collect(Collectors.toList()));
    }

    public static void integerToList() {
        System.out.println(IntStream.range(1, 11).map(ele -> ele * ele).boxed().collect(Collectors.toList()));
    }

    public static void valuesToLowerCase(List<String> values) {
        values.stream().map(ele -> ele.toLowerCase()).forEach(ele -> System.out.println(ele));
    }

    public static void valuesLength(List<String> values) {
        values.stream().forEach(ele -> System.out.println(ele.length()));
    }

    public static void main(String[] args) {
        List<String> values = List.of("Apple", "Ant", "Bat");

        integersSquare();
        maximumValue();
        minimumValue();
        collectList();
        integerToList();
        valuesToLowerCase(values);
        valuesLength(values);
    }

}
