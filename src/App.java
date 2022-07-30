
public class App {

	public static void main(String[] args) {

		Logger asterikLogger = new AsterikLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asterikLogger.log("C ya");
		asterikLogger.error("Wouldn't want to be ya");
		
		System.out.println();
		
		spacedLogger.log("C ya");
		spacedLogger.error("Wouldn't want to be ya");
				
	}

}
