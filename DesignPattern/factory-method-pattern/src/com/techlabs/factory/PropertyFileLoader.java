package com.techlabs.factory;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileLoader {
	
	static Properties p;
	
	public PropertyFileLoader() throws IOException {
		p = new Properties();
		FileReader reader = new FileReader("Resources/factory.properties");
		p.load(reader);
	}
	
	public String getproperties() throws IOException {
		return p.getProperty("factory");
	}
	
}
