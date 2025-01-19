package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginTest extends ProjectSpecificMethod {
	
	//@Given("launch the browser")
//	public void launchbrowser()
//	{
//		ChromeOptions ops = new ChromeOptions();
//		ops.addArguments("--disable-notifications");
//		driver=new ChromeDriver(ops);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://login.salesforce.com/");
//	}
	@When("enter the username as {string}")
	public void username(String uname)
	{
		driver.findElement(By.id("username")).sendKeys(uname);	
		
		
	}
	@And("enter the password as {string}")
	public void password(String pword)
	{
		driver.findElement(By.id("password")).sendKeys(pword);
		
	}
	@And("click the login button")
	public void clicklogin()
	{
		driver.findElement(By.id("Login")).click();
	}
	@Then("homepage should displayed")
	public void verification()
	{
		String title = driver.getTitle();
		if(title.contains("Lightning Experience"))
		{
			System.out.println("login is successfull" + title);
		}
		else
		{
			System.out.println("login is failed" + title);	
		}
	}
	
	@But("the home page should not displayed")
	public void verification1()
	{
		String title = driver.getTitle();
		if(title.contains("Lightning Experience"))
		{
			System.out.println("test case pass" + title);
		}
		else
		{
			System.out.println("test case failed" + title);	
		}
	}

}
