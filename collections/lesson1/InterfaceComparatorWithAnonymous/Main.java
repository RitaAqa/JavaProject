package collections.lesson1.InterfaceComparatorWithAnonymous;


import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        AnimalAnon cat = new AnimalAnon("cat", 7, 25, 5000);
        AnimalAnon dog = new AnimalAnon("dog", 30, 20, 4000);
        AnimalAnon bird = new AnimalAnon("bird", 15, 8, 50000);

        AnimalAnon[] c = {cat, dog, bird};

        Arrays.sort(c, new Comparator<AnimalAnon>() {
            public int compare(AnimalAnon o1, AnimalAnon o2) {
                return o1.price - o2.price;
            }
        });

        for (AnimalAnon temp: c) {
            System.out.println(temp);
        }
        System.out.println();

        Arrays.sort(c, new Comparator<AnimalAnon>() {
            public int compare(AnimalAnon o1, AnimalAnon o2) {
                return o1.speed - o2.speed;
            }
        });

        for (AnimalAnon temp: c) {
            System.out.println(temp);
    }
        System.out.println();

        Arrays.sort(c, new Comparator<AnimalAnon>() {
            public int compare(AnimalAnon o1, AnimalAnon o2) {
                return o1.breed.compareTo(o2.breed);
            }
        });


        for (AnimalAnon temp: c) {
            System.out.println(temp);
        }
        System.out.println();
    }

}
