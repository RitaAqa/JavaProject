package solid_osp;

public class Nurse extends Employee{
    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse class instantiation");
    }

    //Nurses
    private void drawBlood(){
        System.out.println("Drawing blood");
    }

    private void cleanRoom(){
        System.out.println("Cleaning room");
    }

    private void bringPatientCard(){
        System.out.println("Bringing patient card");
    }

    @Override
    public void doDuties() {
        drawBlood();
        cleanRoom();
        bringPatientCard();
    }
}
