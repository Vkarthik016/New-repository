package week1.day2;

public class FindUniqNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {3,3,5,4,4};
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;j++)
			{
				//System.out.println("num[i]" + num[i]+" num[j]"+num[j]);

				if(num[i]!=num[j])
				
				{
					System.out.println("this is unique" + num[i]);
					break;
				}
			}
		}

	}

}
