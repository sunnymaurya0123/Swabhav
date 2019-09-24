package dip.solution;

public class TaxCalculator {
	
	private ILogger logger;
	public TaxCalculator(ILogger logger) {
		this.logger=logger;
	}
	
	public int calculateTax(int amount,int rate) {
		int r=0;
		try {
		r=amount/rate;
		} catch(Exception ex) {
			r=-1;
			String message=ex.getMessage();
			System.out.println("Something is wrong while entering the values. Please enter valid nos");
			logger.log(message);
			throw ex;
		}
		return r;
	}
}
