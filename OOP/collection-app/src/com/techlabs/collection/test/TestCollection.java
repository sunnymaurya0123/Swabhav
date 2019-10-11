package com.techlabs.collection.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestCollection {

	public static void main(String[] args) {
		ArrayList cart=new ArrayList();
		cart.add(new LineItem(101,"ABC",50,100));
		cart.add(new LineItem(102,"book",3,500));
		cart.add(new LineItem(103,"pen",4,100));
		cart.add("String");
		for(Object l:cart) {
			LineItem lineItem=(LineItem) l;
			System.out.println(lineItem.getProductName());
		}

	}

}
