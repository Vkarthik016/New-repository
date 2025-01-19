package week3.day1;

public class OverLoading {
	public void reportStep(String msg, String status)
	{
		System.out.println(msg +" "+" "+status);
	}
	public void reportStep(String msg,String status, boolean snap)
	{
		System.out.println(msg +" "+ status +" "+ snap);
	}
	public static void main(String[] args)
	{
		OverLoading ol = new OverLoading();
		ol.reportStep("Hi am first version", "status is pending");
		ol.reportStep("Hi am second version", "status is approved", true);
		
		
	}
	

}
