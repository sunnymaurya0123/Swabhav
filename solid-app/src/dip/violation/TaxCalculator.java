package dip.violation;

public class TaxCalculator {
	
	private LogType log;
	
	public TaxCalculator(LogType type) {
		log=type;
	}
	
	public int calculateTax(int amount,int rate) {
		int r=0;
		try {
		r=amount/rate;
		return r;
		} catch(Exception ex) {
			r=-1;
			String message=ex.getMessage();
			System.out.println("Something is wrong while entering the values. Please enter valid nos");
			if(log.equals(LogType.XML))
				new XMLLogger().log(message);
			else
				new FileLogger().log(message);
			//throw ex;
		}
		return -1;
	}
}
