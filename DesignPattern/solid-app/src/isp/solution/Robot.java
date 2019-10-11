package isp.solution;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot starts Working!!!");

	}

	@Override
	public void stopWork() {
		System.out.println("Robot stopped Working!!!");

	}

}
