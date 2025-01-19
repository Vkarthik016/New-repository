package week3.day1;

public class Browser {
	
	String browsername,browserVersion;
	
	public void openURL()
	{
		System.out.println("https://platform.testleaf.com/#/");
	}
	public void closeBrowser()
	{
		System.out.println("close browser from superclass");
	}
	public void navigateBack()
	{
		System.out.println("navigate browser from superclass");
	}

}
