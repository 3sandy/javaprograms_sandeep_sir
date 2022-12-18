package String_programs;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="TestYantra";
		char[] ch=s.toCharArray();
		
		int count1=0;
		int count2=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				count1 ++;
			}
			else(ch[i]=='e')
			{
				count2 ++;
			}
		}
	}

}
