package code_bindings;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClearTheCartSteps {
	
	@Given("^as a customer$")
	public void as_a_customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    assertTrue(true);
	}

	@When("^I clear my cart$")
	public void i_clear_my_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(true);
	}

	@Then("^Nothing is left in the cart$")
	public void nothing_is_left_in_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(true);
	}

}
