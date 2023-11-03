package ParaBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageLocators {
	@FindBy(xpath="//input[@name='customer.firstName']")
		WebElement firstname;
	@FindBy(xpath="//input[@name='customer.lastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@name='customer.address.street']")
	WebElement address;
	@FindBy(xpath="//input[@name='customer.address.city']")
	WebElement city ;
	@FindBy(xpath="//input[@name='customer.address.state']")
	WebElement state;
	@FindBy(xpath="//input[@name='customer.address.zipCode']")
	WebElement zipcode;
	@FindBy(xpath="//input[@name='customer.phoneNumber']")
	WebElement phonenumber;
	@FindBy(xpath="//input[@name='customer.ssn']")
	WebElement ssn;
	@FindBy(xpath="//input[@name='customer.username']")
	WebElement username ;
	@FindBy(xpath="//input[@name='customer.password']")
	WebElement password ;
	@FindBy(xpath="(//input[@type='password'])[3]")
	WebElement cpassword;
	@FindBy(xpath=" //input[@value='Register']")
	WebElement register ;
	@FindBy(xpath="")
	WebElement verifyText;
	

}
