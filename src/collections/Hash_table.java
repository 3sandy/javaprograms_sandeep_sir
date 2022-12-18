package collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable <String,Integer> t=new Hashtable();
		
		t.put("rana", 001);
		t.put("venkateh", 005);
		t.put("prabhas", 006);
		t.put("akhil", 010);
		t.put("NTR", 100);
		t.put("rana", 1000);
		
		
		System.out.println(t);
		
		Set<String> ks=t.keySet();
		for(String KSet:ks)
		{
			System.out.println(KSet);
		}
		
		Collection<Integer> v=t.values();
		for(Integer val:v)
		{
			System.out.println(v);
		}
		Set<Entry<String,Integer>> es=t.entrySet();
		
		Iterator i=es.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
