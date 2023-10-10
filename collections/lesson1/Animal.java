package collections.lesson1;

public class Animal {
    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    String breed;
    int price;


    @Override
    public String toString() {
        return breed + " = " + price;
    }
}
