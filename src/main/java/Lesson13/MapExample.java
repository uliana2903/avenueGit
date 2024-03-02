package Lesson13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        HashMap <Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Anton");
        hashMap.put(2, "Albert");
        hashMap.put(3, "Oleg");
        hashMap.put(4, "schoolbag");
        System.out.println(hashMap);
        Set<Integer> keys = hashMap.keySet();
        System.out.println(keys);
        hashMap.replace(4, "Sergey");
        System.out.println(hashMap);
        hashMap.remove(4);
        hashMap.remove(3);
        System.out.println(hashMap);
        hashMap.put(4, "Olia");
        hashMap.put(3, "Vanya");
        System.out.println(hashMap);
        for (Map.Entry<Integer, String> temp : hashMap.entrySet()) {
            System.out.println(temp);

        }
    }
}
