package collections.lesson2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SimpleHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("monday");
        hashSet.add("tuesday");
        hashSet.add("wednesday");
        hashSet.add("thursday");
        hashSet.add("friday");


        //the order is random
        for (String text: hashSet) {
            System.out.println(text + " " + text.hashCode());

        }

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("monday");
        linkedSet.add("tuesday");
        linkedSet.add("wednesday");
        linkedSet.add("thursday");
        linkedSet.add("friday");
        //the order is the same as elements were added
        for (String text: linkedSet) {
            System.out.println(text + " " + text.hashCode());

        }

    }

}
