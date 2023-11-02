package Cucumber1;

import org.testng.Assert;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
 
public class OrangeHrmLogin {
	Data data = new Data();
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHome = new HomePageActions();
	@Given("User is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
		HelperClass.openPage(data.strurl);
	}

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
    	objLogin.Login(data.strUserName,data.strPassword);
  
    }
    @When("User clicks login button")
	public void user_clicks_login_button() {
		objLogin.clickLogin();
	}
    @Then("User should be able to login sucessfully and Home page opens")
    public void user_should_be_able_to_login_sucessfully_and_home_page_opens() {
    	Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));   
    }
	}
 

 