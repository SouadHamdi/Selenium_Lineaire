package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSwitchWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		//Store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println("the fisrt window name is : " + handle);
	    WebElement btnNewWindowMessage = driver.findElement(By.id("messageWindowButton"));
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnNewWindowMessage);
	    btnNewWindowMessage.click();
	    
	    //Store and print name of the window
	    Set<String> handles = driver.getWindowHandles();
	    System.out.println("The windows name are: "+handles);
	    
	    //Pass a window handle to other window
	    for(String handle1 : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle1);
	    	System.out.println(handle1);
	    	
	    	}
	}

}
