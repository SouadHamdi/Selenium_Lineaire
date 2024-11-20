package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEvent {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/text-box");
		
		//SCROLL DOWN
		
		
		WebElement fullName= driver.findElement(By.id("userName"));
		WebElement email= driver.findElement(By.id("userEmail"));
		WebElement currentAdress= driver.findElement(By.id("currentAddress"));
		WebElement permanentAdress= driver.findElement(By.id("permanentAddress"));
		WebElement btnSubmit= driver.findElement(By.id("submit"));

		fullName.sendKeys("Hedia GUIZAOUI");
		email.sendKeys("hedia@gmail.com");
		currentAdress.sendKeys("France");
		
		//Copy paste
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		permanentAdress.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		btnSubmit.click();
		
		//driver.quit();
		
	}

}
