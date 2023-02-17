package code_with_harry;

import java.util.ArrayDeque;
import java.util.Deque;

public class cwh_arraydeque {

    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(2);
        arrayDeque.addLast(24);
        arrayDeque.add(12);
        arrayDeque.add(22);

        System.out.println(arrayDeque);

        arrayDeque.remove();
        arrayDeque.addFirst(45);
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());

        arrayDeque.clear();
        System.out.println(arrayDeque);
    }

}
