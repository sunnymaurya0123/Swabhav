package com.techlabs.databaselog;

import java.io.*;

public class DatabaseLog {

	private final static String zero = "0";
	private final static String one = "1";
	private final static String two = "2";
	static String argument;

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("Resources\\db_app.log");
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String[] words = null;
		String s;

		if (args.length != 0)
			argument = args[1];
		else
			argument = "";
		while ((s = bufferReader.readLine()) != null) {
			words = s.split(" ");
			for (String word : words)
				printLog(argument, word, s);
		}

		bufferReader.close();

	}

	static void printLog(String argument, String word, String s) {
		switch (argument) {
		case zero:
			if (word.equals("INFO"))
				System.out.println(s);
			break;
		case one:
			if (word.equals("WARNING"))
				System.out.println(s);
			break;
		case two:
			if (word.equals("ERROR"))
				System.out.println(s);
			break;
		default:
			if (word.equals("ERROR"))
				System.out.println(s);
			break;
		}
	}

}
