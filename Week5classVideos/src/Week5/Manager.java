package Week5;

public class Manager extends Employee {

	

// fields at the top
	private double bonusPercentage;
	
	
	// followed by constructor
	public Manager(String firstName, String lastName, double pay, double bonusPercentage) {
		super(firstName, lastName, pay);
		this.bonusPercentage = bonusPercentage;
	}  // we also need to include bonus percentage in the constructor for manager
	
	
	//followed by methods

	@Override
	public double calculatePay() {
		return getPay() * 80 * bonusPercentage;
	}

	
}
