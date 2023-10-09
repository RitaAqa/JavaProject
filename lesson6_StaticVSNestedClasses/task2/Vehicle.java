package lesson6_StaticVSNestedClasses.task2;

//all inner = nested. But not all nested = inner
//not static classes in main class = INNER nested classes
//static classes in main class == nested classes (but NOT INNER)

public class Vehicle {

    void print() {
        System.out.println("Outer class Vehicle");
    }

    //inner class
    class Wheel {
        void print() {
            System.out.println("Inner class Wheel");
        }
    }

    //inner class
    class Door {
        void print() {
            System.out.println("Inner class Door");
        }
    }

    //Static nested class
    static class Door2 {
        static void printStatic() {
            System.out.println("Static nested class Door2 with static method");
        }

        void printNotStatic() {
            System.out.println("Static nested class Door2 with NOT static method");
        }
    }


    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.print();
        Wheel wheel = new Vehicle().new Wheel();
        wheel.print();
        Door door = new Vehicle().new Door();
        door.print();
        //calling static method from static nested class
        Vehicle.Door2.printStatic();
        //calling NotStatic method from static nested class
        Vehicle.Door2 door2 = new Vehicle.Door2();
        door2.printNotStatic();
    }
}
