package lesson10_generics.task1;

public class Generic<T> {
    public static <T> void factoryMethod(T t1) {
        System.out.println(t1.toString());
    }

    public static void main(String[] args) {
        factoryMethod(new Double(3.14));
        factoryMethod(new Integer(3));
    }
}
