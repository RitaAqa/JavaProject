package collections.lesson1;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String, Integer > map = new HashMap<>();
        map.put("world", 100);
        map.put("world1", 200);
        map.put("world2", 300);
        map.put(null, 400);  // null is OK
        System.out.println(map.size());
        System.out.println(map);


        // without sort
        for (Map.Entry<String, Integer> tmp : map.entrySet() ){
            System.out.println(tmp.getKey() + " " +tmp.getValue());
        }
    }

}
