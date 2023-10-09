package lesson7_AnonymousClassesAndEnumeration.task2;


enum Animals {
    Cat(12), Dog(10);
    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + ": age = " + age;
    }
}


public class Main {


    public static void main(String[] args) {
        Animals an = null;
        System.out.println(an.Cat.toString());
        System.out.println(an.Dog.toString());
    }
}
