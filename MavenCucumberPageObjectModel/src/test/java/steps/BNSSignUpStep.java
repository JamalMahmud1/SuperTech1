package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BNSPage;

public class BNSSignUpStep extends AbstractClass {
	BNSPage bnsp=PageFactory.initElements(driver, BNSPage.class);
	
	@Given("User on BNS signup webpage")
	public void user_on_BNS_signup_webpage() {
	   driver.get("file:///C:/Users/chowd/Desktop/BNS.html");
	}

	@When("User enter {string} in firstname textbox, {string} in lastname textbox, {string} in email textbox,{string} in password textbox,{string} in phonenumber textbox")
	public void user_enter_in_firstname_textbox_in_lastname_textbox_in_email_textbox_in_password_textbox_in_phonenumber_textbox(String Fn, String Ln, String Em, String Pw, String Ph) {
	    bnsp.enterFirstName(Fn);
	    bnsp.enterLastName(Ln);
	    bnsp.enterEmail(Em);
	    bnsp.enterPassword(Pw);
	    bnsp.enterPhone(Ph);
	}

	@When("User select {string} from month dropdownbox , {string} from day dropdownbox, {string} from year dropdownbox")
	public void user_select_from_month_dropdownbox_from_day_dropdownbox_from_year_dropdownbox(String Mn, String Dy, String Yr) {
		bnsp.selectMonth(Mn);
		bnsp.selectDay(Dy);
		bnsp.selectYear(Yr);
	  
	}

	@When("User select  {string} from gender radio button")
	public void user_select_from_gender_radio_button() {
	    bnsp.clickOnMale();
	}
	   
	

	@When("User click on Submit button")
	public void user_click_on_Submit_button() throws InterruptedException {
	    bnsp.clickOnSubmit();
	    Thread.sleep(3000);
	}

	@Then("User should see meaasge {string}")
	public void user_should_see_meaasge(String message) throws InterruptedException {
		bnsp.verifyText(message);
		Thread.sleep(3000);

	}
}
