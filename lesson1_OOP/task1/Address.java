package lesson1_OOP.task1;

public class Address {

    private String index;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "index: " + getIndex() +
                "\ncountry: " + getCountry() +
                "\ncity: " + getCity() +
                "\nstreet: " + getStreet() +
                "\nhouse: " + getHouse() +
                "\napartment: " + getApartment();
    }

    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex("99999");
        address.setCountry("Ukraine");
        address.setCity("Kharkiv");
        address.setStreet("Ahsarova");
        address.setHouse("20a");
        address.setApartment("69");

        //toString of address object method is called
        System.out.println(address);
    }
}
