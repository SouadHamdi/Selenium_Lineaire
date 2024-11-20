package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		WebElement selectMenu = driver.findElement(By.id("oldSelectMenu"));
		Select dropDownList = new Select(selectMenu);
		
		//Select by index
		//dropDownList.selectByIndex(3);
		//Select by value
		//dropDownList.selectByValue("5");
		//Select by visible text
		//Indigo
		dropDownList.selectByVisibleText("Indigo");
		

	}

}
