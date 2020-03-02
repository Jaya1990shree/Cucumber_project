package com.adaactin.configuration;

public class FileManagerReader {
	
	private FileManagerReader() {
		
	}
	
	public static FileManagerReader getFileReader() {
		FileManagerReader fr=new FileManagerReader();
		return fr;
	}
	
	public ConfigurationReader getConfig() throws Throwable {
		ConfigurationReader cr=new ConfigurationReader();
		return cr;
	}

}

