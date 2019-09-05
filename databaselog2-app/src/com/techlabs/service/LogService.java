package com.techlabs.service;

import java.io.*;
import com.techlabs.service.FileRead;


public class LogService {
	private final static String zero = "0";
	private final static String one = "1";
	private final static String two = "2";
	private String argument;
	private String[] words = null;
	private String s,log="";
	private String logs[];
	FileRead fileRead=new FileRead();

	private String printLog(String argument, String word, String s) {
		switch (argument) {
		case zero:
			if (word.equals("INFO"))
				return s;
			break;
		case one:
			if (word.equals("WARNING"))
				return s;
			break;
		case two:
			if (word.equals("ERROR"))
				return s;
			break;
		default:
			if (word.equals("ERROR"))
				return s;
			break;
		}
		return null;
}

	public String[] getLog(String args) throws IOException {
		BufferedReader bufferReader=fileRead.getFile();
		if(args!=null)
			argument=args;
		else
			argument="";
		while ((s = bufferReader.readLine()) != null) {
			words = s.split(" ");
			for (String word : words) {
				log=printLog(argument, word, s);
				if(log!=null) {
					for(int i=0;;i++) {
						logs[i]=log;
					}
				}
			}
		}
		return logs;
	}
}