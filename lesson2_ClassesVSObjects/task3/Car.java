package lesson2_ClassesVSObjects.task3;

public class Car {

    int year;
    String color;
    double speed;
    int weight;

    public Car() {
        year = 2000;
        color = "green";
        speed = 400.4;
        weight = 100;
    }

    public Car(int year) {
        this.year = year;
        color = "green";
        speed = 400.4;
        weight = 100;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
        speed = 400.4;
        weight = 100;
    }

    public Car(int year, String color, double speed) {
        this.year = year;
        this.color = color;
        this.speed = speed;
        weight = 100;
    }

    public Car(int year, String color, double speed, int weight) {
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }


    @Override
    public String toString(){
        return "Year: " + year + " Color: " + color + " Speed: " + speed + " Weight: " + weight;
    }

}
