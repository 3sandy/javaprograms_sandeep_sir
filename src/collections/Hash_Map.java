package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		HashMap <String,Integer> t=new HashMap();
		t.put("rana", 001);
		t.put("venkateh", 005);
		t.put("prabhas", 006);
		t.put("akhil", 010);
		t.put("NTR", 100);
		t.put("rana", 1000);
		t.put(null, 2500);
		t.put(null, null);
		t.put("raja", null);
	
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
//		
//		Iterator i=es.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}

		
		
		
		for(Entry<String,Integer> eSet:es)
		{
			System.out.println(eSet.getKey()+"=="+eSet.getValue());
		}
		
		
		t.remove("raja");
		System.out.println();
	}

}
