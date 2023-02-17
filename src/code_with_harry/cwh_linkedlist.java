package code_with_harry;

import java.util.LinkedList;

public class cwh_linkedlist {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Raveesh");
        linkedList.add("Raghu");
        linkedList.addFirst("RK");
        linkedList.add("Raghavendra");
        linkedList.addLast("RGK");

        System.out.println(linkedList.contains("rgk"));
        System.out.println(linkedList.contains("rgk".toUpperCase()));
        System.out.println(linkedList.indexOf("rgk"));
        System.out.println(linkedList.indexOf("rgk".toUpperCase()));

        System.out.println("Linked List 1: " + linkedList + " and size is: " + linkedList.size());

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("GK");
        linkedList2.addAll(linkedList);
        linkedList2.addFirst(String.valueOf(linkedList));
        linkedList2.removeLast();
        linkedList2.remove("Raghu");
        linkedList2.addFirst("GK");

        System.out.println("Linked List 2: " + linkedList2 + " and size is: " + linkedList2.size());
    }

}

