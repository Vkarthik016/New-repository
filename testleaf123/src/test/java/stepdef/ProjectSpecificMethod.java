package stepdef;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod  extends AbstractTestNGCucumberTests{
	public	static ChromeDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		//driver.close();
	}

}
