package com.syntax.class26;

public class FileTest {
	public static void main(String [] args) {
		File f = new PdfFile();
		System.out.println("--------PDF File--------");
		f.close();
		f.open();
		f.edit();
		
		File w = new WordFile();
		System.out.println("--------WordFile File--------");
		w.close();
		w.open();
		w.edit();
		
		File j = new JavaFile();
		System.out.println("--------JavaFile File--------");
		j.close();
		j.open();
		j.edit();
	}
}
