package collections.lesson2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SimpleTreeSet {

    public static void main(String[] args) {
        //we use navigable because simple Set doesn't contain ceiling()   method
        NavigableSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(4);
        ts.add(-9);
        ts.add(5);
        System.out.println(ts);

        System.out.println(ts.add(1)); //false
        System.out.println(ts);
        //ceiling() returns the closest element above from TreeSet to specified element
        System.out.println(ts.ceiling(2));
    }

}
