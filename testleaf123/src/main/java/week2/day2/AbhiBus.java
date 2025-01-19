package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.Timeout;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-id='6 Chennai (Tamil Nadu)']")).click();

		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Banglore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-id='7 Bangalore (Karnataka)']")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		WebElement busname= driver.findElement(By.xpath("//h5[text()='Yolo Bus']"));
		String bus=	busname.getText();
		System.out.println("the first bus is=" + bus);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();



	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
