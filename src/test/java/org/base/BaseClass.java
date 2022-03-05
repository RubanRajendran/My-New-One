package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void browser(String browser) {
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browser.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			driver.manage().window().maximize();
		}

	}

	public static void lanchUrl(String url) {
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

	public static String title() {
		return driver.getTitle();
	}
	
	public static String urlget() {
		return driver.getCurrentUrl();
	}
	
	public static void entertext(WebElement e, String text) {
		e.sendKeys(text);
	}

	public static void clickbutton(WebElement e) {
		e.click();
	}

	public static void end() {
		driver.close();
	}

	public static void moveAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static void dclick() {
		Actions a = new Actions(driver);
		a.doubleClick();
	}

	public static void mouse(WebElement e) throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static String getText(WebElement e) {
		String text = e.getText();
		System.out.println(text);
		return text;
		
	}
	
	public static String enterTextValue(WebElement e) {
		return e.getAttribute("value");
	}
	
	public static void textclear(WebElement e) {
		e.clear();
	}
	
//	public static String dataRead(int row,int cell) throws IOException {
//		File fi=new  File("C:\\Users\\ruban\\eclipse-workspace\\JUnitNewProject\\src\\test\\resources\\DataRead\\Data.xlsx");
//		
//		FileInputStream  input =new FileInputStream(fi);
//		
//		Workbook  book=new XSSFWorkbook(input);
//		Sheet sheet = book.getSheet("Facebook ID");
//		Row ro = sheet.getRow(row);
//		Cell cel = ro.getCell(cell);
//		return cel.getStringCellValue();
//	}
	
//	public static  Cell datawrite(int rowsLocation,int cellLocation,String enterValue) throws IOException  {
//
//		File  fi=new File("C:\\Users\\ruban\\eclipse-workspace\\JUnitNewProject\\src\\test\\resources\\DataWrite\\Sample.xlsx");
//		
//		FileInputStream ifs=new FileInputStream(fi);
//		
//		Workbook wBook=new XSSFWorkbook(ifs);
//		
//		Sheet sheet = wBook.getSheet("Test Result");
//		Row row = sheet.getRow(rowsLocation);
//		Cell cell = row.createCell(cellLocation);
//		cell.setCellValue(enterValue);
//		FileOutputStream ifss=new FileOutputStream(fi);
//		wBook.write(ifss);
//		return cell;
//	}
	
	



}
