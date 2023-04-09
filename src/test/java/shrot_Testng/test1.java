package shrot_Testng;

import java.sql.Date;
import java.time.Duration;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Page.linkonUpdate;
import Page.loginPomm;
import Page.updatePom;
import Utility.Lab;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	@Test
	public void shalan() throws Exception {

		 WebDriverManager.chromedriver().setup();
//			ChromeOptions tp = new ChromeOptions();
//			tp.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver();

			
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/nlogin/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

			loginPomm pune = PageFactory.initElements(driver, loginPomm.class);
			pune.getUsername().sendKeys(Lab.xcel_reader("Sheet1", 5, 0));
			pune.getPass().sendKeys(Lab.xcel_reader("Sheet1", 5, 1));
			pune.getLogin_button().click();

			linkonUpdate up = PageFactory.initElements(driver, linkonUpdate.class);

			up.getProfileicon().click();
			up.getUpdatetext().click();

			driver.navigate().to("https://www.naukri.com/mnjuser/profile");

			// NAukari Update Page

			updatePom ss = PageFactory.initElements(driver, updatePom.class);
			try {// ---er ror------issue in the join date tab
		ss.getEmployment_edit().click();
		driver.findElement(By.xpath("//input[@trackparams='{\"id\":\"designationSugg\",\"sourceId\":\"\",\"platform\":\"\",\"appId\":\"105\",\"trackingSrc\":\"\"}']")).clear();
		Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@trackparams='{\"id\":\"designationSugg\",\"sourceId\":\"\",\"platform\":\"\",\"appId\":\"105\",\"trackingSrc\":\"\"}']")).sendKeys("Full Stack Developer");
				
				ss.getEmp_Submit().click();
				
			} catch (Exception e) {
				System.out.println("Employment exception");
			}
			
			try {
				Lab.cst_click(driver.findElement(By.xpath("(//span[@class='edit icon'])[1]")));
				ss.getResumeHeadline_edit();
				ss.getResumeheadlin_submit();
				System.out.println("resumeheadline successfull");   //check
			} catch (Exception e) {
				System.out.println("new exception");
			}
			
			
			
			
			try {// -----------issue in submit button find
				driver.findElement(By.xpath("(//span[@class='edit icon'])[7]")).click();
				driver.findElement(By.id("fareaDroopeFor")).clear();
				driver.findElement(By.id("fareaDroopeFor")).sendKeys("Engineering - Software & QA");
				//driver.findElement(By.xpath("//label[@for='flexible_shift']")).click();
				ss.getCareerProfile_submit().click();
				//ss.getCareerProfile_submit().click();
				System.out.println("carrer succesfully");      //check

			} catch (Exception e) {
				System.out.println("carrer exception");
			}

			

			try {
				driver.findElement(By.xpath("(//span[@class='edit icon'])[2]")).click();
				ss.getKeyskill_submit().click();
				System.out.println("key skill successfull");       //check

			} catch (Exception e) {
				System.out.println("key skill exception");
			}
		//savePersonalDetailsBtn
			

			
			

			try {
				// ------NOT GET SUBMIT BTN
				ss.getBasicdetails_edit().click();
				driver.findElement(By.xpath("//input[@id='name']")).clear();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Shalini Deshmukh");
				ss.getBasic_submit().click();   ///check

				System.out.println("successfull basic details");

			} catch (Exception e) {
				System.out.println("Basic exception");
			}
		try {
		ss.getPersonaldetails_edit().click();
		System.out.println(ss.getHometoun().getText());
		ss.getPersonaldetails_submit().click();   //check
		}catch(Exception e) {
		System.out.println("personal ec=xception");
		}
		System.out.println("All Done");
		
		try {
			driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();

			driver.findElement(By.xpath("//a[@data-type='logoutLink']")).click();
		} catch (Exception e) {
			System.out.println("Not Logout ");
		}
		


		driver.quit();
		System.out.println("Success browser close Shalan");
	}
	
	@Test
	public void Hyd() throws Exception {
		 WebDriverManager.chromedriver().setup();
//			ChromeOptions tp = new ChromeOptions();
//			tp.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver();

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
		try {
			driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();

			driver.findElement(By.xpath("//a[@data-type='logoutLink']")).click();
			System.out.println("Sucessful logout");
		} catch (Exception e) {
			System.out.println("Not Logout ");
		}
		
//		WebElement dim= driver.findElement(By.xpath("(//img[@src='https://static.naukimg.com/s/4/100/i/naukri_Logo.png'  or @alt='Naukri Logo'])[1]")).getSize();
//		int Height = dim.height;
//		int Width = (() dim).width();
//		/

		driver.quit();
		System.out.println("Success browser closehyb");
		
		
		try {
			String str = "2023-04-01";
			Date date = Date.valueOf(str);
			System.out.println(date);
		}catch(Exception e) {
			System.out.println("Date Exception");
		}

		driver.quit();
		System.out.println("Success browser closePune1");
	}
	
	@Test
	public void Pune1() throws Exception {
		 WebDriverManager.chromedriver().setup();
//			ChromeOptions tp = new ChromeOptions();
//			tp.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/nlogin/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		loginPomm pune = PageFactory.initElements(driver, loginPomm.class);
		pune.getUsername().sendKeys(Lab.xcel_reader("Sheet1", 4, 0));
		pune.getPass().sendKeys(Lab.xcel_reader("Sheet1", 4, 1));
		pune.getLogin_button().click();

		linkonUpdate up = PageFactory.initElements(driver, linkonUpdate.class);

		up.getProfileicon().click();
		up.getUpdatetext().click();

		driver.navigate().to("https://www.naukri.com/mnjuser/profile");

		// NAukari Update Page

		updatePom ss = PageFactory.initElements(driver, updatePom.class);
		try {// ---errror------issue in the join date tab
			ss.getEmployment_edit().click();
			driver.findElement(By.xpath(
					"//input[@trackparams='{\"id\":\"designationSugg\",\"sourceId\":\"\",\"platform\":\"\",\"appId\":\"105\",\"trackingSrc\":\"\"}']"))
					.clear();
	 		Thread.sleep(1000);
			driver.findElement(By.xpath(
					"//input[@trackparams='{\"id\":\"designationSugg\",\"sourceId\":\"\",\"platform\":\"\",\"appId\":\"105\",\"trackingSrc\":\"\"}']"))
					.sendKeys("Software Tester");

			ss.getEmp_Submit().click();

		} catch (Exception e) {
			System.out.println("Employment exception");
		}
		
		Thread.sleep(2000);

		try {
			ss.getResumeHeadline_edit();
			ss.getResumeheadlin_submit();
			System.out.println("resumeheadline successfull");
		} catch (Exception e) {
			System.out.println("new exception");
		}
		Thread.sleep(2000);

		try {// -----------issue in submit button find
			ss.getCarrerprofile_edit().click();
			WebElement s1=driver.findElement(By.id("fareaDroopeFor"));
			System.out.println(s1.getText());
//			Lab.cst_movetoelement(driver, driver.findElement(By.id("fareaDroopeFor")));
			// driver.findElement(By.xpath("//label[@for='flexible_shift']")).click();
			ss.getCareerProfile_submit().click();
			// ss.getCareerProfile_submit().click();
			System.out.println("carrer succesfully");

		} catch (Exception e) {
			System.out.println("carrer exception");
		}
		Thread.sleep(1000);

		try {
			Lab.cst_movetoelement(driver, ss.getKeyskill_edit());
			Thread.sleep(2000);
			System.out.println(ss.getExitcareertab().getText());
			
			Lab.cst_click(ss.getKeyskill_submit());
			System.out.println("key skill successfull");

		} catch (Exception e) {
			System.out.println("key skill exception");
		}
		
		Thread.sleep(1000);
		
		try {// -------stop at submit button
			ss.getProject_edit().click();

			driver.findElement(By.id("projectTitle")).clear();
			driver.findElement(By.id("projectTitle")).sendKeys("IWEB");
			Thread.sleep(1000);
			Lab.cst_click(ss.getProject_submit());

			System.out.println("prjoect submited sucessfull");

		} catch (Exception e) {
			System.out.println("prjoect exception");
		}
		
		Thread.sleep(1000);

		try {
			// ------NOT GET SUBMIT BTN
			ss.getBasicdetails_edit().click();
			driver.findElement(By.xpath("//input[@id='name']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Saurabh Bhalerao");
			ss.getBasic_submit().click();

			System.out.println("successfull basic details");

		} catch (Exception e) {
			System.out.println("Basic exception");
		}
		
		Thread.sleep(1000);
		
		
		try {
			ss.getPersonaldetails_edit().click();

			driver.findElement(By.xpath("//input[@id='pd-hometown']")).clear();
			driver.findElement(By.xpath("//input[@id='pd-hometown']")).sendKeys("Hingoli");
			Lab.cst_click(ss.getPersonaldetails_submit());

		} catch (Exception e) {
			System.out.println("personal ecxception");
		}
		Thread.sleep(1000);
		
		

		try {
			driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();

			driver.findElement(By.xpath("//a[@data-type='logoutLink']")).click();
		} catch (Exception e) {
			System.out.println("Not Logout ");
		}
		


		driver.quit();
		System.out.println("Success browser closePune1");
	}

}
