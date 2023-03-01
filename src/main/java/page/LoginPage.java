package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
	WebDriver driver;
	
	// how  to establish all drivers in one driver
	
	public LoginPage (WebDriver driver) {
		this .driver = driver;
	}
	
	
	
	
// in login page we define the {elements, intractable methods}

	@FindBy (how = How.XPATH, using = "//*[@id=\"username\"]")WebElement User_Name_Element;
	@FindBy (how = How.XPATH,using = "//*[@id=\"password\"]")WebElement Password_Element;
	@FindBy(how = How.XPATH,using = "/html/body/div/div/div/form/div[3]/button")WebElement SIGININ_BUTTON_ELEMENT;
	
	
	//INTRACTABLE METHOD
	
	public void insertUsername(String userName) {
		User_Name_Element.sendKeys(userName);
		
	}
	
	public void insertPassword(String password) {
		Password_Element.sendKeys(password);
		
	}
	
	public void cliqueonSigninButton() {
		SIGININ_BUTTON_ELEMENT.click();
		
	}
	
	
	
	//COMBINE METHOD
	
	public void performLogin (String userName, String password) {
		User_Name_Element.sendKeys(userName);
		Password_Element.sendKeys(password);
		SIGININ_BUTTON_ELEMENT.click();
		
	}
	
	
	
	
	
	
	
	
}
