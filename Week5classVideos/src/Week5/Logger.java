package Week5;

public interface Logger {

	// interface - ONLY define method signatures - when you know WHAT you want to happen
	// versus how you want it to happen
	//interface = think of the word contract.
	// NO method body
	//every method in an interface is assumed to be abstract so we don't need the keyword abstract
	
	
	// versus abstract class- some methods do have method bodies
	
	//we can add comments so others can know the intentions
	

	public void info (String info);
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	public void close();
	

	
private void setLogger (Logger logger) {
	this.setLogger = new logger;
	
}	
	
}
