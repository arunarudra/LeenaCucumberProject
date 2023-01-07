package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefs.BaseClass;

public class CheckerToolObjects {
	WebDriver driver=BaseClass.driver;
	
	@FindBy(id = "radio-england")
	WebElement countryradiobtn;
	
	@FindBy(id = "next-button")
	WebElement nxtbtn;
	
	@FindBy(id = "radio-yes")
	WebElement Gppract;
	
	public CheckerToolObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectPrefs() throws Exception {
		
		countryradiobtn.click();
		Thread.sleep(2000);
		nxtbtn.click();
		Gppract.click();
		nxtbtn.click();
		
	}
	

}
