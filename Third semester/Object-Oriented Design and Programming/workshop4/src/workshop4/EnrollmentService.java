package workshop4;



import java.util.HashSet;
import java.util.Set;


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

}
