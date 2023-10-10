package collections.lesson1.InterfaceComparatorWithObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //sorting objects in Array using Comparator
//        Animal cat = new Animal("cat", 7, 25, 5000);
//        Animal dog = new Animal("dog", 30, 20, 4000);
//        Animal bird = new Animal("bird", 15, 8, 50000);
//
//        Animal[] c = {cat, dog, bird};

        //sorting objects in Collections using Comparator
        List<Animal> c = new ArrayList<>();
       c.add(new Animal("cat", 7, 25, 5000));
       c.add(new Animal("dog", 30, 20, 4000));
       c.add(new Animal("bird", 15, 8, 50000));

        //Arrays.sort(c, new Animal.ComparatorByPrice());
        Collections.sort(c, new Animal.ComparatorByPrice());

        for (Animal temp: c) {
            System.out.println(temp);
        }
        System.out.println();

        //Arrays.sort(c, new Animal.ComparatorByPrice());
        Collections.sort(c, new Animal.ComparatorBySpeed());

        for (Animal temp: c) {
            System.out.println(temp);
        }
        System.out.println();

        //Arrays.sort(c, new Animal.ComparatorByPrice());
        Collections.sort(c, new Animal.ComparatorByBreed());

        for (Animal temp: c) {
            System.out.println(temp);
        }
        System.out.println();
    }


}
