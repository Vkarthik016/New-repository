package week5.day1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void beforesteps(String browsername)
	{
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
		
		if(browsername.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}else if (browsername.equalsIgnoreCase("ie")) {
			driver= new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		}
	}
	@AfterMethod
	public void aftersteps()
	{
		//driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

}
