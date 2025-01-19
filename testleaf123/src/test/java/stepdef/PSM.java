package stepdef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.Given;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class PSM extends AbstractTestNGCucumberTests{
	
	public static WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://automationexercise.com/");
		}	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
