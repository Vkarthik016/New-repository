package week1.day2;

public class Browser {
	
	public String launchBrowser(String browsername)
	{
	return browsername;
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser b= new Browser();
		b.loadUrl();
		String browser =b.launchBrowser("chrome");
		System.out.println(browser);
	
		

	}

}
