public class GeneralPractitioner extends HealthProfessional {
    // Additional instance variable
    private String workingHours; // Working hours of the general practitioner
    private int patientLimit; // Daily maximum number of patients

    // Default constructor
    public GeneralPractitioner() {
        super(); // Calls the default constructor of the base class
        this.workingHours = "9 AM - 5 PM";
        this.patientLimit = 20;
    }

    // Constructor that initializes all the instance variables
    public GeneralPractitioner(int ID, String name, String specialization, String bio, String workingHours, int patientLimit) {
        super(ID, name, specialization, bio); // Calls the parameterized constructor of the base class
        this.workingHours = workingHours;
        this.patientLimit = patientLimit;
    }

    // Method to print all instance variables
    @Override
    public void printDetails() {
        System.out.println("Welcome to our medical service center!");
        super.printDetails(); // Prints the details from the base class
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Daily Patient Limit: " + patientLimit);
        System.out.println("Thank you for choosing our services!");
    }
}