package week5.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class W3Schools {
	ChromeDriver driver;
	@BeforeMethod
	public void prestep()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		driver.switchTo().frame(1);
	}
	@AfterMethod
	public void poststep()
	{
		driver.close();
	}
	
	public  static String[][] xlsheet() throws IOException
	{
		XSSFWorkbook wb= new XSSFWorkbook("./testdata/testbook.xlsx");
		XSSFSheet sheetAt = wb.getSheetAt(1);
		int rowcount = sheetAt.getLastRowNum();
		int cellcount = sheetAt.getRow(1).getLastCellNum();
		
		String[][] data= new String[rowcount][cellcount];
		
		for (int i = 1; i <= rowcount; i++) {
			
			for (int j = 0; j < cellcount; j++) {
				
				String stringCellValue = sheetAt.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;
			}
			
		}
		wb.close();
		return data;
		
	}
	@DataProvider(name="getdata")
	public String[][] dataprovider() throws IOException
	{
		return W3Schools.xlsheet();
		
	}
	
	
@Test(dataProvider ="getdata")
		public void createlead(String fname,String email,String address,String city, String zip, String state,
				String expyear,String cvv, String expmonth, String ccnum, String cname){
	
		
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("adr")).sendKeys(address);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("zip")).sendKeys(zip);
		driver.findElement(By.id("state")).sendKeys(state);
		driver.findElement(By.id("expyear")).sendKeys(expyear);
		driver.findElement(By.id("cvv")).sendKeys(cvv);
		driver.findElement(By.id("expmonth")).sendKeys(expmonth);
		driver.findElement(By.id("ccnum")).sendKeys(ccnum);
		driver.findElement(By.id("cname")).sendKeys(cname);
		//driver.close();

	}

}
