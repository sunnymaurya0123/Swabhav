package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class FixedDepositViolationTest {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit=new FixedDeposit("Sunny",100000,3,FestivalType.NORMAL);
		System.out.println("Simple Interest is: "+fixedDeposit.calculateSimpleInterest());

	}

}
