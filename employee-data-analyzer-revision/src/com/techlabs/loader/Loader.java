package com.techlabs.loader;

import java.io.*;

public class Loader {
	private BufferedReader bufferReader;
	
	public Loader(String filePath) throws FileNotFoundException{
		FileReader fileReader = new FileReader(filePath);
		bufferReader = new BufferedReader(fileReader);
	}
	
	public BufferedReader getBufferReader() {
		return bufferReader;
	}
}
