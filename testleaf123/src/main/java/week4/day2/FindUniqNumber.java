package week4.day2;

public class FindUniqNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {4,1,2,1,2};
		int unique=0;
		for (int i = 0; i < num.length; i++) {
			
					unique ^=num[i];
					
				}
				System.out.println(unique);
				
				
			}
			
		}

	


