package collections.lesson1;

import java.util.Arrays;

public class SortNotCustomObjectsInArrayOrCollections {
    public static void main(String[] args) {


        int[] marks = {6, 7, 2, -1, 0};
        String[] students = {"Alex", "Mary", "John", "Kat"};
        Integer[] marks2 = {6, 7, 2, -1, 0};

// we can use default sort() method in Arrays or Collections classes without Comparable or Comparator  when sorting simple types
         Arrays.sort(marks);
        Arrays.sort(students);
        Arrays.sort(marks2);

        for (int temp: marks) {
            System.out.println(temp + "");
        }
        System.out.println();
        for (String temp: students) {
            System.out.println(temp + "");
        }
        for (Integer temp: marks2) {
            System.out.println(temp + "");
        }

    }
}
