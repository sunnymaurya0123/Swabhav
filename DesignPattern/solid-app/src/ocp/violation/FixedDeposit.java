package ocp.violation;

public class FixedDeposit {
	private String name;
	private double principle;
	private int years;
	private FestivalType festival;

	public FixedDeposit(String name, double principle, int years, FestivalType festival) {
		this.name = name;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
	}

	public double calculateSimpleInterest() {
		
		return principle * years * getRateOfInterest(festival) / 100;
	}
	
	private int getRateOfInterest(FestivalType festival) {
		int rateOfInterest = 0;
		switch (festival) {
		case HOLI:
			 rateOfInterest=8;
			 break;
		case NEWYEAR:
			rateOfInterest=9;
			break;
		case NORMAL:
			rateOfInterest=7;
			break;
		default:
			rateOfInterest=7;
			break;
		}
		return rateOfInterest;
	}
}
