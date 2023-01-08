package String_programs;

public class Revese_without_using_third_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aabbbcccder";
		String s2="";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}

}
