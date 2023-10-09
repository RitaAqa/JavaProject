package solid_osp;

public class Doctor extends Employee{

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor class instantiation");
    }

    //Doctors
    private void diagnosePatience(){
        System.out.println("Diagnosing patience");
    }

    private void prescribeMedicine(){
        System.out.println("Prescribing Medicine");
    }

    public void doDuties() {
        diagnosePatience();
        prescribeMedicine();
    }
}
