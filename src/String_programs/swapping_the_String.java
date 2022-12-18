package String_programs;

public class swapping_the_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//swapping first and last character
		String s="i am hyderabad";
		String []ab=s.split(" ");
		String temp=ab[0];
		ab[0]=ab[ab.length-1];
		ab[ab.length-1]=temp;
		
		for(int i=0;i<ab.length;i++)
		{
			System.out.print(ab[i]+" ");
		}
		
		
	}

}
