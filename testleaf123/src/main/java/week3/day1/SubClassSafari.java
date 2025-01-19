package week3.day1;

import net.bytebuddy.pool.TypePool.Default.ReaderMode;

public class SubClassSafari extends Browser{
	public void readerMode()
	{
		System.out.println("readermode from safari");
	}
	public void fullScreenMode()
	{
		System.out.println("fullscreen mode from safari");
	}
	
	public static void main(String[] args)
	{
		SubClassSafari safari = new SubClassSafari();
		safari.openURL();
		safari.closeBrowser();
		safari.navigateBack();
		
	}

}
