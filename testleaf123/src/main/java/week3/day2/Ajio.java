package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		searchbar.sendKeys("bags");
		searchbar.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Laptop Backpacks']")).click();
		List<WebElement> bags = driver.findElements(By.tagName("h2"));
		for (int i = 0; i < bags.size(); i++) {
			System.out.println(bags.get(i).getText());
			
		}
		
		
		

	}

}
