public class Intern extends Employee {
    String supervisorName;
    String durationOfInternship;

    public Intern(int ID, String name, String supervisorName, String durationOfInternship) {
        super(ID, name);
        this.supervisorName = supervisorName;
        this.durationOfInternship = durationOfInternship;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public String getDurationOfInternship() {
        return durationOfInternship;
    }

    public void setDurationOfInternship(String durationOfInternship) {
        this.durationOfInternship = durationOfInternship;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Superviser: " + supervisorName + "\nDuration of the internship: " + durationOfInternship);
    }
}
