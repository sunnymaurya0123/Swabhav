package dip.solution;

public class FileLogger implements ILogger{
	@Override
	public void log(String message) {
		System.out.println("Error stored in File : "+message);
	}
}
