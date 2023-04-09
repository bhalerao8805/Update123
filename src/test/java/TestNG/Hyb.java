package TestNG;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import Page.linkonUpdate;
import Page.updatePom;
import Utility.Lab;
import Page.loginPomm;
import io.github.bonigarcia.wdm.WebDriverManager;




public class Hyb {
	public static void main(String[] args) throws Exception {
//		secound round
		 
 WebDriverManager.chromedriver().setup();
	ChromeOptions tp = new ChromeOptions();
	tp.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(tp);

	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/nlogin/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	loginPomm pune = PageFactory.initElements(driver, loginPomm.class);
	pune.getUsername().sendKeys(Lab.xcel_reader("Sheet1", 3, 0));
	pune.getPass().sendKeys(Lab.xcel_reader("Sheet1", 3, 1));
	pune.getLogin_button().click();

	linkonUpdate up = PageFactory.initElements(driver, linkonUpdate.class);

	up.getProfileicon().click();
	up.getUpdatetext().click();

	driver.navigate().to("https://www.naukri.com/mnjuser/profile");

	// NAukari Update Page

	updatePom ss = PageFactory.initElements(driver, updatePom.class);
	try {// ---errror------issue in the join date tab
ss.getEmployment_edit().click();
driver.findElement(By.xpath("//input[@trackparams='{\"id\":\"designationSugg\",\"sourceId\":\"\",\"platform\":\"\",\"appId\":\"105\",\"trackingSrc\":\"\"}']")).clear();
Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@trackparams='{\"id\":\"designationSugg\",\"sourceId\":\"\",\"platform\":\"\",\"appId\":\"105\",\"trackingSrc\":\"\"}']")).sendKeys("Software Tester");
		
		ss.getEmp_Submit().click();
		
	} catch (Exception e) {
		System.out.println("Employment exception");
	}
	
	try {
		ss.getResumeHeadline_edit();
		ss.getResumeheadlin_submit();
		System.out.println("resumeheadline successfull");
	} catch (Exception e) {
		System.out.println("new exception");
	}
	
	
	
	
	try {// -----------issue in submit button find
		ss.getCarrerprofile_edit().click();
		driver.findElement(By.id("fareaDroopeFor")).clear();
		driver.findElement(By.id("fareaDroopeFor")).sendKeys("Engineering - Software & QA");
		//driver.findElement(By.xpath("//label[@for='flexible_shift']")).click();
		ss.getCareerProfile_submit().click();
		//ss.getCareerProfile_submit().click();
		System.out.println("carrer succesfully");

	} catch (Exception e) {
		System.out.println("carrer exception");
	}

	

	try {
		ss.getKeyskill_edit().click();
		ss.getKeyskill_submit().click();
		System.out.println("key skill successfull");

	} catch (Exception e) {
		System.out.println("key skill exception");
	}
//savePersonalDetailsBtn
	

	try {// -------stop at submit button
		ss.getProject_edit().click();
		
		driver.findElement(By.id("projectTitle")).clear();
		driver.findElement(By.id("projectTitle")).sendKeys("IWEB");	
		
		ss.getProject_submit().click();
		System.out.println("prjoect submited sucessfull");

	} catch (Exception e) {
		System.out.println("prjoect exception");
	}

	

	try {
		// ------NOT GET SUBMIT BTN
		ss.getBasicdetails_edit().click();
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("S S Bhalerao");
		ss.getBasic_submit().click();

		System.out.println("successfull basic details");

	} catch (Exception e) {
		System.out.println("Basic exception");
	}
try {
ss.getPersonaldetails_edit().click();

driver.findElement(By.xpath("//input[@id='pd-hometown']")).clear();
driver.findElement(By.xpath("//input[@id='pd-hometown']")).sendKeys("Hingoli");
ss.getPersonaldetails_submit().click();
}catch(Exception e) {
System.out.println("personal ec=xception");
}
System.out.println("All Done");
driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();

driver.findElement(By.xpath("//a[@data-type='logoutLink']")).click();


driver.quit();

	}

}
