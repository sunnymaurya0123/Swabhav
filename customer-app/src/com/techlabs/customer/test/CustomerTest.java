package com.techlabs.customer.test;

import com.techlabs.customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer1=new Customer("abc","xyz");
		Customer customer2=new Customer("pqr","lmno");
		Customer customer3=new Customer("stuv","wxyz");
		System.out.println(customer1.getId());
		System.out.println(customer2.getId());
		System.out.println(customer3.getId());
		System.out.println(customer1.getId());

	}

}
