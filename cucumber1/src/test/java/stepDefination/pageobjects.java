package stepDefination;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class pageobjects {
	
	public pageobjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='login.htm']")
	public WebElement signin;

	@FindBy(id = "userName")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(name = "Login")
	public WebElement login;

}
