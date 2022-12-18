package String_programs;

public class Swapping_a_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="a%@hc&jf";
		char ch[]=s.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]=='a')
			{
				ch[i]='c';
				
			}
				
				for(int j=0;j<s.length();j++)

				{
					
					if(ch[j]=='')
					{
						
						ch[j]='a';
					}
				}
			
			}
			
			
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
	}

}
