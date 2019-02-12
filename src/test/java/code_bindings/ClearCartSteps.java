package code_bindings;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClearCartSteps {
	
	@Given("^That I have an item in the shopping cart$")
	public void that_I_have_an_item_in_the_shopping_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(true);
	}

	@When("^I clear my Cart$")
	public void i_clear_my_Cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(true);
	}

	@Then("^No items are left in the Cart$")
	public void no_items_are_left_in_the_Cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(false);
	}

}
