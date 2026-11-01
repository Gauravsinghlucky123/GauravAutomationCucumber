package pages;

import org.openqa.selenium.By;

import helper.BaseTest;
import utils.Log;

public class LoginPage extends BaseTest {

	
	
	
	
	
	public void VerifyUserNavigateToLoginPage() {
		String ExpectedUrl = "https://v-scooter.vercel.app/login";
		String currenturl = driver.getCurrentUrl(); 
		System.out.println(currenturl);
		if(ExpectedUrl.equals(currenturl)) {
		Log.info(currenturl + " = Current Url of the application");
		Log.info(ExpectedUrl + " = Expected Url of the Application");
		Log.info("Test Will be Pass Expected and actual are equal");
		clickOnElement(clickingAcceptCoockie);
		
		}else {
		Log.error("Test fail both are not equal");
		}
	}
	
	By clickingAcceptCoockie= By.xpath("//button[@class='px-4 py-2 text-sm font-medium text-white bg-blue-600 hover:bg-blue-700 rounded-lg transition-colors']");
	public void verifyTitle() {
		
		String ExpectedTitle = "Vscooter - Electric Scooters";
		String actualtitle = getTitleByText();

		
    if(ExpectedTitle.equals(actualtitle)) {
			
    	Log.info("Actual title of Application is = "+actualtitle);
    	Log.info("Expected title of Application is ="+ExpectedTitle);
			Log.info(" Both Are Equal And Test Pass");
			
			
		}else {
			
			Log.error("Test Fail");
		}
		
		
		
	}
	
	
	
	
}
