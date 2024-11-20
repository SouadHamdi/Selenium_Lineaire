package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips/");
		WebElement placeHolderHowerMeTToSee  = driver.findElement(By.id("toolTipTextField"));
        String textPlaceHolder = placeHolderHowerMeTToSee.getAttribute("placeholder");
        System.out.println("the placeHolder is "+textPlaceHolder);
	}

}
