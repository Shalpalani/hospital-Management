import java.util.Date;

public class Appointment {
    private int id;
    private int patientId;
    private int doctorId;
    private Date appointmentDate;
    private String reason;

    public Appointment(int id, int patientId, int doctorId, Date appointmentDate, String reason) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "Appointment [ID=" + id + ", Patient ID=" + patientId + ", Doctor ID=" + doctorId + ", Date=" + appointmentDate + "]";
    }
}
