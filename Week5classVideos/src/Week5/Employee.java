package Week5;

public abstract class Employee { //abstract means this class cannot be instantiated
	//this is the PARENT class for the salaried, hourly and manager classes

	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String reportsTo;
	
	//constructor:
	public Employee(String firstName, String lastName, double pay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pay = pay;
	}
	
	
	public abstract double calculatePay(); //the abstract means there is NO implementation, 
	// so there is NO body - ends in a ; no curly braces 
	// it has to be implemented by classes that inherit from employee
	// this is an example of polymorphism 
	

	
	public String getInformation() {
		return "Name: " + firstName + " " + lastName + 
				"\nReports to: " + reportsTo
				+ "\nAddress: " + address;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}
	
	
}
