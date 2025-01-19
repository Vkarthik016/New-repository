package week2.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Basic']//preceding-sibling::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']//preceding-sibling::div[1]")).click();
		driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		
		WebElement e=driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']"));
		boolean btn= e.isEnabled();
		System.out.println(btn);
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//label[text()='Miami']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div")).click();
		driver.quit();
	}

}
