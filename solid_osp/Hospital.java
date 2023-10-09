package solid_osp;

public class Hospital {
    public static void main(String[] args) {
        HospitalManagement hm = new HospitalManagement();

        Employee em1 = new Nurse(1, "Elizabeth", "surgery", true);
        //hm.callUpon(em1);
        em1.doDuties();

        System.out.println("---------------------------------------------");

        Employee em2 = new Doctor(2, "Harry", "surgery", true);
        hm.callUpon(em2);
    }

}
