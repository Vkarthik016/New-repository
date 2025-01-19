package demolistners;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {

	
	protected  WebDriver driver;

	public  void iframe()
	{
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert al=	driver.switchTo().alert();
		al.accept();
		String text1=	driver.findElement(By.id("demo")).getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
	}

	public void dropdown()
	{
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement tool	=driver.findElement(By.className("ui-selectonemenu"));
		Select s= new Select(tool);
		s.selectByIndex(1);

	}

	public void jsex()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;

	}

	public void draganddrop()
	{
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement drag=  driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement drop = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		//action.
		WebElement text =	driver.findElement(By.xpath("(//span[text()='Droppable Target']//following::div)[1]"));
		String text1=	text.getText();
		String actual="Dropped!";
		Assert.assertEquals(text1, actual);		




	}

	public void webtable()
	{
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		List<WebElement>country =driver.findElements(By.xpath("(//table[@role='grid'])[2]//td[2]"));
		List<String> newsort = new ArrayList<String>();

		//		for (WebElement string : country) {
		//		newsort.add(string.getText());	
		//		}
		//		
		for(int i=0;i<=country.size()-1;i++)
		{
			newsort.add(country.get(i).getText());
		}
		Collections.sort(newsort);
		for (String string : newsort) {
			System.out.println(string);
		}




	}

	public void linkandpartial()
	{
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().timeouts().implicitlyWait(null);
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='ui-link ui-widget'])[1]"));
		findElement.click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Find the")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		//driver.findElement(By.xpath("(//a[@class='ui-link ui-widget'])[1]")).click();
		findElement.click();
	}

	public void countalphabets()
	{
		String s="karthik";
		int count=0;

		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}System.out.println(s.charAt(i) +"= "+count);
			count=0;

		}
	}

	public void repeat()
	{
		String s ="karthikk";
		char[] ch = s.toCharArray();
		//char target;
		int count=0;
		for (int i=0;i<ch.length;i++)
		{	
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}System.out.println(ch[i] + "-"+ count);
			count =0;
		}

	}

	public void printweird()
	{
		int n=18;

		if(n%2!=0)
		{
			System.out.println("weird");
		}
		else if((n%2==0) && (n>=2) && (n<=5))
		{
			System.out.println("not weird");
		}
		else if((n%2==0) && (n>=6) && (n<=20))
		{
			System.out.println("weird");
		}
		else if((n%2==0) &&(n>20))
		{
			System.out.println("not weird");
		}


	}
	public void twotable()
	{
		int n=2;
		n=3;
		for(int i=0;i<10;i++)
		{
			int n2= n*i;
			System.out.println(n+"x"+i+"="+n2);
		}



	}
	public void anagram(String s1, String s2)
	{
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(ch1.length==ch2.length)
		{
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("anagram");
				System.out.println(ch1);
				System.out.println(ch2);
			}
			else
			{
				System.out.println("not");
				System.out.println(ch1);
				System.out.println(ch2);
			
			}
		}
		else
		{
			System.out.println("length is missing"); 
		
		}
	

			}
	
	public void addition()
	{
//		static int a=20;
//		int b=a+b;
//		
//		System.out.println(b);
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice p = new Practice();
		//p.iframe();
		//p.dropdown();
		//p.draganddrop();
		//p.webtable();
		//p.linkandpartial();
		//p.countalphabets();
		p.repeat();
		//p.printweird();
		//p.twotable();
		//p.anagram("karr ","karr ");




	}

}
