package lesson11_savingObjects;

import java.io.*;

public class SimpleSerialization implements Serializable {
    public int x = 3;
    transient long y = 4; // this variable won't be serialized (transient)
    private short z = 5;

    public static void main(String[] args) {
        SimpleSerialization d = new SimpleSerialization();
        System.out.println(d.getX() + d.getY() + d.getZ());  // object variables values before serialization
        try {
            FileOutputStream fos = new FileOutputStream("dg.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
            FileInputStream fis = new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (SimpleSerialization) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(d.getX() + d.getY() + d.getZ());  // object variables values after serialization (y=0)
    }

    int getX() {
        return x;
    }


    long getY() {
        return y;
    }

    short getZ() {
        return z;
    }

}
