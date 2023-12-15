package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LogInPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	//TestData
	
    String userName;
    String password;
    String dashbordValidationText;
    String dashBoardValidationMsg;
    

	@Test
	@Parameters({"userName", "password","dashbordValidationText","dashBoardValidationMsg"})
	public void validUserShoulBeAbleToLogin(String userName, String password, String dashbordValidationText, String dashBoardValidationMsg) throws InterruptedException {
		
		
		driver = BrowserFactory.init();
		
		//LogInPage loginpage1 = new LogInPage();// we can not use the regular way of creating object in POM
		
		LogInPage loginpage = PageFactory.initElements(driver, LogInPage.class);
		loginpage.insertUserName(userName);
		loginpage.insertPassword(password);
		loginpage.clickOnSigninButton();
		
		DashboardPage dashbordpage = PageFactory.initElements(driver, DashboardPage.class);
		dashbordpage.validateDashbordPage(dashbordValidationText, dashBoardValidationMsg);
		
		BrowserFactory.tearDown();
		
	}
}
