package lesson2_ClassesVSObjects.task2;

public class Car {
    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    private int year;
    private String color;

    Car() {
        // year = 2000;
        // color = "Green";
        //r
        this(2000, "Green");

    }

    Car(int year) {
        this.year = year;
        color = "blue";
    }

    Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
