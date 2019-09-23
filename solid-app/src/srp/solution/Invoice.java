package srp.solution;

public class Invoice {
	private int id;
	private String description;
	private double cost;
	private float discountPercent;
	private final float GST=20;
	
	public Invoice(int id,String description,double cost,float discountPercent){
		this.id=id;
		this.description=description;
		this.cost=cost;
		this.discountPercent=discountPercent;
	}
	
	double calculateDiscount() {
		return cost*((double)discountPercent/100);
	}
	
	double calculateTax() {
		return cost*((double)GST/100);
	}
	
	public double calculateTotal() {
		return cost+calculateTax()-calculateDiscount();
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscountPercent() {
		return discountPercent;
	}

	public float getGST() {
		return GST;
	}
	
}
