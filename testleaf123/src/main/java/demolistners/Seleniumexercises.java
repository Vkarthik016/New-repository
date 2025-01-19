package demolistners;

import java.awt.AWTException;
import java.awt.Checkbox;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Seleniumexercises {

	public  WebDriver driver;

	public void getvsnavigate() throws InterruptedException, AWTException
	{
		driver=	 new ChromeDriver();
		driver.get("https://revature.com/");
		driver.findElement(By.id("site-header-mobile-nav-trigger")).click();
		Thread.sleep(2000);
		//		driver.navigate().refresh();
		//		driver.get(driver.getCurrentUrl());

		//		JavascriptExecutor js = (JavascriptExecutor) driver;
		//		js.executeScript("location.reload()");

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(""))));


		//		driver.navigate().to("https://revature.com/");
		//		driver.navigate().back();

	}

	public void getgooglesuggestion() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("game of thrones");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		List<WebElement>suggestions=
				wait.until
				(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@role='listbox']//li"))));

		for (WebElement element : suggestions) {
			System.out.println(element.getText());

		}
	}

	public void clickgooglesuggestion() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("game of thrones");
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		//WebElement thirdsuggestion=	driver.findElement(By.xpath("//ul[@role='listbox']//li[3]"));
		//int position=0;

		for(WebElement element: suggestions)
		{ 
			String text= element.getText();
			System.out.println(text);
			//position++;
			if(text.contains("season 1"))
				//if(position==3)
			{
				element.click();
				break;

			}

		}
		int numberoflinks=0;
		Thread.sleep(2000);
		List<WebElement>links=	driver.findElements(By.xpath("//a"));
		for(WebElement li:links)
		{
			String text1=	li.getText();
			if(text1.contains("thrones"))
			{
				System.out.println(li.getAttribute("href"));
				numberoflinks++;
			}

		}System.out.println("number of links " + numberoflinks);


	}

	public void getciteurls() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.com/");
		WebElement searchbox=	driver.findElement(By.name("q"));
		searchbox.sendKeys("12 angry man" + Keys.ENTER);
		int totallinks=0;
		List<WebElement>greenlinks=	driver.findElements(By.xpath("//cite"));
		for(WebElement links: greenlinks)
		{
			System.out.println(links.getText());
			totallinks++;
		}System.out.println(totallinks);
	}
	public void scrolling() throws AWTException, InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.revature.com/");


		//		Robot rb= new Robot();
		//		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		//		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		//		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		//		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//		
		JavascriptExecutor js=(JavascriptExecutor) driver;	
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollheight)","");
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
		//driver.findElement(By.xpath("//div[text()='View All ']")).click();
	}

	public void findunderline()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.revature.com/");
		WebElement starthere=	driver.findElement(By.xpath("(//a[text()='Start Here'])[2]"));
		String beforehover=	starthere.getCssValue("text-decoration");
		System.out.println("beforehover " + beforehover);
		Actions action= new Actions(driver);
		action.moveToElement(starthere).perform();
		String afterhover=	starthere.getCssValue("text-decoration");
		System.out.println("afterhover " + afterhover);
	}
	public void linktext()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.revature.com/");

		//		String text=driver.findElement(By.linkText("தமிழ்")).getText();
		//		System.out.println(text);
		driver.findElement(By.partialLinkText("Start")).click();


	}

	public void table()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement>cells=driver.findElements(By.xpath("//table[@id='customers']//td[1]"));

		for(WebElement cell:cells)
		{
			System.out.println(cell.getText());
		}

	}

	public void windowhandles()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.linkText("HOTELS")).click();
		String parentwindow=	driver.getWindowHandle();
		Set<String> windows= driver.getWindowHandles();

		List<String> window = new ArrayList<String>(windows);
		driver.switchTo().window(window.get(1));
		System.out.println("title of child window " +driver.getTitle());
		driver.switchTo().window(parentwindow);
		System.out.println("parent title "+driver.getTitle());
	}

	public void wholereverse()
	{
		String name ="my name is karthik";
		//String[]split=	name.split(" ");
		char[] ch=	name.toCharArray();

		int i=0;
		for(i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
			//return ch[i];
		}

	}

	public void handlingalert() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert al=	driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert al1=	driver.switchTo().alert();
		Thread.sleep(2000);
		al1.sendKeys("testing");
		al1.accept();
	}
	public void frames()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		driver.switchTo().frame(1);
		driver.findElement(By.id("Click")).click();


	}
	public void stringreverse()
	{
		String name ="Mom";
		String output="";

		for(int i=name.length()-1;i>=0;i--)
		{
			char ch1= name.charAt(i);
			output =output + ch1;


		}System.out.println(output);
		if(name.equalsIgnoreCase(output))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

	public void selectallcheckbox()
	{
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node0opb8tm419sxmgc2b7984qa0p7379886.node0");
		driver.manage().window().maximize();

		List<WebElement> checkboxes=driver.findElements(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		for(WebElement checkbox: checkboxes)
		{
			if(checkbox.isDisplayed())
			{
				checkbox.click();
			}

		}
	}

	public void selectalldropdown()
	{
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node0opb8tm419sxmgc2b7984qa0p7379886.node0");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		List<WebElement>dropdownvalues=	driver.findElements(By.xpath("//ul[@role='group']"));

		for(int i=0;i<dropdownvalues.size();i++)
		{
			WebElement dropdowns=dropdownvalues.get(i);

			dropdowns.click();
			System.out.println(dropdowns.getText());
		}
	}
	@Test(invocationCount = 3)
	public void looptest()
	{
		//System.out.println("pavi");
	}
	@Test(timeOut = 2000,expectedExceptions = StringIndexOutOfBoundsException.class)
	public void testngexceptions()
	{
		Assert.assertTrue(false);
		String name="karthik";
		for(int i=0;i<=name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
	}
	@Test(dependsOnMethods = "testngexceptions",alwaysRun = true)
	public void checkalwaysrun()
	{
		System.out.println("am working");
	}

	public void headlessmode()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.youtube.com/watch?v=_j0S9Fbs3dY");
		System.out.println(driver.getTitle());
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	public void finduplicate()
	{
		String name = "karrthik";
		char[]ch=name.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
					break;
				}
			}
		}
	}

	public void pagination() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		int pagecount=0;
		WebElement nextbtn=driver.findElement(By.xpath("//a[@aria-label='Next Page']"));

		List<WebElement> paginationcount=	driver.findElements(By.xpath("//div[@role='navigation']"));
		for(int i=0;i<paginationcount.size();i++)
		{
			List<WebElement>country=driver.findElements(By.xpath("(//table[@role='grid'])[2]//td[1]"));
			for(WebElement countrynames : country)
			{

				String names=	countrynames.getText();
				System.out.println("this is the names in"+names);	
			}
			//Thread.sleep(3000);
			if (pagecount < paginationcount.size()) {
				if(nextbtn.isEnabled())
				{
					nextbtn.click();
					pagecount++;
					System.out.println("the page number" + pagecount);
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("we have reached the last page");
				}
				driver.quit();

			}}


	}

	public void dup() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");

		// Assuming the table has 7 pages. Adjust this value if needed.
		int totalPages = 7; 

		for (int pagecount = 1; pagecount <= totalPages; pagecount++) {
			// Locate country names in the current page and print them
			List<WebElement> country = driver.findElements(By.xpath("(//table[@role='grid'])[2]//td[1]"));
			for (WebElement countrynames : country) {
				String names = countrynames.getText();
				System.out.println("Country name: " + names);
			}

			// Wait briefly for better readability in console output
			Thread.sleep(1000);

			// Navigate to the next page if it's not the last one
			if (pagecount < totalPages) {
				WebElement nextBtn = driver.findElement(By.xpath("//a[@aria-label='Next Page']"));
				if (nextBtn.isEnabled()) {
					nextBtn.click();
					System.out.println("Navigated to page number " + (pagecount + 1));
					Thread.sleep(2000); // Wait for the page to load
				} else {
					System.out.println("No more pages to navigate.");
					break;
				}
			}
		}

		// Close the browser
		driver.quit();
	}
	public void reverse1()
	{
		String name ="Karthik";
		char[] ch=	name.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

	public void fib()
	{
		int a=0,b=1,c;


		for(int i=0;i<=8;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;		
		}
	}

	public void printcountofchar()
	{
		String s = "karthikk";
		char[]ch=	s.toCharArray();
		int count=0;

		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					//System.out.println(ch[i]);
					count++;
				}
			}System.out.println(ch[i] + "= "+count);

			count=0;
		}

	}

	public void extracalphabets()
	{
		String str = "A$mo102L&gaD@aGE";
		//String str1;
		char[] ch=	str.toCharArray();

		StringBuilder str1 = new StringBuilder();

		for(int i=0;i<=ch.length-1;i++)
		{
			if ((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)) 
			{
				str1.append(ch[i]);
			}
		}
		System.out.println(str1);
	}
	public void findlargest()
	{
		int[] n= {20,30,40,10};

		int largest =n[0];
		for(int i=0;i<=n.length-1;i++)
		{
			if(largest<n[i])
			{
				largest=n[i];	
			}
		}System.out.println(largest);

	}
	public void printsecondlargest()
	{
		int[] n= {20,30,40,10,25,38};
		Arrays.sort(n);

		int secondlargest = n[n.length-2];
		System.out.println(secondlargest);

	}
	public void extractnumbersalone()
	{
		String str="sdfvsdf68fsdfsf8999fsdf09";
		String numberOnly= str.replaceAll("[^0-9]", "");
		System.out.println(numberOnly);
	}

	public void extractchar()
	{
		String in = "A$mo102L&gaD@aGE";
		String newIn = in.replaceAll("[^a-zA-Z]", "");
		System.out.println(newIn);
	}

	public void countstringchar()
	{
		String str1="This is a string";
		char[] ch1=	str1.toCharArray();
		int count=0;
		
		for(int i=0;i<=ch1.length-1;i++)
		{
			if(ch1[i] !=' ')
			{
				count++;
			}
			
		}System.out.println(count);
	}
	
	public void countstringcharusingsplit()
	{
		String str1="This is a string";
		String[] split = str1.split(" ");
		StringBuilder str2= new StringBuilder();
		int count=0;
		for(int i=0;i<=split.length-1;i++)
		{
			str2.append(split[i]);
			
		}
		for(int j=0;j<=str2.length()-1;j++)
		{
			count++;
		}
		System.out.println(count);
	}
	
	public void factorial()
	{
	int n=5;
	int n1=1;
	
	for(int i=n;i>0;i--)
	{
		n1=n1*i;
		
	}System.out.println(n1);
}
	public void countnumberofdigits()
	{
		int n=1233;
		int count;
		
		
	}
	
	
	











	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		Seleniumexercises s = new Seleniumexercises();

		//s.getvsnavigate();
		//s.getgooglesuggestion();
		//s.clickgooglesuggestion();
		//s.getciteurls();
		//s.scrolling();
		//s.findunderline();
		//s.linktext();
		//s.table();
		//s.windowhandles();
		//s.wholereverse();
		//s.palindrome();
		//s.handlingalert();
		//s.frames();
		//s.stringreverse();
		//s.selectallcheckbox();
		//s.selectalldropdown();
		//s.looptest();
		//s.headlessmode();
		//s.finduplicate();
		//s.pagination();
		//s.dup();
		//s.reverse1();
		//s.fib();
		//s.printcountofchar();
		//s.extracalphabets();
		//s.findlargest();
		//s.printsecondlargest();
		//s.extractnumbersalone();
		//s.extractchar();
		//s.countstringchar();
		//s.countstringcharusingsplit();
		//s.factorial();
		






	}

}
