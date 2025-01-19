package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public  void alert() {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Karthik");
		prompt.accept();
		WebElement mytext=	driver.findElement(By.xpath("//span[@id='confirm_result']"));
		String prompttext = mytext.getText();
		if(prompttext.contains("Karthik"))
		{
			System.out.println("expected");
		}
		else
		{
			System.out.println("failed");
		}
		




	}

}
