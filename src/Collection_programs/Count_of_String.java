package Collection_programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Count_of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="india";
		
		LinkedHashSet l=new LinkedHashSet();
		
		for(int i=0;i<s.length();i++)
		{
			l.add(s.charAt(i));
		}
		
		System.out.println(l);
		
		for(Object list:l)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(list.equals(s.charAt(i)))
				{
					count ++;
				}
				
		}
			
			if(count<2)
			{
			System.out.println(list+"="+count);
		}
		
		
	}
	

}}
