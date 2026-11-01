package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practiceclass2 {

	static WebDriver driver;

	public static void main(String[] args) {
		
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://skillcureacademy.com/");

//		driver.get("https://aivoa.ai/");

//	 driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

//		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");

//		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

//		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html#google_vignette");
		// driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		driver.get("https://www.testautomationcentral.com/demo/dropdown.html");

		Practiceclass2 test = new Practiceclass2();

		// ******************************* The Way to Call User Define Method
		// ***********************************

//		    test.skillCure();
		    test.skillCure2();
		
//		test.clickButton();
		
//		test.selectTypeDropdown();

//		test.checkBoxSelect();

//		test.navigateBackwordForword();

//		test.popUpHandle();
//		test.switchToWindow();

//		test.nonSelectTypeDropdown();

//	  test.bootStrapDropDown();

//		test.clickOnImage();
//		test.selectTypeDropDown();
	}

//		test.verifySecondDropdown();
//		test.verifyTitle();
//	}

//		test.clickButton();
//
//	}

	// *********************************** SendKeys And Click Method
	// **************************************
//
//	public void login() {
//
//		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
//		email.sendKeys("gauravbhabha161198@gmail.com");
//
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		pass.sendKeys("Gaurav123");
//
//		WebElement Login = driver.findElement(By.xpath("//div[text()='Log in' and @class='content']"));
//		Login.click();
//
//	}
//
//	public void verifyTitle() {
//		System.out.println(driver.getTitle());
//	}
//

	// ************************************** Non Select Type DropDown Mrthod
	// **********************************

//	public void veryfyDropdownNonSelectType() {
//		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']"));
//		btn.click();
//
//		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
//
//		for (WebElement ele : elements) {
//
//			String name = ele.getText();
//
//			System.out.println(name);
//
//			if (name.equals("JavaScript")) {
//				ele.click();
//
//				break;
//
//			}
//
//		}
//	}
//

	// ******************************************** Implicitly wait Method
	// *******************************************************

//	public void verifyImplicitlyWait() {
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	}
//
//	public void verifyExplicitWait() {
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
//
//	}

	// *************************** Click Method
	// ****************************************

//
//	public void clickButton() {
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//		WebElement clickbtn = driver.findElement(By
//				.xpath("//div[@class='U26fgb O0WRkf zZhnYe e3Duub C0oVfc Kekmtd M9Bg4d']/div[@class='ZFr60d CeoRYc']"));
//		clickbtn.click();
//
//		driver.quit();
//	}

//	

//	 **********************************  select Type Dropdown Method   ******************

//	public void selectTypeDropDown() {
//
//		WebElement drpDown = driver.findElement(By.xpath("//select[@id='course']"));
//
//		Select s = new Select(drpDown);
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	// ******************************* By Using SelectByVisibleText Method
	// ****************************

//	s.selectByVisibleText("Java");
//	s.selectByVisibleText("Dot Net");
//	s.selectByVisibleText("Javascript");

	// ************************************* By Using SelectByValue Method
	// *************************************

//		s.selectByValue("net");
//		s.selectByValue("python");
//		s.selectByValue("js");
//
//		driver.quit();

	// clickOnImage Method

//     public void clickOnImage()  {
//	
//	WebElement img =   driver.findElement(By.xpath("//img[@id='Header1_headerimg']"));
//	
//	img.click();
//	

//	******************** Again BootStrap dropDown for Practice **********************

//	public void bootStrapDropDown() {
//
//		WebElement bootdrp = driver.findElement(By.xpath("//button[@id='menu1']"));
//
//		bootdrp.click();
//
//
//		List<WebElement> bootstrap = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
//
//		for (WebElement ele : bootstrap) {
//
//		String innertext = 	ele.getText();
//		
//		System.out.println(innertext);
//		
//		if(innertext.equals("JavaScript")) {
//			
//			
//			
//		}
//
//		}
//		
//	}
//	

//	public void nonSelectTypeDropdown() {
//
//		WebElement nonselect = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
//
//		nonselect.click();
//
//		List<WebElement> drpnonselect = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
//
//		for (WebElement elements : drpnonselect) {
//
//			String text = elements.getText();
//		System.out.println(text);
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(elements));
//			
//			if (text.equals("Another action")) {
//				
//				
//				
//				elements.click();
//				
//			
//				break;
//				
//			}else if(text.equals("Something else here")) {
//				elements.click();
//				break;
//			}
//
//		}
//		driver.quit();
//
//	}

