package collections.lesson3;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class SimpleIdentityHashMap  {
    public static void main(String[] args) {
        //duplicates are allowed, as we compare by link and links are different for the same values
        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(new Integer(1), "one");
        identityHashMap.put(new Integer(11), "two");
        identityHashMap.put(new Integer(23), "tree");
        identityHashMap.put(new Integer(1), "one");
        identityHashMap.put(new Integer(23), "five");

//        Set set = identityHashMap.entrySet();
//
//        for(Object o: set) {
//            Map.Entry<Integer, String> map = (Map.Entry<Integer, String > ) o;
//            System.out.println(map.getKey() + " " + map.getValue());
//        }

// alternative way
        for(Map.Entry<Integer, String> map: identityHashMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

        System.out.println();

        //duplicates are NOT allowed (as we compare by value)
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(new Integer(1), "one");
        hashMap.put(new Integer(11), "two");
        hashMap.put(new Integer(23), "tree");
        hashMap.put(new Integer(1), "one");
        hashMap.put(new Integer(23), "five");


        for(Map.Entry<Integer, String> map: hashMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }
}
