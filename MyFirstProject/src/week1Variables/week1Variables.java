package week1Variables;

public class week1Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * You have been given two variables, num1 and num2, each with predefined values
 * as test cases. Your task is to calculate the sum of these variables and
 * display the result using the System.out.println();
 */
		
		
	
		int num1 = 2;
		int num2 = 2;
		int num3 = 2;
    
		int yourAnswer = (num1 + num2) * num3;
		System.out.println(yourAnswer);
		
		
		/*question #2 from quiz: i answered correctly because i checked here in eclipse but
		 * wasn't 100% sure why the quotes around lastName wouldn't mess up the code...
		 * 
		 */
		String firstName = "Tom";
		  String lastName = "Sawyer";
		  System.out.println(firstName + "lastName");
		  
		  
		  System.out.println(2 ==2 );
		  System.out.println(2 <= 5);
		  
		  
		  
		 
		  String name = "Tom";
		  if (name == "Sam") {
			  System.out.println("Hello, Sam!");
		  } else {
			  System.out.println("You are not Sam!");
		  }
		  
		  int ageRequiredToDrive = 16;
		  int currentAge = 14;
		  boolean canPersonDrive = currentAge >= ageRequiredToDrive;
		  if (canPersonDrive) {
			  System.out.println("You can drive!");
		  } else {
			  System.out.println("please wait " + (16 - currentAge) +" year(s)");
		  }
		  
		  for (int i = 0; i<=100; i+=3) {
			  System.out.println(i);
		  }
		  
		 

}
