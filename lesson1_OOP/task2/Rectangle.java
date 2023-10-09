package lesson1_OOP.task2;

public class Rectangle {
    private double side1;
    private double side2;

    double areaCalculator(double side1, double side2) {
        return side1*side2;

    }
    double perimetrCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }


    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println("areaCalculator: " + rec.areaCalculator(10.0, 15.3));
        System.out.println("perimetrCalculator: " + rec.perimetrCalculator(10.0, 15.3));
    }
}
