package collections.lesson4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SimpleErr {
    public static void main(String[] args)  {
        try {
            InputStream inputStream = new FileInputStream("f");
            System.out.println("File opened");
        }

        catch (FileNotFoundException e) {
            System.err.println("File opening failed");
            System.out.println("File opening failed");
            e.printStackTrace();
        }

    }
}
