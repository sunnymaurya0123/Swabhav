package com.techlabs.loader;

import java.io.*;

public class FileLoader {
	private BufferedReader bufferReader;
	
	public FileLoader(String filePath) throws IOException{
		FileReader fileReader = new FileReader(filePath);
		bufferReader = new BufferedReader(fileReader);
		
	}
	
	public BufferedReader getBufferReader() {
		return bufferReader;
	}
	
}
