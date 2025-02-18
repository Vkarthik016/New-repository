package demolistners;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SampleClass  {

	public WebDriver driver;


	public void table()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		List<WebElement> findElements = driver.findElements(By.xpath("(//table[@role='grid'])[2]//td[2]"));

		for(WebElement cells:findElements)
		{
			System.out.println(cells.getText());
		}
	}
	public void windows()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String parentwindow=	driver.getWindowHandle();
		Set<String> windows= driver.getWindowHandles();

		List<String>window = new ArrayList<String>(windows);
		driver.switchTo().window(window.get(1));
		String title=	driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(parentwindow);
		String parenttitle=	driver.getTitle();
		System.out.println("parent title +"+ title);
	}
	public void dropdown()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement selector=	driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select select = new Select(selector);
		select.selectByIndex(2);
		select.selectByVisibleText(null);
		select.selectByValue("2");
	}
	public void selectalldropdown()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		List<WebElement>	items =driver.findElements(By.xpath("//option[@class='ui-selectonemenu-label']"));
		for(WebElement item: items)
		{
			System.out.println(item.getText());
		}

	}
	public void alerts()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//*[text()='Show']")).click();
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	public void movetoelement() throws AWTException, InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/interactions/Actions.html");
		WebElement hover=	driver.findElement(By.xpath("//a[text()='moveToElement']"));
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);

		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(hover).perform();
		System.out.println(hover.getText());
	}
	public void countlinksinpage()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/link.xhtml");
		List<WebElement>links=	driver.findElements(By.tagName("a"));
		int count=0;
		for(WebElement countlinks: links)
		{
			count++;
		}
		System.out.println("number of links in this page "+ count);

	}
	public void confirmbtndisabled()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		WebElement disabled=	driver.findElement(By.xpath("//span[text()='Disabled']"));
		System.out.println(disabled.isEnabled());
	}
	public void finddefaultcheck()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		List<WebElement>butn=	driver.findElements(By.xpath("(//table[@role='presentation'])[6]//td"));

		for(WebElement radio :butn)
		{
			System.out.println(radio.getText());
			if(radio.isSelected())
			{
				System.out.println(radio.getText());
			}
		}

	}

	public void getinframe()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node01rqchqdfiw82315tz9lrqo200j8617133.node0");
		//driver.switchTo().frame(0);
		List<WebElement>keys=	driver.findElements(By.xpath("(//table[@role='grid'])[2]//td[3]"));
		Set<String>unique = new LinkedHashSet<String>();
		
		for (WebElement key1 : keys) {
			unique.add(key1.getText());
				}
		
		for (String string : unique) {
			
			System.out.println(string);
			
		}
	}


	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		SampleClass s = new SampleClass();
		//s.table();
		//s.windows();
		//s.dropdown();
		//s.selectalldropdown();
		//s.alerts();
		//s.movetoelement();
		//s.countlinksinpage();
		//s.confirmbtndisabled();
		//s.finddefaultcheck();
		s.getinframe();

	}



}
