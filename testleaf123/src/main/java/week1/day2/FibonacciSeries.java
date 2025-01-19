package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1; 
		int sum;
		
		for (int i=0;i<8;i++) //0 1 1 2 3 5 8 13
		{
			
			sum =n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;	
		}
		
}
}