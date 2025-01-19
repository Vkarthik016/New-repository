package collections;

import org.testng.annotations.Test;

public class Testngpriotitycheck {
	
	@Test(priority = -1)
	public void tc1()
	{
	System.out.println("am onerandom");	
	}
	@Test(priority = 1)
	public void tc12()
	{
	System.out.println("am tworandom");	
	}
	@Test
	public void tc3()
	{
	System.out.println("am threerandom");	
	}
	

}
