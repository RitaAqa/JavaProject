package collections.lesson1;

import java.util.*;

public class AnimalSortUsingComparableInterface implements Comparable {


    String breed;
    int weight;
    int speed;
    int price;


    public AnimalSortUsingComparableInterface(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {

        //sort by Strings
        return this.breed.compareTo(((AnimalSortUsingComparableInterface) o).breed);
        //sort by numbers
//        if (this.weight > ((AnimalSortUsingComparableInterface) o).weight) {
//            return 1;
//        } else if (this.weight < ((AnimalSortUsingComparableInterface) o).weight) {
//            return -1;
//        } else {
//            return 0;
//        }
   }

    @Override
    public String toString() {
        return this.breed + " " + this.price + " " + this.speed + " " + this.weight;
    }

    public static void main(String[] args) {
        //sorting objects in Array using Comparable
        AnimalSortUsingComparableInterface cat = new AnimalSortUsingComparableInterface("cat", 7, 25, 5000);
        AnimalSortUsingComparableInterface dog = new AnimalSortUsingComparableInterface("dog", 30, 20, 4000);
       AnimalSortUsingComparableInterface bird = new AnimalSortUsingComparableInterface("bird", 15, 8, 50000);
        AnimalSortUsingComparableInterface[] c = {cat, dog, bird};

        Arrays.sort(c);

//sorting objects in Collections using Comparable
//        List<AnimalSortUsingComparableInterface> c = new ArrayList<>();
//        c.add(new AnimalSortUsingComparableInterface("cat", 7, 25, 5000));
//        c.add(new AnimalSortUsingComparableInterface("dog", 30, 20, 4000));
//        c.add(new AnimalSortUsingComparableInterface("bird", 15, 8, 50000));
//
//        Collections.sort(c);

        for (AnimalSortUsingComparableInterface a: c) {
            System.out.println(a);
        }
    }
}
