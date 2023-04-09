package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.linkonUpdate;
import Page.updatePom;


import Page.loginPomm;
import Utility.BaseClass;

public class masterrepo extends BaseClass{
	
	@Test
	public void puneprofile() {
		loginPomm pune = PageFactory.initElements(driver, loginPomm.class);
		pune.getUsername().sendKeys("bhaleraosaurabh1114@gmail.com");
		pune.getPass().sendKeys("Saurabh@77748");
		pune.getLogin_button().click();

		linkonUpdate up = PageFactory.initElements(driver, linkonUpdate.class);

		up.getProfileicon().click();
		up.getUpdatetext().click();

		driver.navigate().to("https://www.naukri.com/mnjuser/profile");

		// NAukari Update Page

		updatePom ss = PageFactory.initElements(driver, updatePom.class);
		
		
		try {
			ss.getResumeHeadline_edit();
			ss.getResumeheadlin_submit();
			System.out.println("resumeheadline successfull");
		} catch (Exception e) {
			System.out.println("new exception");
		}
		
		
		
		try {// -----------issue in submit button find
			ss.getCarrerprofile_edit().click();
			driver.findElement(By.id("saveDesiredProfile")).click();
			//ss.getCareerProfile_submit().click();
			System.out.println("carrer succesfully");

		} catch (Exception e) {
			ss.getExitcareertab().click();
			System.out.println("carrer exception");
		}

		

		try {
			ss.getKeyskill_edit().click();
			ss.getKeyskill_submit().click();
			System.out.println("key skill successfull");

		} catch (Exception e) {
			System.out.println("key skill exception");
		}
//savePersonalDetailsBtn
		

		try {// -------stop at submit button
			ss.getProject_edit().click();
			
			ss.getProject_submit().click();
			System.out.println("prjoect submited sucessfull");

		} catch (Exception e) {
			System.out.println("prjoect exception");
		}

		try {// ---errror------issue in the join date tab
			ss.getEmployment_edit().click();
			driver.switchTo().frame("employmentForm");
			ss.getEmp_Submit().click();
			ss.getEmp_Submit().click();
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println("Employment exception");
		}

		try {
			// ------NOT GET SUBMIT BTN

			ss.getBasicdetails_edit().click();
			ss.getBasic_submit().click();

			System.out.println("successfull basic details");

		} catch (Exception e) {
			System.out.println("Basic exception");
		}
 try {
	 ss.getPersonaldetails_edit().click();
	 ss.getPersonaldetails_submit().click();
 }catch(Exception e) {
	 System.out.println("personal ec=xception");
		
		
		
		
		
		
		
		
		
		
		
	
	}

}}
