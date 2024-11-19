import java.util.ArrayList;
public static void main(String[] args) {
    // Creating instances of GeneralPractitioner and Surgeon
    GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Wang", "General Medicine", "Experienced GP with over 10 years in practice", "9 AM - 5 PM", 20);
    Surgeon surgeon1 = new Surgeon(2, "Dr. Li", "Cardiothoracic Surgery", "Expert in heart and lung surgery", "OR-2");

    // Printing details of the created health professionals
    System.out.println("\nGeneral Practitioner Details:");
    gp1.printDetails();
    System.out.println("\nSurgeon Details:");
    surgeon1.printDetails();

    // Creating an appointment
    System.out.println("\nCreating an appointment:");
    Appointment appointment1 = new Appointment("Zhang Wei", "123456789", "10:00 AM", gp1);
    appointment1.printDetails();
    appointment1.confirmAppointment();

    // Part 5 - Collection of Appointments
    ArrayList<Appointment> appointments = new ArrayList<>();
    appointments.add(appointment1);

    // Adding more appointments
    Appointment appointment2 = new Appointment("Li Hua", "987654321", "11:00 AM", surgeon1);
    appointments.add(appointment2);

    // Printing existing appointments
    System.out.println("\nPrinting all appointments:");
    for (Appointment appointment : appointments) {
        appointment.printDetails();
        System.out.println("------------------------------");
    }

    // Cancel an appointment
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nEnter the mobile phone number to cancel an appointment:");
    String mobilePhone = scanner.nextLine();
    boolean found = false;
    for (int i = 0; i < appointments.size(); i++) {
        if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
            appointments.get(i).cancelAppointment();
            appointments.remove(i);
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("No appointment found with the given mobile phone number.");
    }

    // Printing updated appointments
    System.out.println("\nUpdated list of appointments:");
    for (Appointment appointment : appointments) {
        appointment.printDetails();
        System.out.println("------------------------------");
    }
}
}