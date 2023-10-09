package lesson1_OOP.task3;

public class Title {

    private String title;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void show(){
            System.out.println("Title: " + getTitle());
    }
}
