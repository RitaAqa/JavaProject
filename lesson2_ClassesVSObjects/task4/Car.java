package lesson2_ClassesVSObjects.task4;

public class Car {
    int year;
    String color;
    double speed;
    int weight;

    public Car() {
        this(2000, "green", 400.4, 100);
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this(year);
        this.color = color;
    }

    public Car(int year, String color, double speed) {
        this(year, color);
        this.speed = speed;
    }

    public Car(int year, String color, double speed, int weight) {
        this(year, color, speed);
        this.weight = weight;
    }


    @Override
    public String toString(){
        return "Year: " + year + " Color: " + color + " Speed: " + speed + " Weight: " + weight;
    }
}
