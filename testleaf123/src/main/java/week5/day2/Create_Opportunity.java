package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Create_Opportunity extends Login_salesforce {
	@Test
	public void Create_opp()
	{
		driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip'])[6]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement doubleclick=	driver.findElement(By.xpath("//a[@title='Opportunities']"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by VK");
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75,000");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement staging = driver.findElement(By.xpath("(//label[text()='Stage']//following::div)[1]"));
		js.executeScript("arguments[0].scrollIntoView();", staging);
		staging.click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		WebElement opp_name = driver.findElement(By.xpath("//slot[@name='primaryField']"));
		String op_name=	opp_name.getText();
		String my_op="Salesforce Automation by VK";
		if(op_name.equals("Salesforce Automation by VK"))
		{
			System.out.println(my_op +"expected"+ my_op);
		}
		else
		{
			System.out.println(my_op+"wrong"+ my_op);
		}


	}
	public static void main(String[] args) throws InterruptedException
	{
		

	}
}


