
public class Q13 {
    private String street;
    private String city;
    private String zipCode;

    // Getter method for street
    public String getStreet() {
        return street;
    }

    // Setter method for street
    public void setStreet(String street) {
        this.street = street;
    }

    // Getter method for city
    public String getCity() {
        return city;
    }

    // Setter method for city
    public void setCity(String city) {
        this.city = city;
    }

    // Getter method for zipCode
    public String getZipCode() {
        return zipCode;
    }

    // Setter method for zipCode
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public static void main(String[] args) {
        // Create an Address object
        Q13 address = new Q13();

        // Set address details using setter methods
        address.setStreet("Kawai");
        address.setCity("Asia");
        address.setZipCode("44400");

        // Access address details using getter methods
        System.out.println("Street: " + address.getStreet());
        System.out.println("City: " + address.getCity());
        System.out.println("Zip Code: " + address.getZipCode());
    }
}
