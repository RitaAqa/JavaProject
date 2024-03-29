package collections.lesson1.InterfaceComparatorWithObjects;

import java.util.Comparator;

public class Animal {

    String breed;
    int weight;
    int speed;
    int price;


    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }


    @Override
    public String toString() {
        return this.breed + " " + this.price + " " + this.speed + " " + this.weight;
    }

     static class ComparatorByPrice implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Animal) o1).price - ((Animal) o2).price;
        }
    }
      static class ComparatorBySpeed implements Comparator {
        public int compare(Object o1, Object o2) {

            return ((Animal) o1).speed - ((Animal) o2).speed;
        }
    }
     static class ComparatorByBreed implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Animal) o1).breed.compareTo(((Animal) o2).breed);
        }
    }




}
