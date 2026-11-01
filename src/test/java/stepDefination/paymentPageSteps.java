package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class paymentPageSteps {

	@Given("user lanch site Url")
	public void user_lanch_site_url() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

	@When("user navigate to payment page")
	public void user_navigate_to_payment_page() {
 System.out.println("user navigate to the page");
	}

	@When("user enterd valid payment")
	public void user_enterd_valid_payment() {

	
   System.out.println("entered valid credentials");

	}

	@When("user enterd valid amount")
	public void user_enterd_valid_amount() {

		System.out.println("entered rupya");
	}

	@When("user entered valid passcode")
	public void user_entered_valid_passcode() {
		
		System.out.println("enterred password");

	}

	@Then("payment has been transfered Succesfully")
	public void payment_has_been_transfered_succesfully() {
		
		System.out.println("transferd Successfully");

	}

}
