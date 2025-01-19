package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Edit_Opp extends Login_salesforce{
	@Test
	public void EditOpp()
	{
		driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip'])[6]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement doubleclick=	driver.findElement(By.xpath("//a[@title='Opportunities']"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		driver.findElement(By.xpath("//div[@type='search']")).click();
		WebElement searchbar=driver.findElement(By.xpath("//div[@type='search']"));
		searchbar.sendKeys("Salesforce Automation by VK");
		//searchbar.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Salesforce Automation by VK']")).click();
		driver.findElement(By.xpath(" //span[text()='Show more actions']/parent::button")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement staging=	driver.findElement(By.xpath("(//label[text()='Stage']//following::div)[1]"));
		js.executeScript("arguments[0].scrollIntoView();",staging );
		staging.click();
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
		WebElement delivery_status = driver.findElement(By.xpath("(//label[text()='Delivery/Installation Status']/following::div)[1]"));
		js.executeScript("arguments[0].scrollIntoView();",delivery_status );
		delivery_status.click();
		driver.findElement(By.xpath("//span[text()='In progress']")).click();
		WebElement description = driver.findElement(By.xpath("//label[text()='Description']/following::div//textarea"));
		js.executeScript("arguments[0].scrollIntoView();",description );
		description.sendKeys("salesforce");
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Details']")).click();
		WebElement stage1 = driver.findElement(By.xpath("((//div[@class='test-id__field-label-container"
				+ " slds-form-element__label no-utility-icon'])[10]/following::span)[1]"));
		String stage_name = stage1.getText();
		if(stage_name.equals("Perception Analysis" ))
		{
			System.out.println("correct stage name" + stage_name);
		}
		else
		{
			System.out.println("wrong stage name"+ stage_name);
		}
		


	}

}
