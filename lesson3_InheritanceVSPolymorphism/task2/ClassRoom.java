package lesson3_InheritanceVSPolymorphism.task2;

public class ClassRoom {
    Pupil[] pupils;

    public ClassRoom(Pupil[] pupils) {
        this.pupils = pupils;
    }

    public void showPupils() {
        for (Pupil pupil: pupils) {
            pupil.study();
            pupil.read();
            pupil.relax();
            pupil.write();
        }
    }

    public static void main(String[] args) {

        Pupil[] pupils = new Pupil[4];
        pupils[0] = new ExcelentPupil();
        pupils[1] = new BadPupil();
        pupils[2] = new GoodPupil();
        pupils[3] = new ExcelentPupil();
        ClassRoom classRoom = new ClassRoom(pupils);

        classRoom.showPupils();
    }
}
