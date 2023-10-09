package lesson3_InheritanceVSPolymorphism.task2;

public class ExcelentPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("I study well");
    }

    @Override
    public void read() {
        System.out.println("I read well");
    }

    @Override
    public void write() {
        System.out.println("I write well");
    }

    @Override
    public void relax() {
        System.out.println("I relax well");
    }
}
