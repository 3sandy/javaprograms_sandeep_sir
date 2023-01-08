package normal_java_programs;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=153,result=0,rem;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			result=result+(rem*rem*rem);
		}
		
		if(result==temp)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}
	}

}
