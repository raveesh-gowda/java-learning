package code_with_harry;

import java.util.HashSet;

public class cwh_hashset {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(6, 0.6f);

        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(11);
        hashSet.add(11);

        System.out.println(hashSet);
        System.out.println(hashSet.size());
    }

}
