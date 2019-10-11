package isp.solution.test;

import isp.solution.IHuman;
import isp.solution.IWorker;
import isp.solution.Manager;
import isp.solution.Robot;

public class IspSolutionTest {

	public static void main(String[] args) {

		atTheCafeteria(new Manager());
		atTheWorkStation(new Manager());
		//atTheCafeteria(new Robot());
		atTheWorkStation(new Robot());
	}

	static void atTheWorkStation(IWorker w) {
		System.out.println("At the Work Station");
		w.startWork();
		w.stopWork();
	}

	static void atTheCafeteria(IHuman human) {
		System.out.println("At the Cafeteria");
		human.startEat();
		human.stopEat();
		
	}
}
