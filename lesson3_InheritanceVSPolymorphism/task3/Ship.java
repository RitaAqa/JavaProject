package lesson3_InheritanceVSPolymorphism.task3;

public class Ship extends Vehicle{
    int amountOfPeople;
    String port;

    public Ship(int x, int y, double price, double speed, int year, int amountOfPeople, String port) {
        super(x, y, price, speed, year);
        this.amountOfPeople = amountOfPeople;
        this.port = port;
    }

    @Override
    public  void print() {
        System.out.println("x: " + x + " y: " + y + " price: " + price + " speed: " + speed + " year: " + year + " amountOfPeople: " + amountOfPeople + " port: " + port);
    }
}
