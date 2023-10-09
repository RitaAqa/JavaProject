package lesson6_StaticVSNestedClasses.task1;

public class Calculator {
    public static void addOperation(int firstValue, int secondValue ) {
        System.out.println("First value + Second value = " + (firstValue + secondValue));
    }

    public static void minusOperation(int firstValue, int secondValue ) {
        System.out.println("First value - Second value = " + (firstValue - secondValue));
    }

    public static void umnozhenieOperation(int firstValue, int secondValue ) {
        System.out.println("First value * Second value = " + firstValue * secondValue);
    }

    public static void divideOperation(int firstValue, int secondValue ) {
        System.out.println("First value / Second value = " + firstValue / secondValue);
    }

    public static void main(String[] args) {
        Calculator.addOperation(2,4);
        Calculator.minusOperation(2,4);
        Calculator.umnozhenieOperation(2,4);
        Calculator.divideOperation(2,4);
    }
}
