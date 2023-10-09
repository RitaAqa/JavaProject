package lesson3_InheritanceVSPolymorphism.task1;

public class Printer1 extends  Printer {

    @Override
    void print(String value) {
        System.out.println((char) 27 + "[" + 31 + "m" + value);
    }
}
