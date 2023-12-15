package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DashboardPage extends BasePage{
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]") WebElement CUSTOMERS_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]") WebElement ADDCUSTOMERS_MENU_ELEMENT;
	
	public void validateDashbordPage(String expectedText, String errorMsg) throws InterruptedException {
		
		Thread.sleep(2500);
		validateElement(DASHBOARD_HEADER_ELEMENT.getText(), expectedText, errorMsg);
	}
	
	public void clickCustomerButton() throws InterruptedException {
		Thread.sleep(2000);
		CUSTOMERS_MENU_ELEMENT.click();
	}
	
	public void clickAddCustomerButton() {
		ADDCUSTOMERS_MENU_ELEMENT.click();
	}

	

	
}
