package Collection_programs;

import java.util.LinkedHashSet;

public class Position_of_unique_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="testyantra";
		
		LinkedHashSet H=new LinkedHashSet();
		
		for(int i=0;i<s.length();i++)
		{
			H.add(s.charAt(i));
		}
		
		for(Object list:H)
		{
			for(int i=0;i<s.length();i++)
			{
				if(list.equals(s.charAt(i)))
				{
					System.out.println(list+" position of char "+i);
				}
			}
		}
	}

}
