import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    public Patient getPatientById(int patientId) {
        for (Patient patient : patients) {
            if (patient.getId() == patientId) {
                return patient;
            }
        }
        System.out.println("Patient not found.");
        return null;
    }

    public void listPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}
