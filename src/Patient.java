import java.util.Date;

public class Patient {
    private int id;
    private String name;
    private Date dob;
    private String gender;
    private String contactInfo;

    public Patient(int id, String name, Date dob, String gender, String contactInfo) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.contactInfo = contactInfo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Patient [ID=" + id + ", Name=" + name + ", DOB=" + dob + ", Gender=" + gender + "]";
    }
}
