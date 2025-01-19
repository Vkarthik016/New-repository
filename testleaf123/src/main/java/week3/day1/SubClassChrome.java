package week3.day1;

public class SubClassChrome extends Browser {

	public void openURL()
	{
		System.out.println("https://www.abhibus.com/");
	}
	public void closeBrowser()
	{
		System.out.println("close browser from sub class");	
	}
	public static void main(String[] args)
	{
		SubClassChrome chrome= new SubClassChrome();
		chrome.openURL();
		chrome.closeBrowser();
	}

}
