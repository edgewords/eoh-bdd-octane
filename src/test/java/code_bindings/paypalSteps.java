package code_bindings;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class paypalSteps {
	
	@Given("^That I have some items in my basket$")
	public void that_I_have_some_items_in_my_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(true);
	}

	@When("^I checkout$")
	public void i_checkout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 assertTrue(true);
	}

	@Then("^I get the options to use Paypal$")
	public void i_get_the_options_to_use_Paypal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 assertTrue(true);
	}

}
