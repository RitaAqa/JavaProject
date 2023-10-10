package collections.lesson1.InterfaceComparatorWithAnonymous;

public class AnimalAnon {

    String breed;
    int weight;
    int speed;
    int price;


    public AnimalAnon(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }


    @Override
    public String toString() {
        return this.breed + " " + this.price + " " + this.speed + " " + this.weight;
    }
}
