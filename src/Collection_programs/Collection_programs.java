package Collection_programs;
import java.util.LinkedHashSet;

public class Collection_programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="abcdabcdabcdabcd";
		
		char s1[]=s.toCharArray();
		
		LinkedHashSet<Character> b=new LinkedHashSet<>();
		for(int i=0;i<s1.length;i++)
		{
			b.add(s1[i]);
		}
		
		System.out.println(b);
		
		for(Character list:b)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(list.equals(s.charAt(i)))
				{
					count ++;
				}
				
			}
			if(count>1)
			{
			System.out.println(list+"="+count);
		}
		
		
	}
	}}

