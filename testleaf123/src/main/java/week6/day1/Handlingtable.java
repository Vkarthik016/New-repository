package week6.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://finance.yahoo.com/");

	}

}
