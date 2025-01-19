package week1.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefox {
	
	protected WebDriver driver;
	
	public void base() {
		 driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/java/ref_string_split.asp");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float browserVersion= 100.2f;
		String browserName= "firefox";
		boolean isVisible= true;
		int releaseYear= 1998;
		char browserLogo= 'f';
		System.out.println(browserVersion+"\n"+browserName+"\n"+
				isVisible +"\n"+ releaseYear +"\n"+ browserLogo);

	}

}
