package collections.lesson1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class SimpleCollections {
    public static void main(String[] args) {


       // checkCollectionMethods();
    //  checkIterationInMassiveAndCollectionUsingForEach();
        checkIterationInCollectionUsingIterator();
    }

    static void checkIterationInMassiveAndCollectionUsingForEach() {
        // Massive of Objects AnimalAnon
//        AnimalAnon cat = new AnimalAnon("cat", 3000);
//        AnimalAnon dog = new AnimalAnon("dog", 4000);
//        AnimalAnon horse = new AnimalAnon("horse", 5000);
//
//        AnimalAnon[] c = {new AnimalAnon("cat", 3000), dog, horse};

// Collection of Objects AnimalAnon
        Collection<Animal> col = new ArrayList<>();
        col.add(new Animal("cat", 3000 ));
        col.add(new Animal("dog", 4000 ));
        col.add(new Animal("horse", 5000 ));

        //use cycle foreach
        for (Animal tmp : col) {
            tmp.price = tmp.price + 1000;
        }
        for (Animal tmp : col) {
            System.out.println(tmp.breed + " " + tmp.price);
            ;
        }

    }

    static void checkIterationInCollectionUsingIterator() {

        //use Interface Iterator and ListIterator. We can not use iterator with massives

        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);

        Iterator<Integer> iterator = al.iterator();

        while (iterator.hasNext()) {
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }

        ListIterator<Integer> listIterator = al.listIterator();
        while (listIterator.hasNext()) {
            Integer tmp = listIterator.next();
            System.out.println(tmp);
        }

        while (listIterator.hasPrevious()) {
            Integer tmp = listIterator.previous();
            System.out.println(tmp);
        }

        ///////////collection with custom object
        ArrayList<Animal> al2 = new ArrayList<>();
        al2.add(new Animal("cat", 3000));
        al2.add(new Animal("dog", 4000));


        Iterator<Animal> carIterator = al2.iterator();
        while (carIterator.hasNext()) {
            Animal tmp = carIterator.next();
            tmp.price += 1000;
        }
        System.out.println(al2);
    }


    static void checkCollectionMethods() {
        //methods in Collection interface//
        Collection<Integer> list1 = new ArrayList<>();
        //add element
        list1.add(1);
        list1.add(2);
        list1.add(3);
        //System.out.println(list.add(1));
        //collection size
        System.out.println(list1.size());
        Collection<Integer> list2 = new ArrayList<>();
        System.out.println(list2.size());
        //add all elements from collection to another collection
        list2.addAll(list1);
        System.out.println(list2 + " " + list2.size());
        //delete all elements from the collection
        //list2.clear();
        System.out.println(list2 + " " + list2.size());
        //check if collection is empty
        System.out.println(list2.isEmpty());

        //transform collection to Array of Objects. But this array is array of objects, because toArray() returns Objects
        Object[] arr = list2.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
    /*    ArrayList<Song> songList = new ArrayList<Song>();

        class ArtistComparator implements Comparator<Song> {
            public int compare(Song one, Song two) {
                return one.getArtist().compareTo(two.getArtist());
            }
        }
        public static void main(String[] args) {
            new collections.lesson1.SimpleCollections().go();
        }

        public void go() {
            getSongs();
            System.out.println("Before sort: " + songList);
            Collections.sort(songList);
            System.out.println("Sort by title using compareTo() from Comparable: " + songList);
            ArtistComparator artistCompare = new ArtistComparator();
            Collections.sort(songList, artistCompare);
            System.out.println("Sort by artist using compare() from corresponding class comparator: " + songList);
        }

        void getSongs() {
            try {
                File file = new File(("SongsList.txt"));
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    addSong(line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        void addSong(String lineToParse) {
            String[] tokens = lineToParse.split("/");
            Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
            songList.add(nextSong);
        }

    static class Song implements Comparable<Song> {
        String title;
        String artist;
        String rating;
        String bmp;


        Song(String t, String a, String r, String b) {
            title = t;
            artist = a;
            rating = r;
            bmp = b;
        }

        public int compareTo(Song s) {
            return title.compareTo(s.getTitle());
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public  String getRating() {
            return rating;
        }


        public String getBmp() {
            return bmp;
        }

        public String toString() {
            return getTitle() + " - " + getArtist();
        }
    }*/




