package workshop4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
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

    // Method to check if the product is affordable within the given budget
    public boolean isAffordable(double budget) {
        double totalPrice = price * quantity;
        return totalPrice <= budget;
    }

    @Test
    void testProductAssertions() {
        Product product = new Product("TestProduct", 50.0, 2);

        assertAll("Product Validations",
         
            () -> assertNotNull(product.getName(), "Product name should not be null"),
           
            () -> assertTrue(product.getPrice() > 0, "Product price should be positive"),
         
            () -> assertTrue(product.isAffordable(200), "Product should be affordable within budget"),
            () -> assertFalse(product.isAffordable(50), "Product should not be affordable for a low budget")
        );
    }
}
