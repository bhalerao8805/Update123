package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public static ChromeDriver driver;


public class logout_code {
public static void logout_profile() {
	
	
	driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();

	driver.findElement(By.xpath("//a[@data-type='logoutLink']")).click();
	System.out.println("Sucessful logout");
}

}
