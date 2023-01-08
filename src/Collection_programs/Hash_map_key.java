package Collection_programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_map_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="tester";
		char ch[]=s.toCharArray();
		HashMap< Character,Integer> h=new HashMap();
		
		for(int i=0;i<ch.length;i++)
		{
			if(h.containsKey(ch[i])==false)
					{
				h.put(ch[i], 1);
					}
			
			else {
				int oldvalue=h.get(ch[i]);
				int newvalue=oldvalue+1;
				h.put(ch[i], newvalue);
			}
		}
		Set<Character> b = h.keySet();
		 Collection<Integer> a = h.values();
		System.out.println(b);
		System.out.println(h);
		System.out.println(a);
		
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		for(Entry<Character, Integer> es:h.entrySet())
		{
			System.out.println(es.getKey()+"=="+es.getValue());
		}
	}

}
