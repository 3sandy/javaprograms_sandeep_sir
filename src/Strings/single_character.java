package Strings;

public class single_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="ratnadeep";
		System.out.println(s.charAt(6));
		
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]+" ");
		}
	}

}
