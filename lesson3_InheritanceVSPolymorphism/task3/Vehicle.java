package lesson3_InheritanceVSPolymorphism.task3;

public class Vehicle {
    int x;
    int y;
    double price;
    double speed;
    int year;

    public Vehicle(int x, int y, double price, double speed, int year) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public  void print() {
        System.out.println("test");
     }
}
