package lesson3_InheritanceVSPolymorphism.task3;

public class Plane extends Vehicle{
    int height;
    int amountOfpeople;

    public Plane(int x, int y, double price, double speed, int year, int height, int amountOfpeople) {
        super(x, y, price, speed, year);
        this.height = height;
        this.amountOfpeople = amountOfpeople;
    }

    @Override
    public  void print() {
        System.out.println("x: " + x + " y: " + y + " price: " + price + " speed: " + speed + " year: " + year + " height: " + height + " amountOfpeople: " + amountOfpeople);
    }
}
