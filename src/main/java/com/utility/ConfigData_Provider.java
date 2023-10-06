package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigData_Provider {
	Properties pro;
	public ConfigData_Provider() throws Exception {
		
		String path="C:\\Users\\prakashjadav\\eclipse-workspace\\PB_E2E2\\Config\\Config.properties";
		FileInputStream fis=new FileInputStream(path);
		 pro=new Properties();
		pro.load(fis);
		
	}
	public String get_url1() {
		return pro.getProperty("url1");
	}
	
	public String get_url2() {
		
		return pro.getProperty("url2");
	}

}
