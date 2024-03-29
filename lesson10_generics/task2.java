package lesson10_generics;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static class MyList <T>{
            List<T> list = new ArrayList<T>();

            public List<T> getList() {
                return list;
            }

            public void addMeth(T t) {
                list.add(t);
            }

            public int indexOfMeth(T t) {
                return list.indexOf(t);

            }

            public int count() {
                return list.size();
            }

            public static void main(String[] args) {
                // Создание собственного списка на основе List
                MyList<String> list = new MyList<String>();
                list.addMeth("123");
                list.addMeth("234");

                System.out.println(list.getList());
                System.out.println("Index = " + list.indexOfMeth("123"));
                System.out.println("Count = " + list.count());
            }
        }
}
