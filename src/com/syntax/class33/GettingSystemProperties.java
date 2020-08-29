package com.syntax.class33;

public class GettingSystemProperties {

	public static void main(String[] args) {
		///Users/madeeharizwan/eclipse-workspace/javaBasics/Configs/Example.properties
		String username = System.getProperty("user.name");
		System.out.println(username);
		
		String os= System.getProperty("os.name");
		System.out.println(os);
		
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		
		String filePath= System.getProperty("user.dir")+"/Configs/Example.properties";
		System.out.println(filePath);
	}

}
