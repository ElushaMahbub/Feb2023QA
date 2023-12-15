package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LogInPage;
import util.BrowserFactory;

public class AddCustomerTest {
  
	WebDriver driver;
	
	String userName = "demo@techfios.com";
    String password = "abc123";
    String dashbordValidationText ="Dashboard";
    String dashBoardValidationMsg = "DashboardPage is not available";
    String addCustomerValidationText = "Company";	
    String addCustomerValidationMsg = "Company option not found";	
    String fullName = "Selenium Feb2024";
	String company = "Amazon";
	String email = "eueluri@bd.com";
	String phoneNumber = "0290007";
	String address = "49 abc Rd";
	String city = "Gulshan";
	String state = "Dhaka";
	String zip = "1212";
	String country = "Bangladesh";
	String tags = "IT Training";
	String currency = "USD";
	String group = "Automation";
	
    

    @Test
	public void userShouldBeAbletoAddCustomer() throws InterruptedException {
		
		driver = BrowserFactory.init();
		LogInPage loginPage = PageFactory.initElements(driver, LogInPage.class);
		loginPage.performLogin(userName, password);
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashbordPage(dashbordValidationText, dashBoardValidationMsg);
		
		dashboardpage.clickCustomerButton();
		dashboardpage.clickAddCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.validateAddCustomerPage(addCustomerValidationText, addCustomerValidationMsg);
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.selectCompanyName(company);
		addCustomerPage.insertEmail(email);
		addCustomerPage.insertPhoneNumber(phoneNumber);
		addCustomerPage.insertAddress(address);
		addCustomerPage.insertCityName(city);
		addCustomerPage.insertState(state);
		addCustomerPage.insertZip(zip);
		addCustomerPage.selectCountryName(country);
		addCustomerPage.selectTags(tags);
		addCustomerPage.selectGroup(group);
		addCustomerPage.insertPassword(password);
		addCustomerPage.insertConfirmPassword(password);
		addCustomerPage.optWelcomeEmailOption();
		addCustomerPage.selectSaveoption();
		addCustomerPage.checkNewlyAddedNameInListOfCustomer();
		BrowserFactory.tearDown();
		
	}
}
