package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pageobjects.CheckerToolObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import StepDefs.BaseClass;

public class CheckerTool {
	
	WebDriver driver=BaseClass.driver;
	CheckerToolObjects cto= new CheckerToolObjects();
	
	@Given("I am UK citizen and open checker tool")
	public void i_am_UK_citizen_and_open_checker_tool() {
	    driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
	}

	@When("I Accept the coockies")
	public void i_Accept_the_coockies() {
		WebElement cookies = driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics"));
		cookies.click();
	}

	@When("I click on Start button")
	public void i_click_on_Start_button() {
		WebElement startbtn = driver.findElement(By.id("next-button"));
		startbtn.click();
	}

	@When("I put my circumstances in the checker tool")
	public void i_put_my_circumstances_in_the_checker_tool() throws Exception {
		cto.selectPrefs();
	    
	}

	@Then("I should get the result of whether I will get help or not")
	public void i_should_get_the_result_of_whether_I_will_get_help_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
