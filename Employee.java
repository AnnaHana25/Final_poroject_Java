package final_project;

public abstract class Employee {
	  private String firstName;
	    private String lastName;
	    private String ssn;
	    private String contract;
	 
	    public Employee(String firstName, String lastName, String ssn, String contract) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.ssn = ssn;
	        this.contract = contract;
	    }
	 
	    public String getName() { return firstName + " " + lastName; }
	    public String getSsn() { return ssn; }
	    public String getContract() { return contract; }
	 
	    public abstract double income();
	    public abstract String getPosition();
	 
	    public String toString() {
	        return "Name: " + getName() + "\nSocial Number: " + ssn;
	    }
	}
	 
