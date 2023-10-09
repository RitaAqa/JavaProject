package lesson3_InheritanceVSPolymorphism.task2;

public class GoodPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("I study good");
    }

    @Override
    public void read() {
        System.out.println("I read good");
    }

    @Override
    public void write() {
        System.out.println("I write good");
    }

    @Override
    public void relax() {
        System.out.println("I relax good");
    }
}

