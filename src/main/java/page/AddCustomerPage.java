package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage{

	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		
	}	
		@FindBy(how = How.XPATH, using = "//*[@id=\"rform\"]/div[1]/div[1]/div[2]/label")WebElement COMPANY_HEADER_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='account']")WebElement FULL_NAME_ELEMENT;
		@FindBy(how = How.XPATH, using = "//select[@id='cid']")WebElement COMPANY_DRPDWN_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='email']")WebElement EMAIL_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='phone']")WebElement PHONE_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='address']")WebElement ADDRESS_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='city']")WebElement CITY_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='state']")WebElement STATE_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='zip']")WebElement ZIP_ELEMENT;
		@FindBy(how = How.XPATH, using = "//select[@id='country']")WebElement COUNTRYDRPDWN_ELEMENT;
		@FindBy(how = How.XPATH, using = "//select[@id='tags']")WebElement TAGDRPDWN_ELEMENT;
		@FindBy(how = How.XPATH, using = "//select[@id='currency']")WebElement CURRENCYDRPDWN_ELEMENT;
		@FindBy(how = How.XPATH, using = "//select[@id='group']")WebElement GROUPDRPDWN_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='password']")WebElement PASSWORD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='cpassword']")WebElement CONFIRM_PASSWORD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\"rform\"]/div[1]/div[2]/div[5]/div/div/div/label[1]")WebElement WELCOME_EMAIL_OPT_ELEMENT;
		@FindBy(how = How.XPATH, using = "//button[@id='submit']")WebElement SAVE_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")WebElement LIST_CUSTOMER_ELEMENT;
		
		public void validateAddCustomerPage(String expectedText, String errorMsg) throws InterruptedException {
			Thread.sleep(2500);
			validateElement(COMPANY_HEADER_ELEMENT.getText(), expectedText, errorMsg);
		}
		public void insertFullName(String fullName) {
			FULL_NAME_ELEMENT.sendKeys(fullName + randomNumGenerator(999));
		}
		
		public void selectCompanyName(String company) {
			selectFromDropdown(COMPANY_DRPDWN_ELEMENT, company);
		}
		
		public void insertEmail(String email) {
			EMAIL_ELEMENT.sendKeys(randomNumGenerator(999) + email);
		}
		
		public void insertPhoneNumber(String phoneNumber) {
			PHONE_ELEMENT.sendKeys(phoneNumber + randomNumGenerator(999));
		}
		
		public void insertAddress(String address) {
			ADDRESS_ELEMENT.sendKeys(address + randomNumGenerator(999));
		}
		
		public void insertCityName(String city) {
			CITY_ELEMENT.sendKeys(city);
		}
		
		public void insertState(String state) {
			STATE_ELEMENT.sendKeys(state + randomNumGenerator(999));
			
		}
		
		public void insertZip(String zip) {
			ZIP_ELEMENT.sendKeys(zip);
		}
		
		public void selectCountryName(String country) {
			selectFromDropdown(COUNTRYDRPDWN_ELEMENT, country);
		}
		
		public void selectTags(String tags) {
			selectFromDropdown(TAGDRPDWN_ELEMENT, tags);
		}
		
		public void selectCurrency(String currency) {
			selectFromDropdown(CURRENCYDRPDWN_ELEMENT, currency);
		}
		
		public void selectGroup(String group) {
			selectFromDropdown(GROUPDRPDWN_ELEMENT, group);
		}
		
		public void insertPassword(String password) {
			PASSWORD_ELEMENT.sendKeys(password);
		}
		
		public void insertConfirmPassword(String password) {
			CONFIRM_PASSWORD_ELEMENT.sendKeys(password);
		}
		
		public void optWelcomeEmailOption() {
			WELCOME_EMAIL_OPT_ELEMENT.click();
		}
		
		public void selectSaveoption() {
			SAVE_ELEMENT.click();
		}
		
		public void checkNewlyAddedNameInListOfCustomer() throws InterruptedException {
			Thread.sleep(2000);
			LIST_CUSTOMER_ELEMENT.click();
		}
		
		
}
