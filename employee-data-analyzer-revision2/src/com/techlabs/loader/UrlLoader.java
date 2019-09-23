package com.techlabs.loader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlLoader implements ILoader{
	private BufferedReader bufferReader;
	private String link;
	private String line="";
	private String newLine;
	public UrlLoader(String link) throws IOException{
		this.link=link;
		
	}
	
	@Override
	public String load() {
		URL url = null;
		try {
			url = new URL(link);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		URLConnection connection = null;
		try {
			connection = url.openConnection();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		InputStreamReader input = null;
		try {
			input = new InputStreamReader(connection.getInputStream());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		bufferReader=new BufferedReader(input);
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
