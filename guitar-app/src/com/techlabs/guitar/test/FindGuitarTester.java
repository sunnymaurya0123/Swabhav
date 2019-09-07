package com.techlabs.guitar.test;

import java.util.*;
import com.techlabs.enums.*;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.GuitarSpec;
import com.techlabs.inventory.Inventory;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,  Wood.ALDER, Wood.ALDER);

		List matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("  We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType()
						+ " guitar:\n     " + spec.getBackWood() + " back and sides,\n     " + spec.getTopWood()
						+ " top.\n  You can have it for only $" + guitar.getPrice() + "!\n  ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	  private static void initializeInventory(Inventory inventory) {
	    inventory.addGuitar("V95693", 1499.95,new GuitarSpec( Builder.FENDER,"Stratocastor", Type.ELECTRIC,12, Wood.ALDER, Wood.ALDER));
	    inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,6, Wood.ALDER, Wood.ALDER));
	    inventory.addGuitar("V5435", 2013.54, new GuitarSpec(Builder.COLLINGS,"Stratocastor",Type.ACOUSTIC,8,Wood.INDIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD));
	  }
	}