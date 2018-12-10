package code_bindings;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

# Adding a debugging comment here
public class add_items_to_cart_steps {
	
	WebDriver driver;
	
	@Given("^That I am on the Home Page$")
	public void that_I_am_on_the_Home_Page() throws Throwable {
		String browser = System.getProperty("browser");
	    System.out.println("Browser passed through is : " + browser);
	    if (browser.equalsIgnoreCase("chrome")) {
	    	driver = new ChromeDriver(); //instantiate a browser
	    }
	    else {
	    	driver = new FirefoxDriver();
	    }
		driver.get("https://www.edgewordstraining.co.uk/demo-site/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Dismiss")).click();
	}

	@When("^I search for a Cap and add it to the Cart$")
	public void i_search_for_a_Cap_and_add_it_to_the_Cart() throws Throwable {
	    driver.findElement(By.id("woocommerce-product-search-field-0")).click();
	    driver.findElement(By.id("woocommerce-product-search-field-0")).clear();
	    driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("cap");
	    driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys(Keys.RETURN);
	    Thread.sleep(2000);
	    driver.findElement(By.name("add-to-cart")).click();
	}

	@Then("^I can see it in the Cart$")
	public void i_can_see_it_in_the_Cart() throws Throwable {
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		//check it is there
		assertTrue (driver.findElement(By.linkText("Cap")).isDisplayed());
	    driver.findElement(By.linkText("×")).click();
	    driver.findElement(By.linkText("Return to shop")).click();
	    driver.quit();
	}

}
