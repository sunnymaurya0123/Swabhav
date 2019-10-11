package com.techlabs.filetostring;

import java.io.BufferedReader;
import java.io.IOException;

import com.techlabs.loader.FileLoader;
import com.techlabs.loader.UrlLoader;

public class DataToStringConverter {
	private String line="";
	private String newLine;
	
	
	
	public String getLine(BufferedReader bufferReader) throws IOException {
		newLine=bufferReader.readLine();
		while(newLine!=null) {
			line=line+newLine+"\n";
			newLine=bufferReader.readLine();
		}
		return line;
	}
}
