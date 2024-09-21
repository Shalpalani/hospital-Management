import java.util.Date;

public class MedicalRecord {
    private int id;
    private int patientId;
    private String diagnosis;
    private String treatment;
    private Date recordDate;

    public MedicalRecord(int id, int patientId, String diagnosis, String treatment, Date recordDate) {
        this.id = id;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.recordDate = recordDate;
    }

    public int getId() {
        return id;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    @Override
    public String toString() {
        return "MedicalRecord [ID=" + id + ", Patient ID=" + patientId + ", Diagnosis=" + diagnosis + ", Treatment=" + treatment + "]";
    }
}
