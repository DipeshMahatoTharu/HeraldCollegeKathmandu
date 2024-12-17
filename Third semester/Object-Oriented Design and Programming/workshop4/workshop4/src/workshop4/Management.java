package workshop4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Management {
    private String name;
    private double price;
    private int quantity;

    public Management(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

 
    public boolean isProductAvailable(String productName, int requestedQuantity) {
        if (this.name.equalsIgnoreCase(productName)) {
            return this.quantity >= requestedQuantity;
        }
        return false;
    }

    @Test
    void testProductAvailability() {
        Management product = new Management("Laptop", 1500.0, 10);

        assertAll("Product Availability Tests",
         
            () -> assertTrue(product.isProductAvailable("Laptop", 5), "Product should be available for requested quantity"),

            () -> assertFalse(product.isProductAvailable("Laptop", 15), "Product should not be available for requested quantity"),

            () -> assertFalse(product.isProductAvailable("Tablet", 5), "Product name mismatch should return false")
        );
    }
}
