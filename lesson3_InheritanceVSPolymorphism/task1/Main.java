package lesson3_InheritanceVSPolymorphism.task1;

public class Main {
    public static void main(String[] args) {
        Printer p1 = new Printer1();
        Printer p2 = new Printer2();
        Printer p3 = new Printer3();

        p1.print("Hello");
        p2.print("Hello");
        p3.print("Hello");


    }
}
