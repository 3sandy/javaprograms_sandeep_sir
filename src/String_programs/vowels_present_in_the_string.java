package String_programs;

public class vowels_present_in_the_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="TestYantra";
		String s1=s.toLowerCase();
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
			System.out.println(s1.charAt(i));
			}
		}
		
		
	}

}
