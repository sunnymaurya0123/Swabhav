package com.techlabs.property;

import java.io.*;
import java.util.*;

public class LoadPropertyFile {
	
	Properties p = new Properties();
	public LoadPropertyFile(String filePath) throws IOException{
		FileReader reader=new FileReader(filePath);
		 p.load(reader);
	}
	
	public String getproperties(String key) throws IOException {
		return p.getProperty(key);
	}

}
