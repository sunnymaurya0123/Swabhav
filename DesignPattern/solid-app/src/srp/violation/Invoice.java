package srp.violation;

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
	
	public void print(Invoice invoice){
		System.out.println("Invoice id: "+invoice.id+"\nInvoice description: "+invoice.description+"\nCost: "
				+invoice.cost+"\nDiscount Percent: "+invoice.discountPercent+"\nGST: "+invoice.GST+"\nDiscount price: "
				+invoice.calculateDiscount()+"\nTax: "+invoice.calculateTax()+"\nTotal Amount: "+invoice.calculateTotal());
	}
	
}
