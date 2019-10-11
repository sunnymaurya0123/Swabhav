package srp.solution;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InvoicePrinter {
	public void printInvoice(Invoice invoice){
		System.out.println("Invoice id: "+invoice.getId()+"\nInvoice description: "+invoice.getDescription()+"\nCost: "
				+invoice.getCost()+"\nDiscount Percent: "+invoice.getDiscountPercent()+"\nGST: "+invoice.getGST()+"\nDiscount price: "
				+invoice.calculateDiscount()+"\nTax: "+invoice.calculateTax()+"\nTotal Amount: "+invoice.calculateTotal());
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("<html><head><title>Invoice</title></head><body> Id:"+invoice.getId()+
				"\n<br>Invoice description: "+invoice.getDescription()+"\n<br>Cost: "+invoice.getCost()+"\n<br>Discount Percent: "+invoice.getDiscountPercent()+"\n<br>GST: "+invoice.getGST()+"\nDiscount price: "
				+invoice.calculateDiscount()+"\n<br>Tax: "+invoice.calculateTax()+"\n<br>Total Amount: "+invoice.calculateTotal()+" </body></html>");
		try {
			FileWriter fileWriter=new FileWriter("Resources/invoice.html");
			BufferedWriter bufferWriter=new BufferedWriter(fileWriter);
			bufferWriter.write(stringBuilder.toString());
			bufferWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
