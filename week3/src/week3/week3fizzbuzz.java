package week3;

public class week3fizzbuzz {
	
	
	String userWord = "Java";
	
	public static void charArray(String userWord) {
	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

	        // WRITE YOUR CODE HERE FOR
	        //String s = "someString"; for (int i = 0; i < s.length(); i++) { System.out.println(s.charAt(i)); }.
	        
	        //String userWord = " ";
		  char[] printEachCharacter = new char{userWord};
	         //char element = elements[0];
	        
	        
	        for (int i = 0; i < word.length(); i++)  {
	            
	        
	        } 
	       
	
	
	
	 public static boolean isDivisibleBy(int number, int divisor) {
		 return (number % divisor == 0);
	 }
	 
 public static boolean  isDivisibleBy15(int number) {
	 return isDivisibleBy(number, 15); 
	 }
 
 /**
  * can make notes about your code here!
  * @param args
  * @return true is divisible by 15, false if otherwise
  */
	 public static boolean  isDivisibleBy5(int number) {
		 return isDivisibleBy(number, 5); 
		
 }
	 public static boolean  isDivisibleBy3(int number) {
		 return isDivisibleBy(number, 3); 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // write a program which iterates the integers from 1 to 50.
		//for multiples of 3 print 'coca" instead of the #
		// and for the multiples of 5 print "cola". for numbers
		//which are multiples of both 3 and 5, print 'cocacola"
		// *(can always translate from a for loop to a while loop
		// *check your work (run your program) thru each step of the process
		
		for (int i = 1; i <=50; i++) {
			if  ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("CocaCola");
		    }
			else if (i % 3 == 0) {
				System.out.println("Coca");
			}
			else if (i % 5 == 0) {
				System.out.println("Cola");
			}
			else {
			System.out.println(i);
			
		}
		// if we did a while loop:
		//int i = 1;
		// while (i <=50) {
		// i++;
		// }
		
	}

				
		 System.out.println(userWord.charAt(i));
					
}
}
