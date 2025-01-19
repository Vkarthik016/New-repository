package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TATACliq {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com/");
		driver.findElement(By.xpath("//button[text()='Ask me later']")).click();
		WebElement brands=driver.findElement(By.xpath("//div[text()='Brands']"));	
		Actions act= new Actions(driver);
		act.moveToElement(brands).perform();
		WebElement watches=driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(watches).perform();
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		WebElement sort=driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select select= new Select(sort);
		select.selectByVisibleText("New Arrivals");
		driver.findElement(By.xpath("//div[text()='Men']//preceding-sibling::div")).click();
		Thread.sleep(3000);
		List<WebElement> watchprice = driver.findElements(By.className("ProductDescription__boldText"));
		
		for (int i = 0; i < watchprice.size(); i++) {
			String price= watchprice.get(i).getText();
			System.out.println(price);
		}
		System.out.println("after the loop");
		//driver.findElement(By.xpath("//a[@class='wzrkClose']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[contains(text(),'Casio GA-110CD-1A2DR')]")).click();
			
		

		


	}
}

