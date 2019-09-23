package com.techlabs.loader;

import java.io.*;

public class FileLoader implements ILoader{
	private BufferedReader bufferReader;
	private String filePath;
	private String line="";
	private String newLine;
	public FileLoader(String filePath) throws IOException{
		this.filePath=filePath;
	}

	@Override
	public String load() {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!!");
		}
		bufferReader = new BufferedReader(fileReader);
		try {
			newLine=bufferReader.readLine();
			while(newLine!=null) {
				line=line+newLine+"\n";
				newLine=bufferReader.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return line;
	}
	
}
