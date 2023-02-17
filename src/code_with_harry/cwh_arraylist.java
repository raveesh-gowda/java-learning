package code_with_harry;

import java.util.ArrayList;

public class cwh_arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>(5);
        arraylist.add(12);
        arraylist.add(20);
        arraylist.add(45);

        System.out.println("Printing list1:");
        for (Integer number : arraylist)
            System.out.println("Number = " + number);

        System.out.println(arraylist);

        ArrayList<Integer> arraylist2 = new ArrayList<Integer>(5);

        arraylist2.add(25);
        arraylist2.add(30);
        arraylist2.add(31);
        arraylist2.add(35);

        System.out.println("Printing list2:");
        for (Integer number : arraylist2)
            System.out.println("Number = " + number);

        System.out.println(arraylist2);

        arraylist.addAll(2, arraylist2);

        System.out.println("Printing all the elements");

        for (Integer number : arraylist)
            System.out.println("Number = " + number);

        System.out.println(arraylist);

        System.out.println(arraylist.contains(25));
        System.out.println(arraylist.contains(10));
        System.out.println(arraylist.indexOf(25));
        System.out.println(arraylist.lastIndexOf(25));

        arraylist.add(1, 9);
        System.out.println(arraylist);

        arraylist.clear();
        System.out.println(arraylist.isEmpty());

        arraylist2.stream().filter(ele -> ele > 25).forEach(System.out::println);
    }

}
