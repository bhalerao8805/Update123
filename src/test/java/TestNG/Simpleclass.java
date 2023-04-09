package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import Page.linkonUpdate;
import Page.updatePom;
import Utility.Lab;
import Page.loginPomm;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simpleclass {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions tp = new ChromeOptions();
		tp.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(tp);

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
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//input[@trackparams='{\"id\":\"designationSugg\",\"sourceId\":\"\",\"platform\":\"\",\"appId\":\"105\",\"trackingSrc\":\"\"}']"))
					.sendKeys("Software Tester");

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
			// driver.findElement(By.xpath("//label[@for='flexible_shift']")).click();
			ss.getCareerProfile_submit().click();
			// ss.getCareerProfile_submit().click();
			System.out.println("carrer succesfully");

		} catch (Exception e) {
			System.out.println("carrer exception");
		}

		try {
			Lab.cst_movetoelement(driver, ss.getKeyskill_edit());
			Thread.sleep(2000);
			Lab.cst_click(ss.getKeyskill_edit());

			Lab.cst_movetoelement(driver, driver.findElement(By.xpath("//div[@class='chipsContainer']")));
			Thread.sleep(2000);
			Lab.cst_click(ss.getKeyskill_submit());
			System.out.println("key skill successfull");

		} catch (Exception e) {
			System.out.println("key skill exception");
		}
//savePersonalDetailsBtn

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

		try {
			// ------NOT GET SUBMIT BTN
			ss.getBasicdetails_edit().click();
			driver.findElement(By.xpath("//input[@id='name']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Saurabh Bhalerao");
			ss.getBasic_submit().click();

			System.out.println("successfull basic details");

		} catch (Exception e) {
			System.out.println("Basic exception");
		}
		try {
			ss.getPersonaldetails_edit().click();

			driver.findElement(By.xpath("//input[@id='pd-hometown']")).clear();
			driver.findElement(By.xpath("//input[@id='pd-hometown']")).sendKeys("Hingoli");
			Lab.cst_Scrolldown(driver, driver.findElement(By.xpath("//a[@id='add-new-language']")));
			Lab.cst_click(ss.getPersonaldetails_submit());

		} catch (Exception e) {
			System.out.println("personal ec=xception");
		}
		System.out.println("All Done");
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("not any issue");

//	driver.findElement(By.xpath("(//img[@alt='Naukri Logo'])[1]")).click();
//}
			try {
				up.getProfileicon().click();

			} catch (Exception e1) {
				driver.findElement(By.xpath("//div[@class='nI-gNb-drawer']")).click();
				System.out.println(e1);

			}

			driver.findElement(By.xpath("//a[@data-type='logoutLink']")).click();

			driver.quit();

		}
	}
}