package lesson5_Arrays_and_lists.task3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        // Создание списка ArrayList
        ArrayList list = new ArrayList();

        // Добавление елементов
        list.add("Пантера");
        list.add("Слон");
        list.add("Лев");
        list.add("Бегемот");
        list.add("Носорог");
        list.add("Пингвин");
        list.add("Медведь");
        list.add("Горилла");
        list.add("Тигр");
        list.add("Обезьяна");
        System.out.println("List size: " + list.size());

        list.remove(2);
        list.remove(4);
        list.remove(6);

        System.out.println("List size: " + list.size());

        // Вывод елементов в цикле
        for (Object l : list) {
            System.out.println(l);
        }
    }
}
