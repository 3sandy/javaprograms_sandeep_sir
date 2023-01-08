package String_programs;

public class Count_the_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Learn Java";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
System.out.println("count of characters "+count);
	}

}
