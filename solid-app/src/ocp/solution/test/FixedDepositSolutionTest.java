package ocp.solution.test;

import ocp.solution.FixedDeposit;
import ocp.solution.*;

public class FixedDepositSolutionTest {

	public static void main(String[] args) {
		FixedDeposit fd=new FixedDeposit("Sunny", 100000, 3, new Holi());
		FixedDeposit fd1=new FixedDeposit("Ravi", 200000, 2,new Normal());
		System.out.println("Simple Interest is: "+fd.calculateSimpleInterest());
		System.out.println("Simple Interest is: "+fd1.calculateSimpleInterest());

	}

}
