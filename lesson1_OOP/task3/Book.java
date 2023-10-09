package lesson1_OOP.task3;

public class Book {
    public static void main(String[] args) {
        Title t = new Title();
        t.setTitle("My title");

        Author a = new Author();
        a.setAuthor("My author");

        Content c = new Content();
        c.setContent("sdfsdgdfgdfdfg");

        t.show();
        a.show();
        c.show();


    }
}
