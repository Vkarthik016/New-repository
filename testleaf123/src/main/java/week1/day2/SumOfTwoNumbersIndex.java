package week1.day2;

public class SumOfTwoNumbersIndex {

	public static void main(String[] args) {
		
		int nums[]= {2,7,11,15};
		int target=21;
		
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					System.out.println(i +","+ j);
					break;
				}
			}
		}
		

	}

}
