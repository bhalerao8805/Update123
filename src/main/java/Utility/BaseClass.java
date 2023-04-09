package Utility;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static ChromeDriver driver ;
	@BeforeMethod
	public  void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		
	}
	
	@AfterMethod 
	public void teardown() {
		driver.quit();
	}
}
