package lesson6_StaticVSNestedClasses.task3;

public class Distance {
    double distance;

    void print() {
    }

    //nested static class
    static class Converter {
        static double fromMtoKM(double distance) {
            return distance * 0.001;
        }
    }

    public static void main(String[] args) {
        System.out.println(Distance.Converter.fromMtoKM(230));
    }
}
