package com.techlabs.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		FileWriter filewriter=new FileWriter("Resources\\eclipse.txt",true);
		filewriter.write("\nSunny");
		//filewriter.write(100);
		//filewriter.flush();
		filewriter.close();
	}

}
