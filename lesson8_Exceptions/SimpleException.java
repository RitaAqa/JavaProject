package lesson8_Exceptions;

import java.io.FileNotFoundException;

public class SimpleException {

    int y;

    public static void main(String[] args) {
        try {
            myFunc();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("bye bye");
        }
    }

    public static void myFunc() throws FileNotFoundException {
        myFunc1();
    }

    public static void myFunc1() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}

