public class HealthProfessional {
    // Instance variables
    private int ID; // Health professional ID (numbers only)
    private String name; // Name of the health professional
    private String specialization; // Additional variable to describe their specialization
    private String bio; // Short biography for the health professional

    // Default constructor
    public HealthProfessional() {
        this.ID = 0;
        this.name = "Unknown";
        this.specialization = "General";
        this.bio = "No bio available";
    }

    // Constructor that initializes all the instance variables
    public HealthProfessional(int ID, String name, String specialization, String bio) {
        this.ID = ID;
        this.name = name;
        this.specialization = specialization;
        this.bio = bio;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("Health Professional ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Biography: " + bio);
    }

    // Getter for name
    public String getName() {
        return name;
    }
}