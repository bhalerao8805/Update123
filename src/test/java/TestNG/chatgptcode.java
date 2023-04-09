package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class chatgptcode {

	
	    public static void main(String[] args) {
	        // Set up the WebDriver for Chrome
//	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//	      
	        WebDriverManager.chromedriver().setup();
	        ChromeOptions co = new ChromeOptions();
	    	co.addArguments("--remote-allow-origins=*");
//	    	WebDriver driver = ChromeDriver(co);
	    	ChromeDriver driver = new ChromeDriver(co);
	        
	        // Navigate to the Naukri website
	        driver.get("https://www.naukri.com/");
	        
	        // Locate the Login Button and click on it
	        WebElement loginButton = driver.findElement(By.className("login"));
	        loginButton.click();
	        
	        // Enter your Email/Username and Password and click on the Login Button
	        WebElement emailInput = driver.findElement(By.id("usernameField"));
	        emailInput.sendKeys("your-email-address");
	        WebElement passwordInput = driver.findElement(By.id("passwordField"));
	        passwordInput.sendKeys("your-password");
	        WebElement loginFormButton = driver.findElement(By.className("loginButton"));
	        loginFormButton.click();
	        
	        // Navigate to the Profile tab and click on the Edit Button
	        WebElement profileTab = driver.findElement(By.xpath("//a[@title='Profile']"));
	        profileTab.click();
	        WebElement editButton = driver.findElement(By.xpath("//div[@class='section right']/button"));
	        editButton.click();
	        
	        // Update your Profile information
	        WebElement firstNameInput = driver.findElement(By.name("firstName"));
	        firstNameInput.clear();
	        firstNameInput.sendKeys("Your First Name");
	        // Similarly, update all other input fields as required
	        
	        // Click on the Save button to save the updated profile
	        WebElement saveButton = driver.findElement(By.xpath("//div[@class='w-100']/button"));
	        saveButton.click();
	        
	        // Close the WebDriver
	        driver.close();
	    }
	}
}
