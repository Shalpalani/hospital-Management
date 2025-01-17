public class Doctor {
    private int id;
    private String name;
    private String specialization;
    private String schedule;

    public Doctor(int id, String name, String specialization, String schedule) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.schedule = schedule;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Doctor [ID=" + id + ", Name=" + name + ", Specialization=" + specialization + ", Schedule=" + schedule + "]";
    }
}
