package lesson2_ClassesVSObjects.task4;

import lesson2_ClassesVSObjects.task3.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2012);
        Car car3 = new Car(2013, "red");
        Car car4 = new Car(2013, "red", 100.9);
        Car car5 = new Car(2012, "pink", 200.9, 1000);


        System.out.println("Car1: " +  car1); //P.s: toString can be omitted
        System.out.println("Car2: " +  car2.toString());
        System.out.println("Car3: " +  car3.toString());
        System.out.println("Car4: " +  car4.toString());
        System.out.println("Car5: " +  car5.toString());
    }
}
