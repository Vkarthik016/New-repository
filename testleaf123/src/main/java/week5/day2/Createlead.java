package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Createlead extends ProjectSpecificMethod {
	@DataProvider(name="testdata")
	public String[][] fetchdata()
	{
		String [][]data = new String[3][3];
		data[0][0]="rev";
		data[0][1]="karthik";
		data[0][2]="v";
		
		data[1][0]="rev1";
		data[1][1]="karthik 1";
		data[1][2]="v 1";
		
		data[2][0]="rev1";
		data[2][1]="ravi";
		data[2][2]="n";
		return data;
	}
	
	
	@Test(dataProvider = "testdata")
	public void createlead(String cname,String fname,String lname)
	{
		
			driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
	}
	

}
