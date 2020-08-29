package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {
	
	public static void main(String [] args) throws IOException {
		String filePath="Configs/Example.properties";
		///Users/madeeharizwan/eclipse-workspace/javaBasics/Configs/Example.properties
		//1. identify path to the file you would like to read
		
		//2. create an object of FileInputStream class
		
		FileInputStream fis = new FileInputStream(filePath);
		
		//3. to work with property file we use Properties class in Java
		Properties prop = new Properties();
		prop.load(fis);
		
		String val = prop.getProperty("username");
		System.out.println(val);
		
		String val1= prop.getProperty("city");
		System.out.println(val1);
		
		String password =  prop.getProperty("password");
		System.out.println(password);
		
		String address= prop.getProperty("address");
		System.out.println(address);
		
	}

}
