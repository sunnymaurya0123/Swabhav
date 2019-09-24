package isp.violation.test;

import isp.violation.IWorker;
import isp.violation.Manager;
import isp.violation.Robot;

public class IspViolationTest {

	public static void main(String[] args) {

		atTheCafeteria(new Manager());
		atTheWorkStation(new Manager());
		atTheCafeteria(new Robot());
		atTheWorkStation(new Robot());
	}

	static void atTheWorkStation(IWorker w) {
		System.out.println("At the Work Station");
		w.startWork();
		w.stopWork();
		
	}

	static void atTheCafeteria(IWorker w) {
		System.out.println("At the Cafeteria");
		w.startEat();
		w.stopEat();
		
	}
}
