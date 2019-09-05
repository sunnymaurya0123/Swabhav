package com.techlabs.testlog;

import java.io.*;

import com.techlabs.service.LogService;

public class TestLog {
	
	static String logs;
	public static void main(String[] args) throws IOException {
		
		LogService logService=new LogService();
		if(args.length!=0) {
		logs=logService.getLog(args[1]);
		System.out.println(logs);
		}
		else {
			logs=logService.getLog(null);
			System.out.println(logs);
		}
	}

}
