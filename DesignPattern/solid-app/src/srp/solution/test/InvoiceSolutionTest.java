package srp.solution.test;

import srp.solution.Invoice;
import srp.solution.InvoicePrinter;

public class InvoiceSolutionTest {

	public static void main(String[] args) {
		Invoice invoice=new Invoice(101,"Book",100,40);
		InvoicePrinter print=new InvoicePrinter();
		print.printInvoice(invoice);
		
	}

}