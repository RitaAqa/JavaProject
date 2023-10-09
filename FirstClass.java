import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i >= 1 && i <= 3) && (j >= 1 && j <= 3))
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j <= i; j++) {
         //      if (i >= j)
                    System.out.print("* ");
            }
            System.out.println();
        }

     /*   label:
        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if ((i == 3) && (j == 3))
                    break label;
            }
            http: // <- label
            System.out.println();
        }*/


        extracted();

        FirstClass fc = new FirstClass();
        FirstClass fc1 = new FirstClass();

        System.out.println(fc.equals(fc1) );

    }

    private static void extracted() {
        for (int i = 31; i <= 37; i++) {
            System.out.println((char) 27 + "[" + i + "m" + "Hello");
        }
    }
}



