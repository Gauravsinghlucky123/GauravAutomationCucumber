package pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Practiceclass4 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://testautomationcentral.com/demo/multi_select_dropdown.html");
	WebElement Btn = driver.findElement(By.xpath("//button[@id='dropdown-toggle']"));
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(Btn));
	
	
	Btn.click();
	
	   List<WebElement>  elements =   driver.findElements(By.xpath("//ul[@id='dropdown-menu']/li"));
		
	   for(WebElement  ele : elements) {
		   
	String name = ele.getText();
	
	System.out.println(name);
	
if(name.equals("Cherry")) {
	ele.click();
	
	break;
		
}
	   }
	   driver.quit();
	
	
		}
}





