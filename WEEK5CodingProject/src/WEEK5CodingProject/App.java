package WEEK5CodingProject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AsteriskLogger aLogger = new AsteriskLogger();
		
        SpacedLogger sLogger = new SpacedLogger();
        
        
        aLogger.log("Logger" );
        aLogger.error("Logger ");
		sLogger.log("Logger");
		System.out.println("-------");
		sLogger.error("Logger");
	}

	
}
