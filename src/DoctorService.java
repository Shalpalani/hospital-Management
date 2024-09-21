import java.util.ArrayList;
import java.util.List;

public class DoctorService {
    private List<Doctor> doctors = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    public Doctor getDoctorById(int doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == doctorId) {
                return doctor;
            }
        }
        System.out.println("Doctor not found.");
        return null;
    }

    public void listDoctors() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }
}
