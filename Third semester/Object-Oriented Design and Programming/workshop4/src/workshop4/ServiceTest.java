package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServiceTest {


    @Test
    void testValidEmail() {
        Service service = new Service();
        assertTrue(service.sendEmail("dipeshmahato@gmail.com", "Hello, this is a test message!"));
    }

    @Test
    void testInvalidEmail() {
        Service service = new Service();
        assertFalse(service.sendEmail("Emaial is not correct", "This should fail."));
    }

    @Test
    void testEmptyEmail() {
        Service service = new Service();
        assertFalse(service.sendEmail("", "This should fail too."));
    }

}
