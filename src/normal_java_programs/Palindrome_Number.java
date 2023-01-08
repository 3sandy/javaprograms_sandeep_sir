package normal_java_programs;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int rem,sum=0,temp;
		int num=252;
		temp=num;
		while(num>0)
		{
			
			rem=num%10;
			num=num/10;
			sum=(sum*10)+rem;
			
			
		}
			if(temp==sum)
			{
				System.out.println("palindrome number");
			}
			else {
				System.out.println("not a palindrome number");
			}
		
	}

}
