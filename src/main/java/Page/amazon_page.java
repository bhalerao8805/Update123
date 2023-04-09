package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class amazon_page {
	
	@FindBy(how=How.XPATH,using="//div[@class='nav-line-1-container']")
	private WebElement singin_text;
	
	@FindBy(how=How.XPATH,using="//span[contains(.='Sign in')]")
	private WebElement signin_button;
	
	@FindBy(how=How.XPATH,using="//input[@type='email']")
	private WebElement Username_text 	;
	
	@FindBy(how=How.XPATH,using="//input[@id='continue']")
	private WebElement signin_continue_btn;
	
	@FindBy(how=How.XPATH,using="//input[@type='password']")
	private WebElement password_text;
	
	@FindBy(how=How.XPATH,using="//input[@id='signInSubmit']")
	private WebElement password_continue_btn;
	
	


}
