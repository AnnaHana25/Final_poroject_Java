package final_project;

public class CommissionEmployee extends Employee {
    private int sales;
    private double commission;
 
    public CommissionEmployee(String firstName, String lastName, String ssn, String contract,
                              int sales, double commission) {
        super(firstName, lastName, ssn, contract);
        this.sales = sales;
        this.commission = commission;
    }
 
    public int getSales() { return sales; }
 
    public double income() { return sales * commission; }
    public String getPosition() { return "Commission Employee"; }
 
    public String toString() {
        return super.toString() + "\nPosition: " + getPosition() + "\nSales: " + sales
                + "\nSalary: " + income() + " Euro";
    }
}
 