package code_with_harry;

import java.util.HashMap;

public class cwh_hashmap {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "This is one.");
        hashMap.put(2, "This is two.");
        hashMap.put(3, "This is three.");
        hashMap.putIfAbsent(4, "This is four.");

        System.out.println(hashMap);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());
        System.out.println(hashMap.remove(2));
        System.out.println(hashMap.containsKey(2));
    }

}
