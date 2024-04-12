package week2conditionalsandloops2;


import java.util.Scanner;
public class week2userinputpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter username: ");
		//String username = sc.nextLine();
		//System.out.print("Enter password: ");
		//String password = sc.nextLine();
		//if (username.equals("samy123") && password.equals("3435")) {
		//	System.out.println("Welcome back "+ username);
		//} else {
		//	System.out.println ("Inaccurate credentials.");
	//	}
		
		//boolean loggedIn = false;
		//Scanner sc=new Scanner(System.in);
		//while (!loggedIn) {
		//	System.out.print("Enter username: ");
		//	String username = sc.nextLine();
		//	System.out.print("Enter password: ");
		//	String password = sc.nextLine();
		//	if (username.equals ("samy123") && password.equals("3435")) {
		//	System.out.println("Welcome back " + username);
			
		//	} else {
		//		System.out.println("Inaccurate credentials.");
		//	}
		//}
		
		//public static void main(String[] args) {
			
			//
			// BOOLEANS and CONDITIONALS:
			//
			
			// 1. Variable Declaration:
			//		a. Create a variable named age and assign it a value of 14

			int age = 15;
			
			// 2. Print a Boolean Expression:
			//		a. Print the boolean expression age >= 16 to the console and note the results.
			//		a. Change the value of age to 18 and print again.

            System.out.println(age>=16);

			
			// 3. Can you drive?
			//		a. Using a conditional, print one of the following:
			//				i. "You can drive" if age is greater than or equal to 16
			//				ii. "You cannot drive" otherwise
			//
			//		a. Change the value of age and rerun to see the result
		 
            
            if (age>=16) {
            System.out.println("You can drive!");
            } else {
            	System.out.println("You cannot drive");
            }
      

			
			// 4. Update Solution to Question 3 as follows:
			//		a. Add a new variable called hasLicense before the conditional.
			//		b. Change the boolean expression in the conditional to additionally 
			//				include the need for hasLicense to be true.
			//		c. Try changing the values of age and hasLicense and note the different results.

            boolean hasLicense = true;
            
            if (age>=16 && hasLicense) {
                System.out.println("You can drive!");
                } else {
                	System.out.println("You cannot drive");
                }
          
			
			// 5. Milk?
			//		a. Create two new variables - costOfMilk and thirstLevel
			//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
			//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
			//		c. Change the values and note the different results.
            
            double costOfMilk = 3.00;
            int thirstLevel = 7;
            
            if (costOfMilk<2.50 || thirstLevel>6) {
            	System.out.println("Milk Please!");
            } else {
            	System.out.println("No thanks");
            }

		
			
			// 6. Cookie Distribution: 
			//			Note:  You will evenly distribute all of the cookies to the children 
			//					and as the adult you get to keep the remaining cookies for yourself.
			//
			//		a. Create two variables called numberOfCookies and numberOfChildren.
			//		b. Initialize the two variables to integer values.
			//		b. Use a conditional to print the following based on the following conditions:
			//				i. If there are 0 cookies remaining, print "Sad Face"
			//				ii. If there are less than 2 cookies, print "Yes!"
			//				iii. If there are less than 5 cookies, print "Whoohoooo!"
			//				iv. If there are 5 or more cookies, print "Jackpot!"
            
            //in the example video he went backwards through the options,
            //you can also type it the other direction (starting with sad face scenario)
            //ALSO a more efficient way is assigning (numberOfCookies % numberOfChildren) to a variable
            // because it is repeated several times... 
            //int remainingCookies = numberOfCookies % numberOfChildren;
            // if remainingCookies >= whatever number.....
            
            
            int numberOfCookies = 10;
            int numberOfChildren = 2;
            
            if (numberOfCookies % numberOfChildren >= 5) {
            	System.out.println("jackpot!");
            } else if (numberOfCookies % numberOfChildren >=2) {
            	System.out.println("Whooohoooo!");
            } else if (numberOfCookies % numberOfChildren >0) {
            	System.out.println("Yes!");
            } else  {
            	System.out.println("Sad Face");
            }
            
            		

			
					
			// 7.  Loyalty Member Program:
			//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
			//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
			//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
			//				the following loyaltyMemberStatus scale: 
			//				i. "SILVER" is 0.10
			//				ii. "GOLD" is 0.15
			//				iii. "PLATINUM" is 0.25
			
            
            String loyaltyMemberStatus = "Gold"; 
            double loyaltyMemberDiscount = 0.0;
       
            switch (loyaltyMemberStatus) {
            case "Silver":
            	loyaltyMemberDiscount = .1;
            	break;
            case "Gold":
            	loyaltyMemberDiscount = .15;
            	break;
            case "Platinum":
            	loyaltyMemberDiscount = .25;
            	break;
            	
            		}
            System.out.println("Your discount is " + loyaltyMemberDiscount);

			
			// 8. Using the Loyalty Member Program variables from Question 7, do the following:
			//		a. Create a variable called billTotal and assign a value
			//		b. Create a variable called adjustedTotal and assign it the billTotal minus 
			//				the loyaltyMemberDiscount percent of the billTotal
			//		c. If the adjustedBillTotal is greater than $500 upgrade the 
			//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM

            double billTotal = 600;
            double adjustedTotal = billTotal-(loyaltyMemberDiscount*billTotal);
            System.out.println(adjustedTotal);
            
            if  (adjustedTotal > 500) {
            	if (loyaltyMemberStatus == "Silver") {
            	System.out.println("Gold");
            } else if (loyaltyMemberStatus == "Gold" ) {
            	System.out.println("Platinum"); 
            } 
            	
            }
            
            

			
			// 9. Login -- username & password:
			//		a. Create two variables, username and password
			//		b. Create a conditional that prints one of the following:
			//				i. "login successful" if the username is "Tommy123" and the password is "12345"
			//				ii. "access denied" otherwise
            
            
                   String username = "sarah" ; 
            		String password = "12345" ;
            
            		if (username.equals ("Tommy123") && password.equals ( "12345")) {
            			System.out.println("login successful");
            		} else {
            			System.out.println("access denied");
            		}
            
            

			
			
			//
			// LOOPS:
			//
			
			// 10. Write a for loop that prints each number from 0 to 9
            		
            	//	for (int i=0; i<=9; i++) {
            	//	 System.out.println(i);
            	//	}
			
			
			// 11. Write a for loop that prints each number from 10 to 0 backwards
            		
            	//	for (int i=10; i>=0; i--) {
            	//		System.out.println(i);
            	//	}

			
			
			// 12. Write a for loop that prints every other number from 0 to 100
            		
            	//one way
            	//	for (int i=0; i>=100; i+=2) {
            	//		System.out.println(i);
            	//	}
            		
            	//another way - prints out only if i is divisible by two ( i%2)
            	// this method is less efficient because it iterates 100 times 
            	// versus only 49 or 50 times
            	//but both acceptable for this question
            		//for (int i=0; i>=100; i++) {
            			//if (i % 2 ==0) {
            			//System.out.println(i);
            		//}
            		//}
			
			
			// 13. Write a for loop that iterates from 0 to 100 and prints 
			//			"EVEN" if the number is even and "ODD" if it's odd
            			
            		//	for (int i=0; i<=100; i++) {
            		//	  if  (i % 2 ==0) {
            		//	  System.out.println("even"); // can say print i + "even" to make sure it is printing correctly
	                //    } else {
	                 //   	System.out.println("odd");
	                //    }
            		//	}
	

			
			
			// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
			//			within the loop, divide each number by 3 and print the remainder to the console.
            			
            		//	int i = 100;
            		//	while (i >= 0) {
            		//		System.out.println(i + " " + i % 3); // again, we can print out i + (i % 3) to make sure
            				                        //it's correct, but all that's really necessary here is i % 3
            		//		i--; 
            		//	}
            		
            		{		
            		int num = 3;
            		for (int i = 0; i>=10; i++) {
        	            System.out.println(num + " x " + "i = " + i*num);
        	       
            		
            		}
            		}
            		}
            		
            		
            	


