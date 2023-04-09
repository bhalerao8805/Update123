package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPomm {
	@FindBy(how=How.XPATH,using="//input[@id='usernameField']")
	private WebElement username;
	@FindBy(how=How.XPATH, using="//input[@type='password']")
	private WebElement pass;
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Login')]")
	private WebElement login_button ;
	
	
	//Setter metthod
	public WebElement getUsername() {
		
		return username;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin_button() {
		return login_button;
	}
	
}
