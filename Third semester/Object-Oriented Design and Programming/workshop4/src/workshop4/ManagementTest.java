package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManagementTest {


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
