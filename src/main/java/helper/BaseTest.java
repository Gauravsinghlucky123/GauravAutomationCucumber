package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Throw;
import utils.Log;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop;
	SoftAssert soft = new SoftAssert();

	static {

		try (FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/env.properties")) {

			prop = new Properties();
			prop.load(file);

		} catch (FileNotFoundException e) {
			System.out.println("env.properties file not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error loading properties file");
			e.printStackTrace();
		}
	}

	public void setUp() {
		String browserName = prop.getProperty("browser");
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.addArguments("--incognito");
			chromeoptions.addArguments("--disable-notifications");
			chromeoptions.addArguments("--start maximized");
			chromeoptions.addArguments("--disable-infobars");
			chromeoptions.addArguments("--disable-extensions");
			chromeoptions.addArguments("disable-gpu");
			chromeoptions.addArguments("no-sandbox");
			chromeoptions.addArguments("-certifate error");
			driver = new ChromeDriver(chromeoptions);
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeoptions = new EdgeOptions();
			edgeoptions.addArguments("--incognito");
			edgeoptions.addArguments("--disable-notifications");
			driver = new EdgeDriver(edgeoptions);
		default:
			throw new IllegalArgumentException("invalid browser");
		}

		driver.get(prop.getProperty("siteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(prop.getProperty("timeout"))));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Long.parseLong(prop.getProperty("timeout"))));

	}

	public void selectValueFromVisibleText(WebElement ele, String Text) {
		Select s = new Select(ele);
		s.selectByVisibleText(Text);
	}

	public WebElement waitForExpectedElement(By by) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));

	}

	public void clickOnElement(By by) {

		WebElement ele = waitForExpectedElement(by);

		try {
			ele.click();
		} catch (Exception e) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
		}
	}

	public void selectSingleValueFromDropDown(By by, String type, String value) {

		WebElement ele = waitForExpectedElement(by);
		Select s = new Select(ele);

		switch (type.toLowerCase()) {

		case "visibleText":

			s.selectByVisibleText(value);
			break;

		case "ByIndex":

			s.selectByIndex(Integer.parseInt(value));
			break;

		case "value":
			s.selectByValue(value);
			break;
		default:
			Throw IllegalReceiveException;

		}

	}

	public void clearAndEnterText(By by, String inputText) {

		WebElement ele = waitForExpectedElement(by);
		ele.clear();
		ele.sendKeys(inputText);
	}

	public void mouseHover(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	public void selectValueFromBootStrapDropdown(List<WebElement> list, String value) {

		for (WebElement ele : list) {
			String text = ele.getText();
			if (text.equals(value)) {

				ele.click();
				break;
			}
		}
	}

	public void switchToFrame(String id) {
		driver.switchTo().frame(id);
	}

	public void handleAlert(String action) {
		Alert a = driver.switchTo().alert();
		switch (action) {
		case "accept":
			a.accept();
			break;
		case "cancel":
			a.dismiss();
			break;
		}
	}

	public static String takeScreenShot(String ssName) {

		String projectPath = System.getProperty("user.dir");
		String folderPath = projectPath + File.separator + "ScreenShot";

		File folder = new File(folderPath);
		if (!folder.exists()) {
			folder.mkdirs();
		}

		String safeName = ssName.replaceAll("[^a-zA-Z0-9]", "_");
		String path = folderPath + File.separator + safeName + ".png";

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(path));
			Log.info("Screenshot saved at: " + path);
		} catch (Exception e) {
			Log.error("Screenshot capture failed: " + e.getMessage());
		}

		return path;
	}

	public WebElement waitForElement(WebElement ele, long timeout) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return w.until(ExpectedConditions.visibilityOf(ele));
	}

	public void switchWindow(String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			driver.switchTo().window(window);
			String actualTitle = driver.getTitle();
			if (actualTitle.contains(title)) {
				break;
			}

		}

	}

	/////////////////////////////////////// get Element From
	/////////////////////////////////////// Text///////////////////////////////////////////////
	public String getElementText(WebElement ele) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOf(ele));
		return ele.getText();
	}

	public void softAssert(Object actual, Object expected, String message) {
		soft.assertEquals(actual, expected, message);
		soft.assertAll();
	}

	public void hardAssertTrue(boolean condition, String message) {
		soft.assertTrue(condition, message);
	}

	public void hardAssertEqulesd(Object actual, Object expected, String message) {
		Assert.assertEquals(actual, expected, message);

	}

	public void softAssertTrue(boolean condition, String message) {
		Assert.assertTrue(condition, message);
	}

	////////////////////// Get Title Method///////////////////////////

	public static String getTitleByText() {

		return driver.getTitle();

	}

}
