package final_project;

public class BaseCommissionEmployee extends CommissionEmployee {
    private double baseSalary = 1000;
 
    public BaseCommissionEmployee(String firstName, String lastName, String ssn, String contract, int sales) {
        super(firstName, lastName, ssn, contract, sales, 700);
    }
 
    // commission + base salary + 10% bonus of the base salary
    public double income() { return super.income() + baseSalary + baseSalary * 0.10; }
    public String getPosition() { return "Base Employee with Commission"; }
 
    public String toString() {
        return super.toString() + "\nBase salary: " + baseSalary + " Euro, bonus 10%";
    }
    }