package week2conditionalsandloops2;

import java.util.Scanner; //accesses 3rd party

public class Week02BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int METRIC_TO_IMPERIAL_CONVERSION = 703; 
		//bmi calculation - use capital letters for a constant
        // also using the word final makes it unchangeable 
		System.out.println("Body mass index calculator");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		String firstName = input.next(); 
		//reads next string in the last and uses it as 
		//variable firstName
		
		System.out.println("Enter your weight in pounds:");
		double weight = input.nextDouble();  //lbs
		
		System.out.println("Enter your height in inches:");
		
		double height = input.nextDouble();  //inches
		
		 // Bmi = weight / height^2 x 703
		
		double bmi = weight / (height * height)*METRIC_TO_IMPERIAL_CONVERSION;  
		//library called math.pow (within java0
		//math.round will round the number to a long decimal...
		//george is big fan of print.f which means print "format"
		//("bmi": %.2f%n", bmi); can format a number as you specify (.2 means two decimal places
		// .3 will do three decimals. etc...
		//%n means something... not sure
		//%s s = string you can also specify %d = decimal points
		
		//we should actually declare the 703 part of the equation
		//as a variable... the equation won't ever change (like pi)
		// also makes the code more clear to others so they're not like...
		//wtf is 703 ...
		
		System.out.println("bmi: " + bmi);
		
		if (bmi<18.5) {
			System.out.println("You are underweight");
		} 
		else if ((bmi >=18.5) && (bmi<24.9)) {
			System.out.println("You are normal or healthy");
		}
		else if ((bmi>=30.0) && (bmi<40)) {
			System.out.println("You are overweight");
		}
		else if (bmi<40) {
			System.out.println("you are obese");
		}
		
		

	 
		int numToAdd = 8;
		int howManyTimes = 3;
		int sumResult = 0;
		 int i = 1;
	       do { 
	            numToAdd++;
	       } while  (i <= howManyTimes);  
	       System.out.println(sumResult);
	       
	       
		
		
		}
		
		
		
		
		
	}


