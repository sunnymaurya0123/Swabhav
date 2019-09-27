package com.techlabs.storage.test;

import com.techlabs.storage.File;
import com.techlabs.storage.Folder;

public class StorageTest {

	public static void main(String[] args) {
		Folder root=new Folder("movies");
		Folder comedy=new Folder("comedy");
		comedy.addChild(new File("def.avi",100,".avi"));
		File sunny=new File("sunny.avi",100,".avi");
		comedy.addChild(sunny);
		root.addChild(comedy);
		root.addChild(new File("abc.avi",500,".avi"));
		root.addChild(new File("pqr.avi",1000,".avi"));
		Folder romance=new Folder("romance");
		romance.addChild(new File("lmno.avi",300,".avi"));
		root.addChild(romance);
		comedy.display();
		System.out.println("Removed: "+comedy.removeChild(sunny));
		Folder main=new Folder("main");
		main.addChild(root);
		main.display();

	}

}
