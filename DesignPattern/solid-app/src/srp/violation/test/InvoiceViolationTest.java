package srp.violation.test;

import srp.violation.Invoice;

public class InvoiceViolationTest {

	public static void main(String[] args) {
		Invoice invoice=new Invoice(101,"Invoice1",100,40);
		invoice.print(invoice);
	}

}
