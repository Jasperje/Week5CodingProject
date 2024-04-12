package Week5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// syntax errors = red x and red underline
		//you can run the program once these are all fixed
		//exceptions are anything that happens after syntax errors are fixed
		int[] numbers = new int[3];
		if (numbers.length > 3) {
			System.out.println(numbers[3]);
			
		}
		System.out.println("Bye!");
		
		
		//ex: out of bounds exception
		//if not handled the program can crash
		
		//checked exception = we want to explicitly check for in our code (ex. input, output)
		// "try catch block" - handles checked exceptions
		
		
		//unchecked = we don't check for. we can avoid them by writing clean code/following best practices
		// only occur if we make mistakes
		// ex- index out of bounds and null pointers
		
		
		//Try catch block:  except we would NOT use this for an unchecked exceptions
	//	try {
	//		System.out.println(numbers[3]);
	//		System.out.println("In the try");
			
	//	} catch (Exception e) { //exception is  a superclass of all exceptions
	///	System.out.println(e.toString());
	//	}
		
		
		try {
			FileReader fileReader = new FileReader("something.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} catch (Exception e)  { 
			
		} finally {  //finally block will run no matter what, if you need the statements
			System.out.println("Finally!");   //afterward to print no matter what
		}
		try {
			openFile("AnotherFile.jpg");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// when i  typed this line first:
		//FileReader fileReader = new FileReader("something.txt");
		//first hover over filereader and import java.io
		//then there is a red underline on right side of = 
		// we can hover over and java will automatically surround with a try/catch block
		
		//if we don't want to handle the exception INSIDE the method (with the try/catch block,
		// we can add a throws declaration
		// but it seems like either way we need to use a try/catch block
		// not sure why
		
		
		// you can have MULTIPLE catch statements just like if / else if
		//but you must start with the most SPECIFIC classes at the top
		// and work down to the most general (otherwise they might not run through)
	}
	
		public static FileReader openFile(String fileName) throws FileNotFoundException {
             
				return new FileReader(fileName);
			
		}
		
		
		
	}


