package dip.solution;

public class XMLLogger implements ILogger{
	
	@Override
	public void log(String message) {
		System.out.println("Error stored in XML : "+message);
	}
}
