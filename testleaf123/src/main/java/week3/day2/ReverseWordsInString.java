package week3.day2;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test ="I am a software tester";
		String[] test1 = test.split(" ");
		
		for (int i = test1.length-1; i >=0; i--) {
					
			{
				//if(i%2!=0)
				{
					System.out.print(test1[i]);
				}
			}
			
			
		}

	}

}
