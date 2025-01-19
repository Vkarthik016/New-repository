package collections;

public class Stringop {
	
	public static void reversethewordswithdot()
	{
		String S = "i.like.this.program.very.much";
		String[]splitwords=	S.split("\\.");
		for(int i=splitwords.length-1;i>=0;i--)
		{
			System.out.print(splitwords[i]);
			if(i>0)
			{
				System.out.print(".");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reversethewordswithdot();
		
		

	}

}
