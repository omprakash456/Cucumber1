package Cucumber1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(name = "username")
	public WebElement username;
	@FindBy(name = "password")
	public WebElement password;
	@FindBy(xpath = "//button[@type = 'submit']")
	public WebElement Login;
}
