package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesIRCTC {

	public void windw()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		String parentwindow=	driver.getWindowHandle();
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		Set<String> windows=driver.getWindowHandles();
		List<String>window = new ArrayList<String>(windows);
		driver.switchTo().window(window.get(1));
		String titlewidnow =driver.getTitle();
		System.out.println(titlewidnow);
		driver.switchTo().window(parentwindow);
		String parenttiel= driver.getTitle();
		System.out.println(parenttiel);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		ChromeDriver driver = new ChromeDriver();
		//		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//		driver.get("https://www.irctc.co.in/");
		//		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		//		Set<String> windowHandles = driver.getWindowHandles();
		//		List<String>windows= new ArrayList<String>(windowHandles);
		//		System.out.println("list of windows"+ windows);
		//		driver.switchTo().window(windows.get(1));
		//		String Childtitle = driver.getTitle();
		//		System.out.println("child window title" + Childtitle);
		//		driver.close();
		//		driver.switchTo().window(windows.get(0));
		//		//(windows.get(0));
		//		String parenttitle =driver.getTitle();
		//		System.out.println("parent title is:"+ parenttitle );
		//		driver.quit();
		//		
		WindowHandlesIRCTC ww = new WindowHandlesIRCTC();
		ww.windw();





	}

}
