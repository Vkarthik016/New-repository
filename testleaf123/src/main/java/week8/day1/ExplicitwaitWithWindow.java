package week8.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitWithWindow {

	private static Boolean until;
	private static Set<String> windowHandles;
	private static Set<String> windowHandles2;
	private static Set<String> windowHandles3;
	private static String title;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();

		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		//w.until(ExpectedConditions.numberOfWindowsToBe(3));

		Set<String>	windowHandles3 = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles3);
		driver.switchTo().window(windows.get(1));
		title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		






	}

}
