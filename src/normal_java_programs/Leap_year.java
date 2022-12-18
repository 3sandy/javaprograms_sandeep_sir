package normal_java_programs;
import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("input year");
		
		int n=sc.nextInt();
	
		boolean iseven=false;
		
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
				{					iseven=true;

				}
				else {
					
					iseven=false;
				}
			}
			
			else
			{
				iseven=true;
			}
		}
		if(iseven==true)
		{
			System.out.println(n+" is a leap year");
		}
		else {
			System.out.println(n+" is not a leap year");

		}
	}}

