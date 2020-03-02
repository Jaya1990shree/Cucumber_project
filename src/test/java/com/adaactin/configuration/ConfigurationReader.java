package com.adaactin.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p1;
	
	public ConfigurationReader() throws Throwable {
		
		File f=new File("C:\\Users\\prath\\eclipse-workspace\\Cucumberproject1\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p1=new Properties();
		p1.load(fis);
		
	}

	public String getBrowser() {
		
		String browsername = p1.getProperty("browser");
		return browsername;
	}
	
	public String getUrl() {
		String url1 = p1.getProperty("url");
		return url1;
	}
}
