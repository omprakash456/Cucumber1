package Cucumber1;

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
		
	}
}
