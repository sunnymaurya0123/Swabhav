package com.techlabs.testlog;

import java.io.*;
import java.util.*;
import com.techlabs.service.LogService;

public class TestLog {

	public static void main(String[] args) throws IOException {

		LogService logService = new LogService();
		ArrayList<String> list;
		if (args.length != 0) {
			if (args.length == 2) {
				list = logService.getLog(args[0], args[1]);
				printInto(list);
			} else if (args.length == 1) {
				list = logService.getLog(args[0], null);
				printInto(list);
			}
		}

		else {
			list = logService.getLog(null, null);
			printInto(list);
		}
	}

	static void printInto(ArrayList<String> list) {
		for (String lists : list)
			System.out.println(lists);
	}

}
