package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class EnrollmentService {

    private Set<String> enrolledStudents = new HashSet<>();

    public boolean enrollStudent(String studentUsername, String courseName) {
        String enrollmentKey = studentUsername + "-" + courseName;
        if (enrolledStudents.contains(enrollmentKey)) {
            return false;
        } else {
            enrolledStudents.add(enrollmentKey);
            System.out.println("Student " + studentUsername + " enrolled in course " + courseName);
            return true;
        }
    }

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
