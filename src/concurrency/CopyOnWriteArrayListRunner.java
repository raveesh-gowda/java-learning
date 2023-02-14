package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        // Total of 3 threads doing add()'s, maybe in a separate method
        list.add("Ant");
        list.add("Bat");
        list.add("Cat");

        //Total of 10000 threads looping on get(), again, in a separate method
        for (String element : list) {
            System.out.println(element);
        }
    }
}
