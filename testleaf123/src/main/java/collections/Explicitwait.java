package collections;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.SeleniumCdpConnection;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Explicitwait {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	@BeforeMethod
	public void beforemethod()
	{
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0er6opmmdc3zxaia5vy56m2zq7151222.node0");
		driver.manage().window().maximize();
	}

	@Test (enabled = false)
	public void wait1()
	{
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		//WebElement amhere=driver.findElement(By.xpath(""))
		WebElement amhere1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='I am here']")));
		String text=	amhere1.getText();
		Assert.assertEquals(text, "I am here");

	}
	@Test
	public void wait2()
	{
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		WebElement text2= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
	}
	@Test
	public void wait3()
	{
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']"))).click();
		
		
	}
	@Test
	public void wait4()
	{
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath("//span[text()='I am going to change!']"), "Did you notice?"));
	}

}
