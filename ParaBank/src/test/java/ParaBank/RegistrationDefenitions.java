package ParaBank;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class RegistrationDefenitions {
	RegistrationActions Regactions = new RegistrationActions();
	DataProperties Data = new DataProperties();
	@Given("User in the ParaBank Register Page")
	public void user_in_the_para_bank_register_page() {
	    HelperClass.openPage(Data.url);
	}
 
	@When("User clicks Register link")
	public void user_clicks_register_link() {
	   Regactions.clickRegister();
	}
 
	@When("User enters firstname,lastname,address,city,state,zipcode,Phone,ssn")
	public void user_enters_firstname_lastname_address_city_state_zipcode_phone_ssn() {
	    Regactions.registerInfo(Data.firstname,Data.lastname,Data.address,Data.city,Data.state,Data.zipcode,Data.phone,Data.ssn);
	}
 
	@When("User enters Username,password and Confirm-Password")
	public void user_enters_username_password_and_confirm_password() {
	   Regactions.registerUser(Data.username, Data.password, Data.cpassword);
	}
 
	@When("User clicks Register button")
	public void user_clicks_register_button() {
	 Regactions.clickRegisterButton();
	}
 
	@Then("User able to see logged in page and logout an account")
	public void user_able_to_see_logged_in_page_and_logout_an_account() throws InterruptedException {
    Assert.assertTrue(Regactions.getVerifyText().contains("Your account was created successfully. You are now logged in."));

		
		
	   
	}
}
 
