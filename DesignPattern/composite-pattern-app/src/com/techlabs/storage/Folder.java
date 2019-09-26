package com.techlabs.storage;

import java.util.*;

public class Folder implements IStorageItem {
	private String name;
	
	private List<IStorageItem> children;
	
	public Folder(String name){
		this.name=name;
		children=new ArrayList<IStorageItem>();
	}

	@Override
	public void display() {
		System.out.println("Folder Name is :"+name);
		
	}

	public void addChild(Folder folder) {
		children.add(folder);
		
	}
	
}
