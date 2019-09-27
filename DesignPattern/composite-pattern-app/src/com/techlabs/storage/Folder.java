package com.techlabs.storage;

import java.util.*;

public class Folder implements IStorageItem {
	private String name;
	private static int depth;
	
	private List<IStorageItem> children;
	
	public Folder(String name){
		this.name=name;
		children=new LinkedList<IStorageItem>();
	}

	@Override
	public void display() {
		depth++;
		System.out.println("Folder Name is :"+name);
		for(IStorageItem storage:children) {
			printSpace(depth);
				storage.display();
		}
		depth--;
	}

	private void printSpace(int depth) {
		for(int i=0;i<depth;i++)
			System.out.print("\t");
		
	}

	public void addChild(IStorageItem storage) {
		children.add(storage);
	}
	
	public String removeChild(IStorageItem storage) {
		 children.remove(storage);
		 return storage.getClass().toString();
	}
	
}
