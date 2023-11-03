package ParaBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(xpath="(//input[@class='input'])[1]")
    WebElement username ;
	@FindBy(xpath="(//input[@class='input'])[2]")
	WebElement password;
	@FindBy(xpath="(//input[@class='button'])[1]")
	WebElement login;
}