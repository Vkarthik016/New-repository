package week8.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingException {
	
	public void ex()
	{
		try {
			System.out.println("this is try block");
			System.out.println("d");
			throw new Exception();
			
		} catch ( Exception e) {
			System.out.println("this is catch block");
		}finally {
			System.out.println("this is finally block");
		}
	
	}

	public static void main(String[] args) {

		int a =3;
		int b= 3;
		int c ;
		
		try {
			System.out.println(c=a/b);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("issue here");
		}
		HandlingException hd = new HandlingException();
		hd.ex();
		}
	
	
		
	}

		
	

