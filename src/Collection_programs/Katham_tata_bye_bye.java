package Collection_programs;

import java.util.LinkedHashSet;

public class Katham_tata_bye_bye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="katham ta ta bye bye";
        
        String s1[]=s.split(" ");
LinkedHashSet <String> l=new LinkedHashSet<>();
		
		
		for(int i=0;i<s1.length;i++)
		{
			l.add(s1[i]);
		}	
		System.out.println(l);
	
	for(String ch:l)
	{
		for(int i=0;i<s1.length;i++) {
			
			if(ch.equals(s1[i]))
			{
				System.out.println(ch+" position is "+(i+1));
				break;
			}
		}
	}
	
	}

}
