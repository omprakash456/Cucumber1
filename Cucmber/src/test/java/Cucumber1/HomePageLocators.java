package Cucumber1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement verifyText;
}
