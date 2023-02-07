package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {

    static <X> X doSomething(X value) {
        return value;
    }

    static <X extends List> void duplicate(X list) {
        list.addAll(list);
    }

    static double sumOfNumberList(List<? extends Number> numbers) { //upper bound
        double value = 0.0;
        for (Number number : numbers) {
            value += number.doubleValue();
        }
        return value;
    }

    static void addAFewNumbers(List<? super Number> numbers) { //lower bound
        numbers.add(1);
        numbers.add(1L);
        numbers.add(1.0);
        numbers.add(1.0f);
    }

    public static void main(String[] args) {
        MyCustomList<String> listStrings = new MyCustomList();

        listStrings.addElement("Element-1");
        listStrings.addElement("Element-2");
        String value = listStrings.get(1);

        System.out.println(listStrings);
        System.out.println(value);

        MyCustomList<Integer> listIntegers = new MyCustomList();

        listIntegers.addElement(Integer.valueOf(1));
        listIntegers.addElement(Integer.valueOf(2));
        Integer number = listIntegers.get(1);

        System.out.println((listIntegers));
        System.out.println(number);

        String text = doSomething("Hello");
        Integer val = doSomething(Integer.valueOf(7));

        ArrayList<String> list = doSomething(new ArrayList<String>(List.of("A", "B", "C")));
        duplicate(list);
        System.out.println(list);

        LinkedList<Integer> list2 = doSomething(new LinkedList<Integer>(List.of(1, 2, 3)));
        duplicate(list2);
        System.out.println(list2);

        System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
        System.out.println(sumOfNumberList(List.of(1.1, 2.1, 3.1, 4.1, 5.1)));
        System.out.println(sumOfNumberList(List.of(1L, 2L, 3L, 4L, 5L)));

        List<Number> numberList = new ArrayList<>();
        addAFewNumbers(numberList);
        System.out.println(numberList);
    }

}
