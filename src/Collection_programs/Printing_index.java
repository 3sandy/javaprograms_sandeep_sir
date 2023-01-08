package Collection_programs;

import java.util.LinkedHashSet;

public class Printing_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="testyantra";
		
		LinkedHashSet l=new LinkedHashSet ();
		
		for(int i=0;i<s.length();i++)
		{
			l.add(s.charAt(i));
		}
		
		System.out.println(l);
		
		for(Object ch:l)
		{
		for(int i=0;i<s.length();i++)
		{
			
			if(ch.equals(s.charAt(i)))
			{
				System.out.println(ch+" position is"+i);
				break;
			}
		}
	}

}}
