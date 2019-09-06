package com.techlabs.service;

import java.io.*;
import java.util.*;

public class LogService {
	private final static String zero = "0";
	private final static String one = "1";
	private final static String two = "2";
	private String s;
	FileRead fileRead = new FileRead();

	private static String getLevel(String type, String argument) {
		if (type.equals("-level")) {
			switch (argument) {
			case zero:
				return "INFO";
			case one:
				return "WARNING";
			case two:
				return "ERROR";
			default:
				return "ERROR";
			}
		}

		else if (type.equals("-help")) {
			System.out.println("Enter command '-level 0' to get the logs of 'INFO'"
					+ "\nEnter command '-level 1' to get the logs of 'WARNING'"
					+ "\nEnter command '-level 2' to get the logs of 'ERROR'");
			return "";
		} else
			return "ERROR";
	}

	public ArrayList<String> getLog(String args0, String args1) throws IOException {
		BufferedReader bufferReader = fileRead.getFile();
		if (args0 == null && args1 == null) {
			args0 = "";
			args1 = "";
		} else if ((args0 != null && args1 == null))
			args1 = "";
		String level = getLevel(args0, args1);
		ArrayList<String> list = new ArrayList<String>();
		while ((s = bufferReader.readLine()) != null) {
			if (!level.equals(""))
				if (s.contains(level))
//				System.out.println(s);
					list.add(s);
//				return logs;
		}
//		return logs;
		return list;

	}

}