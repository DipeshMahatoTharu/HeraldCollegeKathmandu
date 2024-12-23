package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EnrollmentServiceTest {


    @Test
    void testEnrollNewStudent() {
        EnrollmentService service = new EnrollmentService();
        assertTrue(service.enrollStudent("Dipesh", "Math101"));
    }

    @Test
    void testEnrollExistingStudent() {
        EnrollmentService service = new EnrollmentService();
        service.enrollStudent("johnDoe", "Math101");
        assertFalse(service.enrollStudent("Roshan", "Math101"));
    }

    @Test
    void testEnrollDifferentCourses() {
        EnrollmentService service = new EnrollmentService();
        assertTrue(service.enrollStudent("Rohan", "Math101"));
        assertTrue(service.enrollStudent("jpt", "Physics101"));
    }

}
