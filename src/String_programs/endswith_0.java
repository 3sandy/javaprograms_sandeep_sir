package String_programs;

public class endswith_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello who are you";
		
		String []word=s.split(" ");
		
		String s2="";
		for(int i=0;i<word.length;i++)
		{
			s2=word[i];
			
//			if(s2.contains("o"))
//			{
//				System.out.println(s2);
//			}
			
			if(s2.endsWith("o"))
			{				
				System.out.println(s2);	
				}
		}
		
	}

}
