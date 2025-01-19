package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page.GetAppManifestResponse;

public class FBTagnameSortedOrder {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> Fbtag = driver.findElements(By.tagName("a"));
		List<String>  newname=new ArrayList<String>();
				
		for(int i=0;i<Fbtag.size();i++)
		{
			newname.add(Fbtag.get(i).getText());
			
		}
		Collections.sort(newname);
		for(int j=0;j<newname.size();j++)
		{
			System.out.println(newname.get(j));
		}

	}
}

