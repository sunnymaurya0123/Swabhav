package ocp.solution;

import ocp.violation.FestivalType;

public class FixedDeposit {
	private String name;
	private double principle;
	private int years;
	private int rateOfInterest;

	public FixedDeposit(String name, double principle, int years,IFestival festival) {
		this.name = name;
		this.principle = principle;
		this.years = years;
		rateOfInterest=festival.getRateOfInterest();
	}
	public FixedDeposit(String name, double principle, int years) {
		this(name,principle,years,null);
	}
	
public double calculateSimpleInterest() {
		
		return principle * years * rateOfInterest / 100;
	}
}
