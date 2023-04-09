package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Utility.Lab;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing_browser {
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		
//		driver.switchTo().alert().dismiss();
//		driver.findElement(By.xpath("//input[@ aria-label='Search' or @name='q' ]")).sendKeys("Saurabh");
		
		WebElement sa=driver.findElement(By.xpath("(//input[@value='Google Search' and @role='button'][@type='submit' or @class='gNO89b'])[2]"));
//		Actions ss = new Actions(driver);
		Lab.cst_movetoelement(driver, sa);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
