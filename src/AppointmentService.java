import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully.");
    }

    public List<Appointment> getAppointmentsByDoctor(int doctorId) {
        List<Appointment> doctorAppointments = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getDoctorId() == doctorId) {
                doctorAppointments.add(appointment);
            }
        }
        return doctorAppointments;
    }

    public List<Appointment> getAppointmentsByDate(Date date) {
        List<Appointment> dateAppointments = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentDate().equals(date)) {
                dateAppointments.add(appointment);
            }
        }
        return dateAppointments;
    }
}
