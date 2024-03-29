package lesson5_Arrays_and_lists.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создание списка ArrayList
        ArrayList list = new ArrayList();

        // Добавление елементов
        list.add("Teacher1");
        list.add("Teacher2");
        list.add("Teacher3");
        list.add("Teacher4");

        // Вывод елементов в цикле
        for (Object l : list) {
            System.out.println(l);
        }

        System.out.println("\nИндекс хорошего учителя = " + list.get(0));
        System.out.println("Индекс плохого учителя = " + list.get(list.size() - 1));
    }
}