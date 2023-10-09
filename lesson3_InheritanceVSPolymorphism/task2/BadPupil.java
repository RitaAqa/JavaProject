package lesson3_InheritanceVSPolymorphism.task2;

public class BadPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("I study bad");
    }

    @Override
    public void read() {
        System.out.println("I read bad");
    }

    @Override
    public void write() {
        System.out.println("I write bad");
    }

    @Override
    public void relax() {
        System.out.println("I relax bad");
    }
}
