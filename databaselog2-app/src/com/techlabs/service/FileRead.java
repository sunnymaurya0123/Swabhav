package com.techlabs.service;

import java.io.*;

public class FileRead {
	public BufferedReader getFile() throws IOException {
		FileReader fileReader = new FileReader("Resources\\db_app.log");
		BufferedReader bufferReader = new BufferedReader(fileReader);
		return bufferReader;
	}
}