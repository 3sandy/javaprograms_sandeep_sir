package String_programs;

public class Reverse_without_leengthAndExtra_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbbcccder";
		String s2="";
		char[] ch=s.toCharArray();
		
		int count=0;
		
		for(char c:ch)
		{
			count++;
		}
		
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(ch[i]+" ");
		}
	}

}
