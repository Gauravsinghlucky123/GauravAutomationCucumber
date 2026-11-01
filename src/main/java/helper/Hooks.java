package helper;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.MediaEntityBuilder;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ExtentManager;
import utils.ExtentTestManager;

public class Hooks extends BaseTest{

	@Before
	public void beforeScenario(Scenario scenario) {

	    String scenarioName = scenario.getName();

	    if (scenarioName == null || scenarioName.trim().isEmpty()) {
	        scenarioName = "Unnamed Scenario";
	    }

	    ExtentTestManager.startTest(scenarioName);
	    setUp();
	}


	@After
	public void afterScenario(Scenario scenario) {

	    try {
	        if (driver != null) {

	            String screenshot =
	                    ((TakesScreenshot) driver)
	                            .getScreenshotAs(OutputType.BASE64);

	            if (scenario.isFailed()) {
	                ExtentTestManager.getTest().fail(
	                        "Scenario Failed",
	                        MediaEntityBuilder
	                                .createScreenCaptureFromBase64String(screenshot)
	                                .build()
	                );
	            } else {
	                ExtentTestManager.getTest().pass(
	                        "Scenario Passed",
	                        MediaEntityBuilder
	                                .createScreenCaptureFromBase64String(screenshot)
	                                .build()
	                );
	            }
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {

	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

	
	@AfterAll
	public static void afterall() {
	    ExtentManager.getReporter().flush();
	}

	

}