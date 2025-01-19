package week3.day2;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String str = "We learn Java basics as part of java We sessions in java week1";
		String[] split1 = str.split(" ");
		for (int i = 0; i<split1.length-1; i++) {
			{
				for (int j =i+1; j<split1.length-1; j++) {
					if(split1[i].equals(split1[j]))
					{
						System.out.println(split1[i]);
					}
					
				}
			}
			
		}
		

	}

}
