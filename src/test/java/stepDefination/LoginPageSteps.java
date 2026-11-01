package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.Log;

public class LoginPageSteps {
	
	LoginPage hp = new LoginPage();

	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {
	 Log.info("User log in sucessFully");
	 hp.VerifyUserNavigateToLoginPage();
	    
	}

	
                      
	
     @Then ("Title match Login page")
	public void Title_match_Login_page() {
    	 
    	 hp.verifyTitle();
		
	}
	
     @Given("user enterd valid emailid")
 	public void user_enterd_valid_emailid()	{
 		
 	} 
 	

     @And("user enterd valid password")
 	public void user_enterd_valid_password()	{
 		
     }

}
