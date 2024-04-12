package Week5;

import java.util.Date;

public class ConsoleLogger implements Logger{
// hover over console logger and add unimplemented methods
	//implements will implement the Logger interface
	
	
	@Override
	public void info(String info) {
          Date date = new Date();	
          System.out.println(date.toString() + ": " + info);
	}

	@Override
	public void warning(String warning) {
      Date date = new Date();
      System.out.println(date.toString() + "Warning- "   + ": "+ warning);
	}

	@Override
	public void error(String error) {
		Date date = new Date();	
		   System.err.println( date.toString() + "Error- " + ": "+ error); 
		   //system.err makes it
		   // print in red!
	}

	@Override
	public void fatal(String fatal) {
		Date date = new Date();	
		 System.err.println(  date.toString() + "FATAL!! "+ ": "+ fatal.toUpperCase());
	
	} 
	@Override
	public void close() {   //to close the writer on our file logger
		// any method that needs writer to be open
		//we have to close it
		// whatever the fuck this means

	}
	
	
	
	
	} 


