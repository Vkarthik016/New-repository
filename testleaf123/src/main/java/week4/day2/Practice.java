package week4.day2;

public class Practice {
	int size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s = "ababcbabaabaab";
		 int len =s.length();
		String[] split1 = s.split("ab");
	    int size;
		String emp;
		for (int i = 0; i < split1.length; i++) {
			emp=split1[i];
			System.out.println(emp);
		
			size=emp.length();
			System.out.println(size);
			int	fin =len-size;
			System.out.println(fin);
			int last=fin/2;
			System.out.println("finalcount"+last);
			break;
			
		}
	
		
		
		
				}
			
			
		}

		
		


