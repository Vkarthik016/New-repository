package week3.day1;

public class SubclassEdge extends Browser{
	public void takeSnap()
	{
		System.out.println("take snap from edge browser");
	}
	public void clearCookies()
	{
		System.out.println("clear cookies from edge browser");
	}
	
	public static void main(String[] args){
		
		SubclassEdge edge= new SubclassEdge();
		edge.openURL();
		edge.closeBrowser();
		edge.navigateBack();
		
	}

}
