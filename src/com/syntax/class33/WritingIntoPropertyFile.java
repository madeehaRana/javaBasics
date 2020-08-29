package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingIntoPropertyFile {
	//writting into existing file
	public static void main(String[] args) throws IOException {
	String file ="Configs/Example.properties";
	
	FileInputStream fis = new FileInputStream(file);
	
	Properties p = new Properties();
	
	p.load(fis);
	
	p.setProperty("street", "New Brook Drive");
	String newFile= "Configs/NewFile.properties";
	FileOutputStream fos = new FileOutputStream(newFile);
	p.store(fos, "Adding additioanl Key");
	
	
	}

}
