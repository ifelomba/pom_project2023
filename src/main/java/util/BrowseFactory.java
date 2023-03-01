package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFactory {
	
	
 static WebDriver driver;

	public static WebDriver  init() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/blackexcellence/Downloads/chromedriver_mac64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
	
	public static void  teardown() {
		driver.close();
		driver.quit();
		
		
	}
	
	
	
	
	

	

}
