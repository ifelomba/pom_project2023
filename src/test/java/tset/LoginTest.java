package tset;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowseFactory;

public class LoginTest {
	
WebDriver driver;	
	
String UserName = "demo@techfios.com";
String Password = "abc123";


	@Test

   public void 	ValidUSerShouldBeAbleToLogin() {
	   
	  driver = BrowseFactory.init();
	   
	  //object for pageFactory
	   LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	   
	   loginpage.insertUsername(UserName);
	   loginpage.insertPassword(Password);
	   loginpage.cliqueonSigninButton();
	   
	   DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	   dashboardpage.validateDashBoard();
	   
	   BrowseFactory.teardown();
	   
	   
   }
   
   
	
	
	
	
	
	
	
	
}
