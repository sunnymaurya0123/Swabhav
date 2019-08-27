package com.techlabs.files;
import java.io.*;
import java.util.*;
public class FileTest {

	public static void main(String[] args) throws Exception {
		File file=new File("Resources\\eclipse.ini");
		Scanner scanner=new Scanner(file);
		while(scanner.hasNextLine())
			System.out.println(scanner.nextLine());
		File files=new File("Resources\\eclipse.ini");
		if(files.createNewFile())
			System.out.println("File has been created");
		else
			System.out.println("File already exists");

	}

}
