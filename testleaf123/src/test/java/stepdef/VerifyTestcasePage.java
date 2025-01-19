package stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyTestcasePage extends PSM{

	

	
	@When("Verify that the home page is visible successfully")
	public void verifypage()
	{
		String Homepagetitle=driver.getTitle();
		Assert.assertEquals(Homepagetitle, "Automation Exercise");
	}
	@And("Click on 'Test Cases' button")
	public void clicktestcase()
	{
		driver.findElement(By.xpath("//a[text()=' Test Cases']")).click();
	}
	@Then("Verify user is navigated to test cases page successfully")
	public void verifytestcase()
	{
		String testcasetitle=driver.getTitle();
		Assert.assertEquals(testcasetitle,
				"Automation Practice Website for UI Testing - Test Cases");
	}
	
	
	@When("Verify that home page is visible successfully")
	public void verifyhomepage()
	{
		String Homepagetitle=driver.getTitle();
		Assert.assertEquals(Homepagetitle, "Automation Exercise");
	}
	@And("Click on 'Products' button")
	public void clickproductbutton()
	{
		driver.findElement(By.xpath("//a[text()=' Products']")).click();
	}
	@And("Verify user is navigated to ALL PRODUCTS page successfully")
	public void verifyallproductspage()
	{
		String productstpagetitle=	driver.getTitle();
		Assert.assertEquals(productstpagetitle, "Automation Exercise - All Products");
	}
	@And("The products list is visible")
	public void verifytheproductvisible()
	{
		WebElement brands=	driver.findElement(By.xpath("//h2[text()='Brands']"));
		String brand=	brands.getText();
		Assert.assertEquals(brand, "BRANDS");
	}
	@And("Click on 'View Product' of first product")
	public void clickfirstproduct() throws AWTException, InterruptedException
	{
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='View Product']")).click();
	}
	@And("User is landed to product detail page")
	public void verifyproductdetailpage()
	{
		String prodtitle=	driver.getTitle();
		Assert.assertEquals(prodtitle, "Automation Exercise - All Products");
	}
	@Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
	public void verifythedetails()
	{
		WebElement prodname=	driver.findElement(By.xpath("//h2[text()='Blue Top']"));
		String prodname1=	prodname.getText();
		Assert.assertEquals(prodname1, "Blue Top");
		
		WebElement category = driver.findElement(By.xpath("//p[text()='Category: Women > Tops']"));
		String category1 = category.getText();
		
		if(category1.contains("Category"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}


}
