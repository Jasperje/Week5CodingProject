package week3;

public class week3labsmethodsandarrays {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] array = new int [6];
		array[0] = 1;
		array[1] = 5;
        array[2] = 2;
	    array[3] = 8;
        array[4] = 13;
        array[5] = 6;

		//OR
			//int[] array = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
	        System.out.println(array[0]);  //name of the array which we titled array and then [0]
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(array[array.length-1]);  
		
		// 4. Print out the element in the array at position 6, what happens?
               // System.out.println(array[6]);  //says index 6 out of bounds for length
		       // and program will actually stop executing at this line 
		
		// 5. Print out the element in the array at position -1, what happens?
              // System.out.println(array[-1]); //also says index -1 is out of bounds
			
		// 6. Write a traditional for loop that prints out each element in the array
	         //   for (int i=0; i < array.length; i++) {  //start at 0 because we start counting at 0 
	         //   	System.out.println(array[i]);    
	         //   }
			
		// 7. Write an enhanced for loop that prints out each element in the array
               //   for (int number : array) {       //number is just a variable we assign HERE it could be anything
                //	  System.out.println(number);   //then print out the variable called number in this line
                //  }
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		          double sum = 0;   // they make this look so easy. eyeroll. 
		          // set it equal to 0 because that's where we start counting
                  for (int number : array) {
                	  sum += number;   // adds each number to itself for each iteration of the loop
                  }  //return sum;      //doesn't work because this is a VOID method
                  System.out.println( sum ); 
			
		// 9. Create a new variable called average and assign the average value of the array to it
                double average = sum/array.length;   //changed this to double because it had decimals 
                System.out.println(average); 
                
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
               for (double number : array) {
            	   if (number % 2 !=0) {      //OR you can say if %2 ==1 
            	   System.out.println(number); 
               }
              }
                
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
           // String [] names = new String [4];
           // name[0] = "Sam";
          //  name[1] = "Sally";
          //  name[2] = "Thomas"; 
          //  name[3] =  "Robert";
            
           String[] names = {"Sam", "Sally", "Thomas", "Robert"};
               
		
		// 12. Calculate the sum of all the letters in the new array
            //need a variable to hold this value
             int totalChars = 0;
             for(String name : names) {
            	 totalChars += name.length(); //takes characters and adds them to itself
             } System.out.println(totalChars);
            
		
            

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		    //to test the method we just use the method name with ()
             greet("Tom");           //can reuse and greet as many as we want!
             greet("Pressley");
             // this creates a type mismatch error!   String greet =  greet("Tom");  
             // "cannot convert from void to string" 
             // can't put a void method into a string to make it a variable
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
              //greetYou("JJ");  // this line alone does not print anything
              System.out.println(greetYou("JJ"));
              // or this way also works!: assign greeting to a variable of type String
              String greeting = greetYou("JJ");
              System.out.println(greeting);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		     //the void method won't return anything it will just DO something
              //the other method 14 will return something, and you can assign the
              // method name as a variable and print that out..
              // because you can access the method outside of the method itself
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		        String word = "cat";
                int number = 6;
              
              System.out.println(compareLength(word, number));
              //we also can just put the literals in as the parameters
              // System.out.println(compareLength("Cat", 6)); 
	
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		     System.out.println(isStringInArray(names, "Sam")); //we can just reuse the array of names we made earlier!
	
		     
		     
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	   
		     System.out.println(returnSmallestInt(array)); // (name of method we wrote (name of array))
		     
		     
		     
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		     double[] arrayOfDoubles = {4.0, 69.69, 34.35, 76.8, 27.6};
		     System.out.println(findAverageOfArray(arrayOfDoubles));
		     
		     
		     
		     

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		     //already have an array of names we can use 
		  //   System.out.println(matchesStringLength(names));//can't just print out because we need to assign to a variable first
		     // then iterate over it 
	//	     int[] nameLengths = matchesStringLength(names);
	//	     for (int number1 : nameLengths) {
	//	    	 System.out.println(number1); 
	//	     }
		     
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
 
		     System.out.println(hasMoreEvenCharacters(names));
		     
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
       System.out.println(isPalindrome("racecar")); 
       //this method will check the word you type into the sysout line.../!??! 
		
		
	}
	

	
	//here we test methods OUTSIDE of the main method...
	// but inside the class 
	// Method 13:
	   public static void greet(String name) {  //write methods outside main method, but 
		   // use them inside ?!? so we need the STATIC indicator
	    	 System.out.println("Hello, " + name + "!");
	   }
	        

	     
	// Method 14:
	   public static String greetYou(String name) { //string is the return type, which we want to return a string
		  // COULD create a variable, and then return the greeting, like this..
		   //String greeting = "blah blah"; 
		 //  return greeting;
		   return "Hi " + name + "!";       //or for this since it's simple we can just do return statement
	   }

	
	// Method 15:
	   
	   public static boolean compareLength(String word, int number) {
		   if (word.length() >number) {      //also i was missing ()
			   return true;
		   } else {              //i forgot to include else return false
			   return false;      //also we don't even need the ELSE line because anything
		   }                 // after the first return statement the method ends
	   }                //also the word.length > number is ALREADY  boolean expression!
	 //  we can literally just say--  return word.length()>number; 

	
	// Method 16:
     
	   public static boolean isStringInArray(String[] array, String word) { //make sure to write array title here 
		   //we need to use a for loop to iterate through the array
		   for (String str : array) {  //here we need to compare str  and word and see if they are equal
			   if (str.equals(word)) {
				   return true;
			   }
		   }
		   return false;     //now we still need the sysout statement up above 
			   
		   }
	   
	
	// Method 17:
    // need to iterate through the array so we need a loop
	   // also need to declare a variable to represent the smallest number to be able to compare all the elements 
     public static int returnSmallestInt(int[] numbers) { 
    	 int smallest = numbers[0]; 
		   for (int number : numbers) {
			   //need an if statement...
			   if (number < smallest) {
			   smallest = number; // then this will replace the number with the smallest number ...?!?!
		   }
	   }
		   return smallest;  //return statement is outside of the loop and the if statement so it doesn't occur until the loop is finished 
     }
		
	
	// Method 18:
    public static double findAverageOfArray(double[] doubles) {
    	 double sum = 0;    
    	for (double number : doubles) {
    		sum += number;
    	} 
    	return sum/doubles.length;
  
    	} 
    
      

	
	// Method 19:

   // public static int[] matchesStringLength(String[] strings) { //returns an array of int
    //	int [] results = new int[strings.length];  //we need to create a new array of ints? 
    	//not sure what this question is even asking exactly
    	// then a traditional for loop to iterate through each element in the array
    	//traditional for loop will give us access to each element's INDEX..!? we need i = 0 
    	//to assign position 0 from strings to position 0 in ints 
    //	for (int i = 0; i < strings.length; i++);
    //	   results[i] = strings[i].length(); //strings[i] returns the element (a string) at position i in our strings array
    	//this line above will assign each line to each other in each array in the same position
    	  
   // }
   // return results;
    // getting an error message for this one i not assigned to a variable but i did
    // everything exactly like the video 

    
    
    
	// Method 20:
	public static boolean hasMoreEvenCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		//now we iterate through the array of each to count them 
		for (String string : array) {
			if (string.length() % 2 ==0) { //DON'T capitalize string here 
				evenLetters += string.length();
			} else {
				oddLetters += string.length(); 
			}
					
	}
    return evenLetters>oddLetters;  //this is our boolean statement
	}
	
	// Method 21: //apparently a bunch of ways to solve this... we can compare
	// first character to last character, and keep looping through that..
	 public static boolean isPalindrome(String string) {
		 for (int i = 0; i < string.length()/2; i++) { //we also only check halfway through for a palindrome
			 if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				 return false;  // this will keep looping through the last character, then 
				 // 2nd to last character, then 3rd to last etc....
			 }
		 }
		 return true; 
	 }


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	   }	
		
	


