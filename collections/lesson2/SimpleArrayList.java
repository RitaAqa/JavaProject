package collections.lesson2;

import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
//        al.add(10);
//        al.add(20);
//        al.add(0, 30);
//        al.add(40);
//        al.add(50);
//
//        for (Integer integer : al) {
//            System.out.println(integer);
//        }

        for (int i = 0; i < 100; i++) {
            al.add(i);
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        System.out.println(al.size());

        for (int i = 0; i < 50; i++) {
            al.remove(0);
        }

        System.out.println(al.size());
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }

        //after we delete 50 elements we still has capacity 100
        //even though our size now is 50. To clear the memory we can use trimToSize method
    }
}
