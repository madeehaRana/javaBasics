package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
public static void main(String [] args) throws IOException {
	String xlFilePath = System.getProperty("user.dir")+"/testdata/task1.xlsx";
	
	FileInputStream fis = new FileInputStream(xlFilePath);
	
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sample");
		
		sheet.createRow(2).createCell(0).setCellValue("Brian");
		sheet.getRow(2).createCell(1).setCellValue("Brian123");
		
		sheet.createRow(3).createCell(0).setCellValue("Mark");
		sheet.getRow(3).createCell(1).setCellValue("Mark123");
		
		FileOutputStream fos = new FileOutputStream(xlFilePath);
		
		
		book.write(fos);
		
		
		}
}

