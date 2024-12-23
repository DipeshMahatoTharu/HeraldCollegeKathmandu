package workshop4;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Producttest {


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

