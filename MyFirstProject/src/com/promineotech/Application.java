package com.promineotech;

public class Application {

	public static void main(String[] args) {System.out.println("My first Java Program!");
	
	int jessicasAge = 35;
	double accountBalance = 34.67;
	char middleInitial = 'E';
	boolean isHotOutside = false;
	String firstName = "Jessica";
	
	System.out.println(jessicasAge);
	System.out.println(accountBalance);
	System.out.println(middleInitial);
	System.out.println(isHotOutside);
	System.out.println(firstName
			);
	
	int age = 34;
			System.out.println(age);
	
	boolean isAge29 =  age == 30;
	System.out.println(isAge29);
	
	
	
	String lastName = "Jasper";
	String fullName = firstName + " " + lastName;
	System.out.println(fullName);
	
	
	
	double savingsAccountBalance = 34.35;
	double depositAmount = 34.35;
	double newSavingsAccountBalance = savingsAccountBalance + depositAmount;
	System.out.println("The Balance in Your Account is $" + newSavingsAccountBalance );
	
	double withdrawalAmount = 67;
   double newnewSavingsAccountBalance = newSavingsAccountBalance - withdrawalAmount;
	System.out.println("Your Updated Balance is $" + newnewSavingsAccountBalance);
	
		// TODO Auto-generated method stub

	}

}
