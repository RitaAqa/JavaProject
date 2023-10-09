package lesson3_InheritanceVSPolymorphism.task1;

public class Printer3 extends Printer {

    @Override
    void print(String value) {
        System.out.println((char) 27 + "[" + 33 + "m" + value);
    }
}
