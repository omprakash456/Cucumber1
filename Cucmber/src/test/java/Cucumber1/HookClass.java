package Cucumber1;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass {
	@Before
	public static void setUp() {
		HelperClass.SetUpDriver();
	}
    @After
	public static void tearDown(Scenario scenario) {
		HelperClass.TearDown();
    	if(scenario.isFailed()){
    		final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
    		scenario.attach(screenshot,"image/png",scenario.getName());
    		}

    	
    		
    	}
		
	}

