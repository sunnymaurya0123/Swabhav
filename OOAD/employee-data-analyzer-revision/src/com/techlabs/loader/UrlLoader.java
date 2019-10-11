package com.techlabs.loader;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class UrlLoader {
	private BufferedReader bufferReader;
	
	public UrlLoader(String link) throws IOException{
		URL url=new URL(link);
		URLConnection connection=url.openConnection();
		InputStreamReader input=new InputStreamReader(connection.getInputStream());
		bufferReader=new BufferedReader(input);
	}
	public BufferedReader getBufferReader() {
		return bufferReader;
	}
}
