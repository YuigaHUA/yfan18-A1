public class AssignmentOne {
    public static void main(String[] args) {
        // Creating instances of GeneralPractitioner and Surgeon
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Wang", "General Medicine", "Experienced GP with over 10 years in practice", "9 AM - 5 PM", 20);
        Surgeon surgeon1 = new Surgeon(2, "Dr. Li", "Cardiothoracic Surgery", "Expert in heart and lung surgery", "OR-2");

        // Printing details of the created health professionals
        System.out.println("\nGeneral Practitioner Details:");
        gp1.printDetails();
        System.out.println("\nSurgeon Details:");
        surgeon1.printDetails();
    }
}