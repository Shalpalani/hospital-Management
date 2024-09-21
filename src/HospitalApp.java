import java.util.Date;
import java.util.Scanner;

public class HospitalApp {
    private static PatientService patientService = new PatientService();
    private static DoctorService doctorService = new DoctorService();
    private static AppointmentService appointmentService = new AppointmentService();
    private static MedicalRecordService recordService = new MedicalRecordService();
    private static BillingService billingService = new BillingService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. Add Medical Record");
            System.out.println("5. Add Bill");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    addDoctor();
                    break;
                case 3:
                    scheduleAppointment();
                    break;
                case 4:
                    addMedicalRecord();
                    break;
                case 5:
                    addBill();
                    break;
                case 6:
                    generateBill();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addPatient() {
        System.out.print("Enter patient name: ");
        String name = scanner.next();
        System.out.print("Enter DOB (yyyy-MM-dd): ");
        String dobStr = scanner.next();
        System.out.print("Enter gender: ");
        String gender = scanner.next();
        System.out.print("Enter contact info: ");
        String contact = scanner.next();
        Patient patient = new Patient(1, name, new Date(), gender, contact);
        patientService.addPatient(patient);
    }

    private static void addDoctor() {
        System.out.print("Enter doctor name: ");
        String name = scanner.next();
        System.out.print("Enter specialization: ");
        String specialization = scanner.next();
        Doctor doctor = new Doctor(1, name, specialization, "Mon-Fri");
        doctorService.addDoctor(doctor);
    }

    private static void scheduleAppointment() {
        System.out.print("Enter patient ID: ");
        int patientId = scanner.nextInt();
        System.out.print("Enter doctor ID: ");
        int doctorId = scanner.nextInt();
        System.out.print("Enter appointment date (yyyy-MM-dd): ");
        String dateStr = scanner.next();
        System.out.print("Enter reason for appointment: ");
        String reason = scanner.next();
        Appointment appointment = new Appointment(1, patientId, doctorId, new Date(), reason);
        appointmentService.scheduleAppointment(appointment);
    }

    private static void addMedicalRecord() {
        System.out.print("Enter patient ID: ");
        int patientId = scanner.nextInt();
        System.out.print("Enter diagnosis: ");
        String diagnosis = scanner.next();
        System.out.print("Enter treatment: ");
        String treatment = scanner.next();
        MedicalRecord record = new MedicalRecord(1, patientId, diagnosis, treatment, new Date());
        recordService.addRecord(record);
    }

    private static void addBill() {
        System.out.print("Enter patient ID: ");
        int patientId = scanner.nextInt();
        System.out.print("Enter bill amount: ");
        double amount = scanner.nextDouble();
        billingService.addCharge(patientId, amount);
    }

    private static void generateBill() {
        System.out.print("Enter patient ID to generate bill: ");
        int patientId = scanner.nextInt();
        billingService.generateBill(patientId);
    }
}
