package Cucumber1;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestLogger {
	public static WebDriver driver;
	public static org.apache.logging.log4j.Logger log;
	
	public static void main(String[] args) {
		log=LogManager.getLogger(TestLogger.class);
		 
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("Implicit wait applied for 10 seconds");
		driver.get("https://www.myntra.com/shop/women");
		log.info("Logged into Myntra");
		try {
			boolean text= driver.findElement(By.xpath("//a[contains(text(),'Women')]")).isDisplayed();
					
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			log.error("Exceptionb occured", new Exception("Element Not Found"));
			
		}
		finally {
			driver.quit();
			log.info("Quitting the driver");
		}
	}

}
