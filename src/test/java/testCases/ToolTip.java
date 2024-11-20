package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips/");
		WebElement bntHoverMeTosee  = driver.findElement(By.id("toolTipButton"));
		String toolTipText = bntHoverMeTosee.getText();
		
		if(toolTipText.equals("Hower me to see")){
		System.out.println("Pass : tooltip matching expected value");
	    }else

	{
		System.out.println("Pass : tooltip is not matching expected value");
	}driver.quit();
}}
