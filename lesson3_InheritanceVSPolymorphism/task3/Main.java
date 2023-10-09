package lesson3_InheritanceVSPolymorphism.task3;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(10, 20, 34.5, 400.9, 2012);
        Vehicle plane = new Plane(10, 20, 34.5, 400.9, 2012, 9000, 35);
        Vehicle ship = new Ship(10, 20, 34.5, 400.9, 2012, 9000, "jhkjhjk");

        car.print();
        plane.print();
        ship.print();
    }


}
