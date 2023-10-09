package lesson1_OOP.task3;

public class Content {
    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    void show(){
        System.out.println("Content: " + getContent());
    }
}
