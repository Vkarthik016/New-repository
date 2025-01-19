package week1.day1;

import java.sql.Driver;

public class HelloTestLeaf extends Firefox {
	
	public  void base()
	{
		super.base();
		
		driver.manage().window().maximize();
	}
	
	
	public void reverse()
	{
	
	}
	
	public static void main(String[] args) {
		
		HelloTestLeaf hf= new HelloTestLeaf();
		hf.base();
		
		
		float b=12.3f;
		
		//System.out.println("Welcome to Testleaf");
		String s= "malayalam";
		//System.out.println(s.length());
		char[] charArray = s.toCharArray();
		StringBuilder s2 = new StringBuilder();
		
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			s2.append(charArray[i]);
			
		}
		System.out.println(s2);
		
		if(s.equals(s2)) {
			System.out.println("its a palindrome");
			
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		
		
		
		
		
		String s1="hay how are you";
		String[] split1 = s1.split(" ");
		
		for(int i=0;i<split1.length;i++)
		{
			System.out.print(split1[i]);
		}
		
		
		int nums[]={2,7,11,15};
		int target=9;

		for(int i=0;i<=nums.length-1;i++)
		{
		    for(int j=i+1;j<=nums.length-1;j++)
		    {
		        if(nums[i]+nums[j]==target)
		        {
		            System.out.println(i +"+"+ j );
		        }
		    }
		}


		}
		
	}


