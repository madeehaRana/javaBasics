package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FacebookProperties {

	public static void main(String[] args) throws IOException {
		String filePath="Configs/Facebook.properties";
		
		FileInputStream fis= new FileInputStream(filePath);
		Properties prop = new Properties();
		
		prop.load(fis);
		
	String bro=	prop.getProperty("browser");
System.out.println(bro);
	}

}
