package lesson8_Exceptions.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Worker {
    public Worker(String name, String surname, String job, int year) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.year = year;
    }

    String name;
    String surname;
    String job;
    int year;

    @Override
    public String toString() {
        return "Name: " + name + "  Surname: " + surname + "    Job: " + job + "    Year: " + year;
    }


    // Метод для валидности даты
    public static boolean isThisDateValid(String dateToValidate, String dateFromat) {
        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
        sdf.setLenient(false);

        try {
            // if not valid, it will throw ParseException
            Date date = sdf.parse(dateToValidate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Worker[] workers = new Worker[5];

        for (int i = 0 ; i < workers.length; i++ ) {
            System.out.print("Input name: ");
            String name = reader.readLine();

            System.out.print("Input surname: ");
            String surname = reader.readLine();

            System.out.print("Input job: ");
            String job = reader.readLine();

            System.out.print("Input b: ");
            int year = Integer.parseInt(reader.readLine());
            if (year < 1900) {
                throw new Exception("sadasd");
            }

            workers[i] = new Worker(name, surname, job, year);
        }

        for (Worker elem: workers) {
            System.out.println(elem);
        }

        // Вводим значение по условию
        System.out.println("Input value:");
        int value = Integer.parseInt(reader.readLine());
        // Нынешний год что б узнать стаж работника
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);

        for (Worker elem: workers) {
            if ((yearNow - elem.year) > value)
            System.out.println(elem);
        }
    }
}
