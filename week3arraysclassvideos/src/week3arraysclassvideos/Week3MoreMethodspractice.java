package week3arraysclassvideos;

public class Week3MoreMethodspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Take an array of ints and return the sum of all the ints 
		
        int[] myArray = new int[3];
  		  myArray[0] = 7;
          myArray[1] = 10;
  		  myArray[2] = 0;
  		
  	//int sum = sumArray(myArray);  //we can assign this to an int that we label sum
  	//there are a couple different options for printing this out
  		
  		  int sum = sumArray(myArray);
  		System.out.println(sumArray(myArray));
  		
  		
  		double [] grades = new double [5];
  		grades[0] = 88.7;
  		grades[1] = 92.5;
  		grades[2] =100;
  		grades[3] = 67.3;
  		grades[4] = 78.9;
  		
  		System.out.println(calculateAverage(grades));   //"grades" is the Array we made
  		//String[] = strings = new String[1]; //these three lines- we can't call upon
  		//strings[0] = "test";     // this method for string because the method we
  		//sumArray(strings);   // created was for an int 
  		System.out.println(multiplyString("Hello", 5)); 
}

	
	
	
  		
public static int sumArray(int[] numbers) {        //(for now we'll only use public static)
	//for this first line these are only the instructions first, not actually doing anything yet..
 //we don't know how many elements yet...
	int sum = 0;  //we use this variable to keep track of all the ints
	//we need to find each element in the array and add them
	//could use a traditional for loop but an enhanced for loop is better
	for (int number : numbers) {
		sum += number;  
	}
	return sum; 
} 

// take an array of double and return the average of all elements to the array
	
     public static double calculateAverage (double[] numbers ) { //keyword 'take' means it will probably take a parameter
         double sum = 0;
         for (double number : numbers) {
        	 sum += number;
         }
		
		return sum/numbers.length;
     }
     
     
     
     //take a string and an int and return the String concatenated
     //with itself int number of times 
     
     public static String multiplyString(String str, int num) {
    	 String result = " ";  // set this equal to an empty string ... 
    	 //can't use an enhanced for loop!! because we don't have an array to iterate over
    	 for (int i = 0; i < num; i++) {
    		 result += str;   //taking the empty string " " and then iterate while i is less than num, then concatenating whatever the empty string is
    	 }
    	 return result;
     }
     
     
     
     
     
     
     
     
     
}
		
		
		
		
		
		
		
		
	


