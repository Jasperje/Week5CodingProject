package Week5;

public class HourlyEmployee extends Employee {

	
//fields at the top
	private double hoursWorked;
	
	// followed by contructor
	//followed by the methods
	public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) {
		super(firstName, lastName, pay);
		this.hoursWorked = hoursWorked;
	}
	@Override
	public double calculatePay() {
		return getPay() * hoursWorked;
	}

	
	
	
	
}
