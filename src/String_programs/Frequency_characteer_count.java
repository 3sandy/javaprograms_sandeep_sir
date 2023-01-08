package String_programs;

public class Frequency_characteer_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabccdddaa";
		char[] ch=s.toCharArray();
		
		
		
		for(int i=0;i<ch.length;i++)
		{
			
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
			
			if(ch[i]==ch[j])
			{
				count ++;
				i++;
			}
			
			else 
			{
              break;			
            }
					
		}
		
			System.out.println(ch[i]+" "+count+" ");
	}
	}
}
