package Collection_programs;
import java.util.LinkedHashSet;

public class Collection_prog_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="india";
		int vowelcount=0;
		char s1[]=s.toCharArray();
		
		LinkedHashSet<Character> b=new LinkedHashSet<>();
		for(int i=0;i<s1.length;i++)
		{
			b.add(s1[i]);
		}
		
		System.out.println(b);
		
		for(Character list:b)
		{
			
				if(list=='a'||list=='e'||list=='i'||list=='o'||list=='u')
				{
					vowelcount++;
				}
				
			
		}
		System.out.println(s+" "+vowelcount);

	}

}
