package week1.day2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Practice {
	public void duplicate()
	{
		int[]num ={1,3,8,3,11,5,6,4,7,6,7};
		Arrays.sort(num);
		for(int i=0;i<num.length-1;i++)
		{

			if(num[i]==num[i+1])
			
			{
				System.out.println(num[i]);
			}
		}
		
	}
	public void fibonacci()
	{
		int n1=0,n2=1,n3;
		
		for(int i=0;i<10;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
	public void maxmin()
	{
     int[] num={1, 45, 77, 88, 33, 23, 4};
     Arrays.sort(num);
     
     System.out.println("Minimum number in Array "+num[0]);
		System.out.println("Maximum number in Array "+num[num.length-1]);
	}
	
	public void reverse()
	{
		String name="Karthik";
//		int i;
//		char[] cs = name.toCharArray();
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
			
		}
	}
	public void findsecondlargest()
	{
		int[] data = {3,2,11,4,6,7,13};
		Arrays.sort(data);
		System.out.println(data[data.length-2]);
	}
	public void intersection()
	{int arr1[]= {3,2,11,4,6,7};
	int arr2[]= {1,2,8,4,5,7};
	
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr1.length;j++)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.println(arr1[i]);
			}
		}
	}
	}
	public void partiallinktext()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("eWallet")).click();
		WebElement ewallet = driver.findElement(By.linkText("IRCTC eWallet"));
        ewallet.click();
//		System.out.println("the linktext is" + text);
	}
	@Test
	public void tablexpath()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> country = driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
		boolean country1= false;
		for (WebElement ele : country) {	
			String allcountries = ele.getText();
			//System.out.println(allcountries);
			
			if(allcountries.contains("Island Trading"))
			{
				System.out.println("country is present");
				
			}
			else
			{
				System.out.println("no country");
			}
		}

		

				
	}
	public void testleaftable() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		Thread.sleep(4000);
		List<WebElement> tablenames = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr//td[2]"));
		
		//boolean name=false;
		for (WebElement ele1 : tablenames) {
			String text1 = ele1.getText();
			//System.out.println(text1);
			
			if(text1.contains("Russia"))
			{
				System.out.println(text1);
				break;
			}	
		}
	}
	
	public void stringreverse()
	{
		String str ="karthik";
		
		
		for(int i=str.length()-1;i<0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
	}
	public void sumoftwo()
	{
		int nums[]={2,7,11,15};
		int target=22;

		for(int i=0;i<=nums.length-1;i++)
		{
		    for(int j=i+1;j<=nums.length-1;j++)
		    {
		        if(nums[i]+nums[j]==target)
		        {
		            System.out.println(i +","+ j );
		        }
		       

	}
		}
		}
	public void largestnum()
	{
		int n[]= {8,60,11,51,12,20,24,100};
		
		int largest= n[0];
		
		for(int i=0;i<=n.length-1;i++)
		{
			if(largest<	n[i])
			{
				largest=n[i];
			}
		}System.out.println(largest);
		
		
	}
	
	public void printnewline()
	{
		String s = "i love uuuu";
		String[] split = s.split(" ");
		
		for(int i=0;i<=split.length-1;i++)
		{
			System.out.println(split[i]);
		}
		
		
		String[]s2={"i", "hate", "you"};
		for(int i=0;i<=s2.length-1;i++)
		{
			System.out.println(s2[i]);
		}
		
		}
	
	public static void fib()
	{
		int n1=0,n2=1,sum;
		
		for(int i=0;i<6;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}
	
	public static void sringreverse()
	{
		String s3= "string";
		StringBuffer sb = new StringBuffer(s3);
	System.out.println(sb.reverse());	
		System.out.println(sb);
	}
	
	public void numberduplicate()
	{
		
		int[]num ={1,3,8,3,11,5,4,7,6,7,6};
		int count=0;
		Arrays.sort(num);
		//System.out.println(num);
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=i+1;j<num.length-1;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(num[i]);
				}
				
			}
		}
		
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
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Practice p= new Practice();
		//p.duplicate();
		p.fibonacci();
		//p.maxmin();
		//p.reverse();
		//p.findsecondlargest();
		//p.intersection();
		//p.partiallinktext();
		//p.tablexpath();
		//p.testleaftable();
		//p.stringreverse();
		//p.largestnum();
		//p.printnewline();
		//fib();
		//sringreverse();
		//p.numberduplicate();
		//p.findlargest();
		//p.printsecondlargest();
		
		
		
	}}
		

	

