package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		List<WebElement> chekbox = driver.findElements(By.xpath("//input[@class='bcCheckBox']"));

		for (WebElement ele : chekbox) {

			ele.click();

		}
	}
}
