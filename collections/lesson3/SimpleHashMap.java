package collections.lesson3;

import java.util.HashMap;

public class SimpleHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(null, 25);
        hm.put("one", 1);
        hm.put("two", 2);

        System.out.println(hm.get(null));
        System.out.println(hm);
    }
}
