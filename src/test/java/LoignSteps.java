package test.java;

import org.junit.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import main.java.Login;
import main.java.LoginBusiness;

public class LoignSteps {
	Login login = new Login();
	String actionButton;
	@Given("^I have enetered \"([^\"]*)\" as username and password is \"([^\"]*)\"$")
	public void Inputdata(String userName, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		login.setUserName(userName);
		login.setPassword(password);
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String buttonName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		actionButton = buttonName;
	}

	@Test
	@Then("^System display message \"([^\"]*)\" on \"([^\"]*)\" page$")
	public void system_display_message_on_page(String message, String pageName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		LoginBusiness loginBusiness = new LoginBusiness();
		Assert.assertEquals(message, loginBusiness.Validate(login));
	}

	@Then("^System display message do nothing and clear all data$")
	public void system_display_message_do_nothing_and_clear_all_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		if(actionButton.equals("Cancel"))
			login = null;
		//Assert.assertTrue(login.);
	}

}
