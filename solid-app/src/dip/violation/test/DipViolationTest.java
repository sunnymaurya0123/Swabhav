package dip.violation.test;

import dip.violation.LogType;
import dip.violation.TaxCalculator;

public class DipViolationTest {

	public static void main(String[] args) {
		TaxCalculator calc=new TaxCalculator(LogType.XML);
		System.out.println(calc.calculateTax(20, 0));

	}

}
