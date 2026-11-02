package final_project;

public class FullTimeEmployee extends Employee {
    private double salary = 7000;
 
    public FullTimeEmployee(String firstName, String lastName, String ssn, String contract) {
        super(firstName, lastName, ssn, contract);
    }
 
    public double income() { return salary; }
    public String getPosition() { return "Full Time Employee"; }
 
    public String toString() {
        return super.toString() + "\nPosition: " + getPosition() + "\nSalary: " + income() + " Euro";
    }
}