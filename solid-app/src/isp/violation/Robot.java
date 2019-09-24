package isp.violation;

public class Robot implements IWorker{
	
	@Override
	public void startWork() {
		System.out.println("Robot starts Working!!!");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stopped Working!!!");
		
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robots cannot eat!!!");
	}

	@Override
	public void stopEat() {
		
		
	}
}
