package lesson8_Exceptions.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public double addOperation(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    public double minusOperation(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    public double umnozhenieOperation(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    public double divideOperation(double firstValue, double secondValue) {
        double c = 0;

        if (secondValue != 0) {
            c = firstValue / secondValue;
        } else {
            // Генерируем исключение
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return c;
    }

    public static void main(String[] args) throws IOException {

        // Переменная для switch
        String operation;
        Calculator calc = new Calculator();
// Создаем обьект потока вывода из класа java.io
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input a: ");
        double a = Double.parseDouble(reader.readLine());

        System.out.print("Input b: ");
        double b = Double.parseDouble(reader.readLine());

        System.out.print("Input operation(+, -, *, /):");
        operation = reader.readLine();

        // Создаем switch по операции
        switch (operation) {
            case "+":
                calc.addOperation(a, b);
                break;
            case "-":
                System.out.println("Answer is: " + calc.minusOperation(a, b));
                break;
            case "/":
                // try - catch для отлавливания ошибок
                try {
                    System.out.println("Answer is: " + calc.divideOperation(a, b));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "*":
                System.out.println("Answer is: " + calc.umnozhenieOperation(a, b));
                break;
            default:
                System.out.println("Wrong operation!");
        }
    }

}

