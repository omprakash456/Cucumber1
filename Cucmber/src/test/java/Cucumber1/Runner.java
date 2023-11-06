package Cucumber1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags ="@ValidCredentials or @InvalidCredentials",features = "src/test/resources/Features/HRM.feature",glue ="Cucumber1",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runner extends AbstractTestNGCucumberTests {

}
