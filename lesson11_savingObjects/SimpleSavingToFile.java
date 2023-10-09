package lesson11_savingObjects;

import java.io.FileWriter;

public class SimpleSavingToFile {


    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("foo1.txt");
            writer.write("Hello there");
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