//	public void switchToWindow() {
//
//		String parent = driver.getWindowHandle();
//
//		WebElement btnWindow = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
//		btnWindow.click();
//		
//		System.out.println(parent);
//
//		Set<String> allwindow = driver.getWindowHandles();
//
////	for each loop
//
//		for (String window : allwindow) {
//			
//			System.out.println(window);
//
//			if (!window.equals(parent))
//				;
//			driver.switchTo().window(window);
//	
//		}
//		
//
//		
//
//		WebElement ele = driver.findElement(By.xpath("//input[@id='firstName']"));
//		ele.sendKeys("Gaurav QA");
//		driver.close();
//	
//		
//		driver.switchTo().window(parent);
//	WebElement box = 	driver.findElement(By.xpath("//input[@id='name']"));
//	box.sendKeys("Singh");
//		
//
//	
//	driver.quit();
//	
//	}

//	public void popUpHandle() {
//
//		WebElement popup = driver.findElement(By.xpath("//button[@id='promptBox']"));
//		popup.click();
//
//		Alert a = driver.switchTo().alert();
//		String test = a.getText();
//		System.out.println(test);
//		a.sendKeys("Automation");
//
//		a.accept();
//
//	}

//	public void navigateBackwordForword() {
//
//		driver.navigate().back();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		driver.navigate().forward();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		driver.navigate().refresh();
//	}
//	
//	
//	
//	public void checkBoxSelect() {
//		
//		List<WebElement>  checkbox = driver.findElements(By.xpath("//input[@class='bcCheckBox']"));
//		
//		  for(WebElement ele : checkbox) {
//			  
//			  ele.click();
//		  }
//			  
//		  }
//	

//	public void selectTypeDropdown() {
//
//		WebElement dropdwn2nd = driver.findElement(By.xpath("//select[@id='BlogArchive1_ArchiveMenu']"));
//
//		Select s = new Select(dropdwn2nd);
//		
//		
//		s.selectByVisibleText("March (10)");
//		
////		s.selectByContainsVisibleText("December (5)");
////		
////		s.selectByVisibleText("February (3)");
////		
//		
	
	

//public void clickButton() {
//	
//	WebElement Button = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']"));
//	
//	Button.click();
//	
//	WebElement email =   driver.findElement(By.xpath("//input[@placeholder='qa@yourcompany.com']"));
//	email.sendKeys("gauravbhabha161198@gmail.com");
//	
//	 WebElement name = driver.findElement(By.xpath("//input[@placeholder='Dr. Kapish Sharma']"));
//	 name.sendKeys("Gaurav Singh");
//	
//	 
//	WebElement number =  driver.findElement(By.xpath("//input[@type='tel']"));
//	number.sendKeys("7705042782");
//	
//	WebElement company =   driver.findElement(By.xpath("//input[@placeholder='e.g. Captab Biotech']"));
//	company.sendKeys("SoftoGrid Solutions");
//	
//	
//	 WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-input-new']"));
//	 
//	 Select s = new Select(dropdown);
//	 s.selectByVisibleText("Batch release & disposition delays");
//	 
//	WebElement checkbox =  driver.findElement(By.xpath("//div[@class='chip-grid-new']/div"));
//	  checkbox.click();
//	  
//	  try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		
//		e.printStackTrace();
//	}
//
//	WebElement submitbutton =   driver.findElement(By.xpath("//button[@class='submit-btn-new']"));
//	submitbutton.click();
//	
//	 
//	 driver.quit();
	
	

	
//public void skillCure() {
//
//	WebElement name = driver.findElement(By.xpath("//input[@id=\"ff_5_names_first_name_\"]"));
//	name.sendKeys("Gaurav singh");
//
//	WebElement email = driver.findElement(By.xpath("//input[@id=\"ff_5_email\"]"));
//	email.sendKeys("gauravbhabha161198@gmail.com");
//
//	WebElement number = driver.findElement(By.xpath("//input[@id=\"ff_5_phone\"]"));
//	number.sendKeys("7705042782");
//	
//
//	WebElement button = driver.findElement(By.xpath("(//button[@type=\"submit\"] ) [2]"));
//
//	button.click();
//	
	

  
//    }


public void skillCure2() {
	
	WebElement box  = driver.findElement(By.xpath("//input[@id=\"ff_1_6_names_first_name_\"]"));
	box.sendKeys("sachin singh");
	
	WebElement email2 = driver.findElement(By.xpath("//input[@id=\"ff_1_6_email\"]"));
	email2.sendKeys("gsinghscube110096@gmail.com");
	
	 WebElement phone =   driver.findElement(By.xpath("//input[@id=\"ff_1_6_phone\"]"));
	 phone.sendKeys("6388613716");
	 
	 
	 WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"ff_1_6_dropdown\"]"));
	 
	 
	 Select s = new Select(dropdown);
	 s.selectByVisibleText("Data Analytics");
	 
	 
	  WebElement button =  driver.findElement(By.xpath("//button[@fdprocessedid=\"gepuri\"]"));
	  button.click();
	   }



}


