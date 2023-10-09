package lesson1_OOP.task4;

public class Main {


    public static void main(String[] args) {

        Computer[] computers = new Computer[5];
        for (int i = 0; i < 5; i++) {
            computers[i] = new Computer();
        }

        for (int i = 0; i < 5; i++) {
            computers[i].detail = "detail" + i;
        }

        for (Computer comp: computers) {
            System.out.println("Detail:  " + comp.detail);
        }
    }
}
