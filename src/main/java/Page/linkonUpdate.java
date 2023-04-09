package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class linkonUpdate {
	
//	@FindBy(how=How.XPATH, using="")
//	private WebElement :
	
	@FindBy(how=How.XPATH, using="//img[@alt='naukri user profile img']")
	private WebElement profileicon;
	

	@FindBy(how=How.XPATH, using="//a[@class='nI-gNb-info__sub-link']")
	private WebElement updatetext;
	
	
	///--------getter Method----------


	public WebElement getProfileicon() {
		return profileicon;
	}


	public WebElement getUpdatetext() {
		return updatetext;
	}
	
	//button[contains(text(),'SAVE')][2]
	//button[@id='saveBasicDetailsBtn']
	///a[contains(text(),'View')][1]|
	
	


}
