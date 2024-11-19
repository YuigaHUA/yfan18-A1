public class Appointment {
    // Instance variables
    private String patientName; // Patient's name
    private String mobilePhone; // Patient's mobile phone
    private String preferredTimeSlot; // Preferred time slot for the appointment
    private HealthProfessional selectedDoctor; // Selected doctor for the appointment

    // Default constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "Unknown";
        this.preferredTimeSlot = "00:00";
        this.selectedDoctor = null;
    }

    // Constructor that initializes all the instance variables
    public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        if (selectedDoctor != null) {
            System.out.println("Selected Doctor Details:");
            selectedDoctor.printDetails();
        } else {
            System.out.println("No doctor selected.");
        }
    }

    // Method to confirm the appointment
    public void confirmAppointment() {
        System.out.println("Appointment for " + patientName + " with " + selectedDoctor.getName() + " at " + preferredTimeSlot + " is confirmed.");
    }

    // Method to cancel the appointment
    public void cancelAppointment() {
        System.out.println("Appointment for " + patientName + " has been cancelled.");
    }

    // Getter for mobile phone
    public String getMobilePhone() {
        return mobilePhone;
    }
}


