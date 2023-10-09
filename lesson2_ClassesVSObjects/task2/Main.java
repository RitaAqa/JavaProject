package lesson2_ClassesVSObjects.task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2012);
        Car car3 = new Car(2013, "red");

        System.out.println("Car1: " + "Year: " + car1.getYear() + " Color: " + car1.getColor() );
        System.out.println("Car2: " + "Year: " + car2.getYear() + " Color: " + car2.getColor() );
        System.out.println("Car3: " + "Year: " + car3.getYear() + " Color: " + car3.getColor() );

    }
}
