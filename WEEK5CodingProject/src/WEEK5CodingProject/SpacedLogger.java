package WEEK5CodingProject;

public class SpacedLogger implements Logger {

	
	
	
	@Override
	public void log(String log) {   //do i actually need to make it a type char?
		// must add a space in between each char
		// do a loop to separate words by chars?
		//  .charAt(i) + " " 
		for (int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + " ");
		}
	}

	@Override
	public void error(String error) {
		System.out.print("ERROR: ");
	
		for (int i = 0; i < error.length(); i++) {
			System.out.print(error.charAt(i) + " " );
		}
	}
		
		

}
