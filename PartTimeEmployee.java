package final_project;

public class PartTimeEmployee extends Employee {
    private int hours;
    private double rate = 400;
 
    public PartTimeEmployee(String firstName, String lastName, String ssn, String contract, int hours) {
        super(firstName, lastName, ssn, contract);
        this.hours = hours;
    }
 
    public double income() { return hours * rate; }
    public String getPosition() { return "Part Time Employee"; }
 
    public String toString() {
        return super.toString() + "\nPosition: " + getPosition() + "\nHours: " + hours
                + "\nSalary: " + income() + " Euro";
    }
}
 