package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	
	public DashboardPage(WebDriver driver) {
		
		this.driver = driver;
		
	}

	//things we need in this page of DashBoarPage 
	
	// Web element
	@FindBy(how = How.XPATH , using ="//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_HEADER_ELEMENT;
	
	
	
	
	
	//intractable methods
	
	public void validateDashBoard() {
	Assert.assertTrue(DASHBOARD_HEADER_ELEMENT.isDisplayed(), "DsahBoardPage not available");
	
	
		
		
	}
	
	
	
	
	
	
	
	
}
