package week3arraysclassvideos;

public class week3arraysclassvideos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] students = new String [3];
		
		students[0] = "Vanessa";
		students[1] = "JJ";
		students[2] = "Josh";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]); 
		}
		//enhanced for loop! performs an iteration for each element inside the array
		// we have to declare what we want to refer to that element by (not i)
		
		for (String student : students) {
			//means: for each student in students (read the colon as IN) 
			//this represents the current element of each iteration
			System.out.println(student);  //this print command will execute
			//for EACH element in the array
		}
		
		String [] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapple";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		//enhanced for loop!
		for (String product : products) {
			System.out.println("Product: " + product);
		}
		
		int[] multiplesOf3 = new int [10];
		//we could just write a regular for loop to print these multiples of 3
		
		for (int i = 1; i <= multiplesOf3.length; i++) {
			// starting i at 1, so 1 will be another factor in our product for multiples of 3
			// (meaning we will assign each element i times 3 ) 
			multiplesOf3[i-1] = i * 3;
			System.out.println("number: " + multiplesOf3[i-1]);
		}
		
		int [] multiplesOf5 = new int [10];
		for (int i = 0; i < multiplesOf5.length; i++ ) {
			multiplesOf5[i] = i * 5; //OR you can say  = (i + 1) * 5;
			System.out.println("number: " + multiplesOf5[i]);
		}
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
		
	
	}
	
	public static String createFullName(String x, String y) { //parameters can be related like 
		String fullName = x + " " + y;           // firstName, lastName, or whatever, but they
		return fullName;                   // don't have to be! can just be x, y, etc...
	}
		
		
		
	
	
	}
	}

