package Utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class Lab {
	//----------Sendkey------------
	public static void cst_sendkey( WebElement ele,String value) {
		try {
			ele.sendKeys(value);
		}catch(Exception e) {
			System.out.println("Sendkey error::"+e);
		}
	}
	
	//------------click-------------
	public static void cst_click(WebElement ele) {
		try{
			ele.click();
		}catch(Exception e)
	{
		System.out.println("clcik error:::"+e);
	}}
	
	//------------ScreenShot--------------
	public static  void screenshot(WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("");
		FileUtils.copyFile(src, dest);
		
	}
	
	
	//---------------Alert-------------
	
	public static void cst_alert(WebDriver driver) {
		driver.switchTo().alert();
	}
	
	//============ACtion Class===========
	
	public static  void cut_contextclick(WebDriver driver,WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).build().perform();
		
	}
	public static void cst_doubleclick(WebDriver driver,WebElement ele) {
		Actions act = new Actions(driver);
		
		act.doubleClick(ele).build().perform();
		
		
	}
	public static void cst_movetoelement(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
	}
	
	//-------------Scroll Down-----------
	
	public static void cst_Scrolldown(WebDriver driver ,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argumrnts.scrollintoView();", ele);
	}


//---------Xcel reader-------

public static  String xcel_reader(String sheet,int row,int cell) throws Exception {
	String path = "C:\\Users\\Deshm\\OneDrive\\Desktop\\New folder (2)\\eclipse\\Naukari\\Naukari.com\\Test data\\datacase.xlsx";
	FileInputStream fis = new FileInputStream(path);
	XSSFWorkbook as = new XSSFWorkbook(fis);
	String data=as.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
//	as.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	
	
}
}