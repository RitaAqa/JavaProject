package lesson5_Arrays_and_lists.task2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        // Создание списка ArrayList
        ArrayList list = new ArrayList();

        // Добавление елементов
        for (int i = 0; i < 8; i++) {
            list.add(i, "pet" + i);
        }


        // Вывод елементов в цикле
        for (Object l : list) {
            System.out.println(l);
        }
    }
}
