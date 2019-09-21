package com.techlabs.shoppingcart.test;

import java.io.*;
import com.techlabs.shoppingcart.*;

public class TestShoppingCart {
	private static double totalCost;
	private static double totalOrderCost;

	public static void main(String[] args) throws IOException {
		Product product1=new Product(101,"Book",100,20);
		product1.calculateProductCost();
		Product product2=new Product(102,"Pen",200,30);
		product2.calculateProductCost();
		Product product3=new Product(103,"Laptop",300,40);
		product3.calculateProductCost();
		Product product4=new Product(104,"Pencil",10,5);
		product4.calculateProductCost();
		
		LineItem lineItem1=new LineItem(100,2,product1);
		LineItem lineItem2=new LineItem(101,3,product2);
		LineItem lineItem3=new LineItem(101,3,product3);
		LineItem lineItem4=new LineItem(101,4,product4);
		
		Order order1=new Order(1001,"01/01/2019");
		order1.add(lineItem1);
		order1.add(lineItem2);
		
		Order order2=new Order(1002,"01/02/2019");
		order2.add(lineItem3);
		order2.add(lineItem4);
		
		Customer customer1=new Customer(10,"Ravi");
		customer1.addOrder(order1);
		customer1.addOrder(order2);
		
		printInfo(customer1);
		
		String s;
		File file=new File("Resources/invoice.html");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		while ((s = bufferReader.readLine()) != null) {
			//System.out.println(s);
			if(s.contains("{name}")) {
				s.replace("{name}", ""+totalCost);
			}
			System.out.println(s);	
		}
		bufferReader.close();
		
		PrintWriter printWriter=new PrintWriter(file);
		BufferedWriter bufferedWriter=new BufferedWriter(printWriter);
		
	}

	static void printInfo(Customer customer1) {
		
		for(Order orders:customer1.getOrders()) {
			System.out.println("At "+orders.getDate()+" "+customer1.getName()+" purhased these products:");
			System.out.println();
			printProductDetails(orders,totalCost);
			
			
			System.out.println();
		}
		System.out.println("Total Amount Spent: "+totalOrderCost);
	}

	private static void printProductDetails(Order orders,double totalCost) {
		
		for(LineItem lineItems:orders.getItems()) {
			
			totalCost=totalCost+lineItems.calculateItemCost();
			System.out.println("Product Id: "+lineItems.getProduct().getId()+" Product Name: "+lineItems.getProduct().getName()+
					" Product Price: "+lineItems.getProduct().getPrice()+" Product discount: "+lineItems.getProduct().getDiscountPercent()
					+" Product Quantity: "+lineItems.getQuantity()+" Total Product Cost: "+lineItems.calculateItemCost());
		}
		System.out.println("Total Amount paid: "+totalCost);
		totalOrderCost=totalOrderCost+totalCost;
	}

}
