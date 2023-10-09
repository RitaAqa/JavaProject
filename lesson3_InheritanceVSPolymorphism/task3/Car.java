package lesson3_InheritanceVSPolymorphism.task3;

public class Car extends Vehicle{
    public Car(int x, int y, double price, double speed, int year) {
        super(x, y, price, speed, year);
    }

    @Override
    public  void print() {
        System.out.println("x: " + x + " y: " + y + " price: " + price + " speed: " + speed + " year: " + year);
    }
}
