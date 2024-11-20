package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		String title = driver.getTitle();
		int lengthTitle = title.length();

		System.out.println("the length of the title is, " + lengthTitle);
		System.out.println("the title is : " + lengthTitle);

		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println("Vérification successfull - the correct url is opened");

		} else {
			System.out.println("Vérification failed - incorrect url is opened");
		}
		System.out.println(actualUrl);
		System.out.println(url);
		
		String pageSource = driver.getPageSource();
		int lengthPageSource = pageSource.length();
		System.out.println(lengthPageSource);
		driver.quit();
	}

}
