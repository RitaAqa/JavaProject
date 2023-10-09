package lesson9_ClassObject;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Device monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        System.out.println(device.toString());
        System.out.println(monitor.toString());

        System.out.println(device.equals(monitor));
        System.out.println(monitor.hashCode());
    }
}
