package lesson8_Exceptions.task3;

import lesson8_Exceptions.task2.Worker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Price {
    public Price(String nameOfGoods, String nameOfShop, Double price) {
        this.nameOfGoods = nameOfGoods;
        this.nameOfShop = nameOfShop;
        this.price = price;
    }

    String nameOfGoods;
    String nameOfShop;
    Double price;

    @Override
    public String toString() {
        return "nameOfGoods: " + nameOfGoods + "  nameOfShop: " + nameOfShop + "    price: " + price;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Price[] prices = new Price[2];

        for (int i = 0 ; i < prices.length; i++ ) {
            System.out.print("Input nameOfGoods: ");
            String nameOfGoods = reader.readLine();

            System.out.print("Input nameOfShop: ");
            String nameOfShop = reader.readLine();

            System.out.print("Input price: ");
            Double price = Double.parseDouble(reader.readLine());

            prices[i] = new Price(nameOfGoods, nameOfShop, price);
        }

        for (Price elem: prices) {
            System.out.println(elem);
        }

        // Вводим значение по условию
        System.out.println("Enter Shop name:");
        String  value = reader.readLine();
        int i = 0;

        for (Price elem: prices) {
            if (elem.nameOfShop.equals(value)) {
                System.out.println(elem);
                i++;
            }
        }
        if (i==0) throw new Exception("There is no shop");
    }
}
