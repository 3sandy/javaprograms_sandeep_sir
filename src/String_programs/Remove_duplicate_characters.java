package String_programs;

public class Remove_duplicate_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aabbbcccder";
		String s2="";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char charr=ch[i];
			if(s2.indexOf(charr)==-1)
			{
				s2=s2+charr;
			}
			
		}
		
		
		System.out.println(s2);
		
	}

}
