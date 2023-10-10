package collections.lesson3;

import java.util.HashMap;
import java.util.Map;

public class WeakHashMap {
    public static void main(String[] args) {
//        //In Java we have four types of references
//        //strong reference. Until we have at least one the object won't be deleted by GC
//        Integer test = 1;
//        //soft reference
//        SoftReference<Integer> softReference = new SoftReference<>(test);
//        //when we delete strong ref even though we have soft ref the object will be deleted
//        //when java needs more memory
//        //test = null;
//
//        //weak reference
//        WeakReference<Integer> weakReference = new WeakReference<>(test);
//
//        //when we delete strong ref even though we have weak ref the object will be deleted at once
//        test = null;
//
//
//        //phantom reference
//        PhantomReference<Integer> phantomReference = new PhantomReference<>(test, new ReferenceQueue<>());
        Map<String, String> weakHashMap = new java.util.WeakHashMap<>();
        Map<String, String> hashMap = new HashMap<>();

        String keyWeakHashMap = new String("keyWeakHashMap");
        String keyHashMap = new String("keyHashMap");
        weakHashMap.put(keyWeakHashMap, "weakHash");
        hashMap.put(keyHashMap, "Hash");


        System.out.println("Before GC, weak = " + weakHashMap.get("keyWeakHashMap") + " hash = " + hashMap.get("keyHashMap"));

        keyWeakHashMap = null;
        keyHashMap = null;


//call for Garbage Collector manually
        System.gc();
        System.out.println("After GC, weak = " + weakHashMap.get("keyWeakHashMap") + " hash = " + hashMap.get("keyHashMap"));
    }
}
