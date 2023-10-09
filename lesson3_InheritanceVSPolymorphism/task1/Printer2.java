package lesson3_InheritanceVSPolymorphism.task1;

public class Printer2 extends Printer{

    @Override
    void print(String value) {
        System.out.println((char) 27 + "[" + 32 + "m" + value);
    }
}
