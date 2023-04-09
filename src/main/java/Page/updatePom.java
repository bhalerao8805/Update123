package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class updatePom {

	@FindBy(how = How.XPATH, using = "//em[@class='icon edit' or @text()='Edit' or @data-ga-track='spa-event|EditProfile|BasicDetails|EditOpen' ]")
	private WebElement Basicdetails_edit;

	@FindBy(how = How.XPATH, using = "(//span[@class='edit icon'])[1]")
	private WebElement resumeHeadline_edit;

	@FindBy(how = How.XPATH, using = "(//span[@class='edit icon' or @text()='Edit'])[2]")
	private WebElement keyskill_edit;

	@FindBy(how = How.XPATH, using = "(//span[@class='edit icon'])[3]")
	private WebElement employment_edit;

	@FindBy(how = How.XPATH, using = "(//span[@class='edit icon'])[4]")
	private WebElement Project_edit;

	@FindBy(how = How.XPATH, using = "(//span[@class='edit icon'])[5]")
	private WebElement profilesummary_edit;

	@FindBy(how = How.XPATH, using = "(//span[@class='edit icon'])[6]")
	private WebElement carrerprofile_edit;

	@FindBy(how = How.XPATH, using = "//span[@class='icon edit']")
	private WebElement Personaldetails_edit;

	// ----SUBMIT BUTTON--------

	@FindBy(how = How.XPATH, using = "//button[@id='submitEmployment']")
	private WebElement Emp_Submit;

	@FindBy(how = How.XPATH, using = "//button[text()='SAVE']")
	private WebElement Basic_submit;

	@FindBy(how = How.XPATH, using = "(//button[@class='waves-effect waves-light btn-large blue-btn'])[2]")
	private WebElement Resumeheadlin_submit;

	@FindBy(how = How.XPATH, using = "//button[@id='saveKeySkills' or @type='button' or text()='Save']")
	private WebElement Keyskill_submit;

	@FindBy(how = How.XPATH, using = "//*[@id='submitProject' or type='button' or text()='Save' or class='waves-effect waves-light btn-large']")
	private WebElement Project_submit;

	@FindBy(how = How.XPATH, using = "//*[@id='saveDesiredProfile' or @text()='Save']")
	private WebElement CareerProfile_submit;

	@FindBy(how = How.XPATH, using = "//*[@id='savePersonalDetailsBtn']")
	private WebElement Personaldetails_submit;

	// ------------------
	
	@FindBy(how= How.XPATH,using="//input[@id='pd-hometown']")
	private WebElement hometoun;

	@FindBy(how = How.XPATH, using = "//*/div[@class='chipsContainer']")
	private WebElement Exitcareertab;

	// ----------------------getter Method-------------------------------------
	public WebElement getHometoun() {
		return hometoun;
	}
	
	public WebElement getExitcareertab() {
		return Exitcareertab;
	}

	public WebElement getPersonaldetails_edit() {
		return Personaldetails_edit;
	}

	public WebElement getBasicdetails_edit() {
		return Basicdetails_edit;
	}

	public WebElement getResumeHeadline_edit() {
		return resumeHeadline_edit;
	}

	public WebElement getKeyskill_edit() {
		return keyskill_edit;
	}

	public WebElement getEmployment_edit() {
		return employment_edit;
	}

	public WebElement getProject_edit() {
		return Project_edit;
	}

	public WebElement getProfilesummary_edit() {
		return profilesummary_edit;
	}

	public WebElement getCarrerprofile_edit() {
		return carrerprofile_edit;
	}

	public WebElement getEmp_Submit() {
		return Emp_Submit;
	}

	public WebElement getBasic_submit() {
		return Basic_submit;
	}

	public WebElement getKeyskill_submit() {
		return Keyskill_submit;
	}

	public WebElement getProject_submit() {
		return Project_submit;
	}

	public WebElement getCareerProfile_submit() {
		return CareerProfile_submit;
	}

	public WebElement getPersonaldetails_submit() {
		return Personaldetails_submit;
	}

	public WebElement getResumeheadlin_submit() {
		return Resumeheadlin_submit;
	}

//	@FindBy(how=How.XPATH, using="")
//	private WebElement :

//	@FindBy(how=How.XPATH,using="")
//	private WebElement emp_Submit;
//	
//	@FindBy(how=How.XPATH,using="")
//	private WebElement emp_Submit;
//	
//	@FindBy(how=How.XPATH,using="")
//	private WebElement emp_Submit;
//	
//	@FindBy(how=How.XPATH,using="")
//	private WebElement emp_Submit;
//	
//	@FindBy(how=How.XPATH,using="")
//	private WebElement emp_Submit;
//	
//	@FindBy(how=How.XPATH,using="")
//	private WebElement emp_Submit;
//	
//	@FindBy(how=How.XPATH,using="")
//	private WebElement emp_Submit;

}
