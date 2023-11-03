package ParaBank;
import org.openqa.selenium.support.PageFactory;

public class RegistrationActions {
	RegistrationPageLocators Registerlog ;
	
	public RegistrationActions() {
		Registerlog = new RegistrationPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), Registerlog);
	}
	public void clickRegister() {
		Registerlog.register.click();
	}
	public void setFirstname(String firstname) {
		Registerlog.firstname.sendKeys(firstname);
	}
	public void setLastname(String lastname) {
		Registerlog.lastname.sendKeys(lastname);
	}
	public void setAddress(String address) {
		Registerlog.address.sendKeys(address);
	}
	public void setCity(String city) {
		Registerlog.city.sendKeys(city);
	}
	public void setState(String state) {
		Registerlog.state.sendKeys(state);
	}
	public void setZipcode(String zipcode) {
		Registerlog.zipcode.sendKeys(zipcode);
	}
	public void setPhone(String phone) {
		Registerlog.phonenumber.sendKeys(phone);
	}
	public void setSsn(String ssn) {
		Registerlog.ssn.sendKeys(ssn);
	}
	public void setUsername(String username) {
		Registerlog.username.sendKeys(username);
	}
	public void setPassword(String password) {
		Registerlog.password.sendKeys(password);
	}
	public void setCpassword(String cpassword) {
		Registerlog.cpassword.sendKeys(cpassword);
	}
	public void clickRegisterButton() {
		Registerlog.register.click();
	}
	public String getVerifyText() {
		return Registerlog.verifyText.getText();
	}
	
	public void registerInfo(String firstname,String lastname,String address,String city, String state, String zipcode, String phone, String ssn ) {
		setFirstname(firstname);
		setLastname(lastname);
		setAddress(address);
		setCity(city);
		setState(state);
		setZipcode(zipcode);
		setPhone(phone);
		setSsn(ssn);
	}
	public void registerUser(String username, String password, String cpassword) {
		setUsername(username);
		setPassword(password);
		setCpassword(cpassword);
	}
}
 