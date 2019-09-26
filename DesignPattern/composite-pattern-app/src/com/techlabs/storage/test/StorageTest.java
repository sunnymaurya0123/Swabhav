package com.techlabs.storage.test;

import com.techlabs.storage.Folder;

public class StorageTest {

	public static void main(String[] args) {
		Folder root=new Folder("movies");
		root.addChild(new Folder("comedy"));
		root.display();

	}

}
