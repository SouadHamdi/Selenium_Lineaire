package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSwitchCommand {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.rediff.com/");
		//Switching to the frame 
		driver.switchTo().frame("moneyiframe");
		WebElement option = driver.findElement(By.id("nseindex"));
		String value = option.getText();
		
		System.out.println("The value " +value);
		driver.switchTo().defaultContent();
		driver.quit();
		
		
		}

}
