package Week5;

public class SalariedEmployee extends Employee {

	
	public SalariedEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay);  //super is the method that means the class you are inheriting from 
		
	}
	
	
	// at first Salaried Employee had a red underline error,
		//then you can click "add unimplemented methods" 
		// and java adds this method below
	
	@Override      //override means this is coming from/being inherited from a superclass
	public double calculatePay() {
		return this.getPay() * 80; //(80 hours per pay period) 
	}
    
	
	
	
	
	}
	

