package collections.lesson1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MountainsSortUsingComparator {

    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    public static void main(String[] args) {
        new MountainsSortUsingComparator().go();

    }

    class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return one.getName().compareTo(two.getName());

        }
    }

    class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return one.getHeight().compareTo(two.getHeight());

        }
    }

    public void go() {
        mtn.add(new Mountain("Лонг-Рейндж", 14255));
        mtn.add(new Mountain("Эльберт", 14433));
        mtn.add(new Mountain("Марун", 14156));
        mtn.add(new Mountain("Касл", 14265));
        System.out.println("Initial order: \n" + mtn);
        NameCompare nameCompare = new NameCompare();
        Collections.sort(mtn, nameCompare);
        System.out.println("Sort by name: \n" + mtn);
        HeightCompare heightCompare = new HeightCompare();
        Collections.sort(mtn, heightCompare);
        System.out.println("Sort by height: \n" + mtn);

    }

}

class Mountain {
    String name;
    String height;


    Mountain(String n, int h) {
        name = n;
        //height = Integer.toString(h);  // convert int to String var 1
        //height = h + "";      // convert int to String var 2
        height = String.valueOf(h); // convert int to String var 3
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public String toString() {
        return getName() + " " + getHeight();
    }

}


