package com.techlabs.inventory;

import java.util.*;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.GuitarSpec;

public class Inventory {
	
	List guitars;
	
	public Inventory() {
		guitars=new LinkedList();
	}
	
	public List search(GuitarSpec searchSpec) {
		List matchingGuitars=new LinkedList();
		for(Iterator i=guitars.iterator();i.hasNext();) {
			Guitar guitar=(Guitar) i.next();
			if(guitar.getSpec().matches(searchSpec))
				matchingGuitars.add(guitar);
		}
		return matchingGuitars;
		
	}

	public void addGuitar(String serialNumber,double price,GuitarSpec guitarSpec) {
		Guitar guitar=new Guitar(serialNumber,price,guitarSpec);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for(Iterator i=guitars.iterator();i.hasNext();) {
			Guitar guitar=(Guitar) i.next();
			if(guitar.getSerialNumber().equals(serialNumber))
				return guitar;
	}
		return null;
	}
}
