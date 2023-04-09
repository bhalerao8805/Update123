package TestNG;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import Page.linkonUpdate;

import Page.loginPomm;
import Page.updatePom;
import Utility.BaseClass;
import Utility.Lab;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 extends BaseClass {

	
	public void update() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions tp = new ChromeOptions();
		tp.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(tp);

		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		loginPomm pune = PageFactory.initElements(driver, loginPomm.class);
		pune.getUsername().sendKeys("bhaleraosaurabh1114@gmail.com");
		pune.getPass().sendKeys("Saurabh@77748");
		pune.getLogin_button().click();

		linkonUpdate up = PageFactory.initElements(driver, linkonUpdate.class);

		up.getProfileicon().click();
		Lab.cst_movetoelement(driver, up.getUpdatetext()); 	
		up.getUpdatetext().click();
		

		driver.navigate().to("https://www.naukri.com/mnjuser/profile");

		// NAukari Update Page

		updatePom ss = PageFactory.initElements(driver, updatePom.class);
		 try {
			 ss.getPersonaldetails_edit().click();
			 
			 driver.findElement(By.xpath("//input[@id='pd-hometown']")).clear();
			 driver.findElement(By.xpath("//input[@id='pd-hometown']")).sendKeys("Hingoli");
			 ss.getPersonaldetails_submit().click();
		 }catch(Exception e) {
			 System.out.println("personal ec=xception");
		 }

		 
		driver.close();
	}

}
