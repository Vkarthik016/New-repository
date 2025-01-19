
	package week5.day2;

	import java.io.IOException;
	import java.time.Duration;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;

	public class Newxlsheet {

	    private ChromeDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }

	    @DataProvider(name = "getData")
	    public static String[][] dataProvider() throws IOException {
	        return xlsheet();
	    }

	    public static String[][] xlsheet() throws IOException {
	        try (XSSFWorkbook wb = new XSSFWorkbook("./testdata/testbook.xlsx")) {
	            XSSFSheet sheetAt = wb.getSheetAt(0);
	            int rowcount = sheetAt.getLastRowNum();
	            int cellcount = sheetAt.getRow(0).getLastCellNum();

	            String[][] data = new String[rowcount][cellcount];

	            for (int i = 1; i <= rowcount; i++) {
	                for (int j = 0; j < cellcount; j++) {
	                    data[i-1][j] = sheetAt.getRow(i).getCell(j).getStringCellValue();
	                }
	            }
	            return data;
	        }
	    }

	    @Test(dataProvider = "getData")
	    public void createLead(String fname, String email, String address, String city, String zip, String state,
	                           String expyear, String cvv, String expmonth, String ccnum, String cname) {
	        driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
	        driver.switchTo().frame(1);
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
	    }
	}


