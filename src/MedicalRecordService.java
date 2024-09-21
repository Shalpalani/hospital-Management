import java.util.ArrayList;
import java.util.List;

public class MedicalRecordService {
    private List<MedicalRecord> records = new ArrayList<>();

    public void addRecord(MedicalRecord record) {
        records.add(record);
        System.out.println("Medical record added successfully.");
    }

    public List<MedicalRecord> getRecordsByPatient(int patientId) {
        List<MedicalRecord> patientRecords = new ArrayList<>();
        for (MedicalRecord record : records) {
            if (record.getPatientId() == patientId) {
                patientRecords.add(record);
            }
        }
        return patientRecords;
    }

    public void listAllRecords() {
        for (MedicalRecord record : records) {
            System.out.println(record);
        }
    }
}
