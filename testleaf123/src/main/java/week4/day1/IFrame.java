package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert tryit = driver.switchTo().alert();
		tryit.accept();
		WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
		String text1 =text.getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Run ❯']")).click();
		
		

	}

}
