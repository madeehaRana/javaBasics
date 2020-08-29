package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class HW {
public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) throws IOException, InterruptedException {
	/*Manually create a file to store username and password
	 *Using Java add 2 more lines for username and password 
	 *Save code in the same file	
	 */
		String xFilePath=System.getProperty("user.dir")+"/testdata/MyFile.xlsx";
		
		FileInputStream fis = new FileInputStream(xFilePath);
		
		Workbook wb =new XSSFWorkbook(fis);
		Sheet sheet= wb.getSheet("Sample");
		//sheet.createRow(6).createCell(0).setCellValue("Mohammad");
	 	//sheet.getRow(6).createCell(1).setCellValue("Mohammad123");
	 	//sheet.createRow(7).createCell(0).setCellValue("Murodzhon");
	 	//sheet.getRow(7).createCell(1).setCellValue("Murodzhon123");
	 	
	 	//FileOutputStream fos = new FileOutputStream(xFilePath);
	 	//wb.write(fos);
		int rows =sheet.getPhysicalNumberOfRows();
		int cols =sheet.getRow(0).getPhysicalNumberOfCells();
		
		List<Map<String,String>> excelList = new ArrayList<>();
		
		for(int r=1; r<rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for(int c=0; c<cols;c++) {
				String key =sheet.getRow(r).getCell(0).toString();
				String value =sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			excelList.add(map);
			
		}
		System.out.println(excelList);
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		for(Map<String,String> newMap : excelList) {
			Set<String> usernames = newMap.keySet();
			for(String username:usernames) {
				String password = newMap.get(username);
				
			WebElement user=driver.findElement(By.id("txtUsername"));
			user.sendKeys(username);
			Thread.sleep(2000);
			WebElement pass =driver.findElement(By.id("txtPassword"));
			pass.sendKeys(password);
			Thread.sleep(2000);
			
			WebElement login =driver.findElement(By.id("btnLogin"));
			login.click();
			
			WebElement welcome =driver.findElement(By.id("welcome"));
			Thread.sleep(2000);
			
			String text =welcome.getText();
			System.out.println(text);
			Thread.sleep(2000);
			welcome.click();
			
			WebElement logOut =driver.findElement(By.xpath("//a[@href='/humanresources/symfony/web/index.php/auth/logout']"));
			Thread.sleep(3000);
			logOut.click();
		
			
			}
		}
		
	}

}
