package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class W3Schools {
	public ChromeDriver driver;
	
	@Given("launch the browser")
	public void luanchthebrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		driver.switchTo().frame(1);
	}
	@When("enter the fullname {string}")
	public void fullname(String fname)
	{
		driver.findElement(By.id("fname")).sendKeys(fname);
	}
	@And("enter the email {string}")
	public void email(String email)
	{
		driver.findElement(By.id("email")).sendKeys(email);
	}
	@And("enter the address {string}")
	public void address(String address)
	{
		driver.findElement(By.id("adr")).sendKeys(address);
	}
	@And("enter the State {string}")
	public void state(String state)
	{
		driver.findElement(By.id("state")).sendKeys(state);
	}
	@And("enter the Zip {string}")
	public void zip(String zip)
	{
		driver.findElement(By.id("zip")).sendKeys(zip);
	}
	@And("enter the exp year {string}")
	public void expyear(String expyear)
	{
		driver.findElement(By.id("expyear")).sendKeys(expyear);
	}
	@And("enter the month {string}")
	public void month(String expmonth)
	{
		driver.findElement(By.id("expmonth")).sendKeys(expmonth);
	}
	@And("enter the name on card {string}")
	public void nameofcard(String cname)
	{
		driver.findElement(By.id("cname")).sendKeys(cname);
	}
	@Then("close the browser")
	public void closebrowser()
	{
		driver.close();
	}
	

}
