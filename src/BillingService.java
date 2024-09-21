import java.util.HashMap;
import java.util.Map;

public class BillingService {
    private Map<Integer, Double> patientBills = new HashMap<>();

    public void addCharge(int patientId, double amount) {
        patientBills.put(patientId, patientBills.getOrDefault(patientId, 0.0) + amount);
        System.out.println("Charge added to patient ID " + patientId);
    }

    public void generateBill(int patientId) {
        double billAmount = patientBills.getOrDefault(patientId, 0.0);
        System.out.println("Total Bill for Patient ID " + patientId + ": $" + billAmount);
    }
}
