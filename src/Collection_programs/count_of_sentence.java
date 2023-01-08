package Collection_programs;

import java.util.LinkedHashSet;

public class count_of_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="welcome to india welcome to tyss";
		
		String[] str=s.split(" ");	
		
		LinkedHashSet <String> l=new LinkedHashSet<>();
		
		
		for(int i=0;i<str.length;i++)
		{
			l.add(str[i]);
		}
		
		System.out.println(l);
				
		for(String strin:l)
		{
			int count =0;
			for(int i=0;i<str.length;i++)
			{
				if(strin.equals(str[i]))
				{
				count++;
			}
			
		}
			
			
			if(count>=2)
			System.out.println(strin+"="+count);
					
	}
		

}}
