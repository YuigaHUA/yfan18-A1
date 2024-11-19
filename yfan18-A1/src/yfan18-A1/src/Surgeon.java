public class Surgeon extends HealthProfessional {
    // Additional instance variable
    private String operatingRoom; // Operating room assigned to the surgeon

    // Default constructor
    public Surgeon() {
        super(); // Calls the default constructor of the base class
        this.operatingRoom = "OR-1";
    }

    // Constructor that initializes all the instance variables
    public Surgeon(int ID, String name, String specialization, String bio, String operatingRoom) {
        super(ID, name, specialization, bio); // Calls the parameterized constructor of the base class
        this.operatingRoom = operatingRoom;
    }

    // Method to print all instance variables
    @Override
    public void printDetails() {
        System.out.println("Welcome to our medical service center!");
        super.printDetails(); // Prints the details from the base class
        System.out.println("Operating Room: " + operatingRoom);
        System.out.println("Thank you for choosing our services!");
    }
}