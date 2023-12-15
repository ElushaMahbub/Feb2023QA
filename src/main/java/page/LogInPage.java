package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {

	WebDriver driver;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//By USER_NAME_FIELD = By.xpath("//input[@id='username']");// we can not use By class or
	//WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));//or by Webelement to locate webElement and sort the \
	//in to a variable. in Page Object Model we use @FindBy to sort and save the element in a variable.
	
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USER_NAME_ELEMENT;//HERE name of element goes at end
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement SIGNIN_ELEMENT;
	
	//individual method - better to use this in long run to troubleshoot/debugging
	public void insertUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickOnSigninButton() {
		SIGNIN_ELEMENT.click();
	}
	
	//Combine method - we can use this for loginTest because there is only few steps to execute.
	
	public void performLogin(String username, String password) {
		USER_NAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_ELEMENT.click();
	}
}
