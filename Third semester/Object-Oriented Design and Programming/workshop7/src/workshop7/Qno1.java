package workshop7;

/**
 * Main class to demonstrate the Hospital Management System.
 */
public class Qno1 {
    public static void main(String[] args) {
        // Creating objects
        Patient patient = new Patient("P001", "Dipesh", 30, "Male", "Sifal", "9876543210", "PT001");
        Doctor doctor = new Doctor("D001", "Dr. Roshan", 45, "Male", "Kalopul", "0123456789", "DR001", "Cardiology");
        Appointment appointment = new Appointment("A001", "2025-01-15", "10:30 AM");
        Treatment treatment = new Treatment("T001", "Physical Therapy", "Back pain recovery.");

        // Demonstrating functionalities
        patient.viewPersonalDetails();
        patient.bookAppointment();

        doctor.viewPersonalDetails();
        doctor.seePatientDetails();
        doctor.prescribeTreatment();

        appointment.viewAppointmentDetails();
        appointment.rescheduleAppointment("2025-01-20", "3:00 PM");
        appointment.cancelAppointment();

        treatment.viewTreatmentDetails();
        treatment.updateDescription("Updated therapy for improved recovery.");
        treatment.viewTreatmentDetails();
    }
}

/**
 * Base class representing a person.
 */
class Person {
    private String personID;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String contactDetails;

    /**
     * Constructor to initialize a person.
     *
     * @param personID      ID of the person
     * @param name          Name of the person
     * @param age           Age of the person
     * @param gender        Gender of the person
     * @param address       Address of the person
     * @param contactDetails Contact details of the person
     */
    public Person(String personID, String name, int age, String gender, String address, String contactDetails) {
        this.personID = personID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contactDetails = contactDetails;
    }

    /**
     * Displays the personal details of the person.
     */
    public void viewPersonalDetails() {
        System.out.println("ID: " + personID + ", Name: " + name + ", Age: " + age +
                ", Gender: " + gender + ", Address: " + address + ", Contact: " + contactDetails);
    }
}

/**
 * Subclass representing a patient.
 */
class Patient extends Person {
    private String patientID;

    /**
     * Constructor to initialize a patient.
     *
     * @param personID      ID of the person
     * @param name          Name of the person
     * @param age           Age of the person
     * @param gender        Gender of the person
     * @param address       Address of the person
     * @param contactDetails Contact details of the person
     * @param patientID     ID of the patient
     */
    public Patient(String personID, String name, int age, String gender, String address, String contactDetails, String patientID) {
        super(personID, name, age, gender, address, contactDetails);
        this.patientID = patientID;
    }

    /**
     * Books an appointment for the patient.
     */
    public void bookAppointment() {
        System.out.println("Appointment booked for patient ID: " + patientID);
    }
}

/**
 * Subclass representing a doctor.
 */
class Doctor extends Person {
    private String doctorID;
    private String department;

    /**
     * Constructor to initialize a doctor.
     *
     * @param personID      ID of the person
     * @param name          Name of the doctor
     * @param age           Age of the doctor
     * @param gender        Gender of the doctor
     * @param address       Address of the doctor
     * @param contactDetails Contact details of the doctor
     * @param doctorID      ID of the doctor
     * @param department    Department of the doctor
     */
    public Doctor(String personID, String name, int age, String gender, String address, String contactDetails, String doctorID, String department) {
        super(personID, name, age, gender, address, contactDetails);
        this.doctorID = doctorID;
        this.department = department;
    }

    /**
     * Views patient details.
     */
    public void seePatientDetails() {
        System.out.println("Viewing patient details...");
    }

    /**
     * Prescribes treatment for a patient.
     */
    public void prescribeTreatment() {
        System.out.println("Prescribing treatment...");
    }
}

/**
 * Class representing an appointment.
 */
class Appointment {
    private String appointmentID;
    private String appointmentDate;
    private String appointmentTime;

    /**
     * Constructor to initialize an appointment.
     *
     * @param appointmentID   ID of the appointment
     * @param appointmentDate Date of the appointment
     * @param appointmentTime Time of the appointment
     */
    public Appointment(String appointmentID, String appointmentDate, String appointmentTime) {
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    /**
     * Reschedules the appointment.
     *
     * @param newDate New appointment date
     * @param newTime New appointment time
     */
    public void rescheduleAppointment(String newDate, String newTime) {
        this.appointmentDate = newDate;
        this.appointmentTime = newTime;
        System.out.println("Appointment rescheduled to: " + newDate + " " + newTime);
    }

    /**
     * Cancels the appointment.
     */
    public void cancelAppointment() {
        System.out.println("Appointment ID: " + appointmentID + " has been cancelled.");
    }

    /**
     * Displays the appointment details.
     */
    public void viewAppointmentDetails() {
        System.out.println("Appointment ID: " + appointmentID + ", Date: " + appointmentDate + ", Time: " + appointmentTime);
    }
}

/**
 * Class representing a treatment.
 */
class Treatment {
    private String treatmentID;
    private String type;
    private String description;

    /**
     * Constructor to initialize a treatment.
     *
     * @param treatmentID ID of the treatment
     * @param type        Type of the treatment
     * @param description Description of the treatment
     */
    public Treatment(String treatmentID, String type, String description) {
        this.treatmentID = treatmentID;
        this.type = type;
        this.description = description;
    }

    /**
     * Updates the treatment description.
     *
     * @param newDescription New description for the treatment
     */
    public void updateDescription(String newDescription) {
        this.description = newDescription;
    }

    /**
     * Displays the treatment details.
     */
    public void viewTreatmentDetails() {
        System.out.println("Treatment ID: " + treatmentID + ", Type: " + type + ", Description: " + description);
    }
}
