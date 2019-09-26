package com.techlabs.storage;

public class File implements IStorageItem {

	private String name;
	private int size;
	private String extension;
	
	public File(String name,int size,String extension) {
		this.name=name;
		this.size=size;
		this.extension=extension;
	}
	
	@Override
	public void display() {
		System.out.println("File Name:"+name+"\nFile Size: "+size+"\nFile extension: "+extension);
		
	}

}
