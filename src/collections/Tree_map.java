package collections;

import java.util.Collection;
import java.util.NavigableSet;
import java.util.TreeMap;

public class Tree_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap <Integer,String> t=new TreeMap<>();
		
		t.put(12,"s");
		t.put(2, "a");
		t.put(6, null);
		t.put(8, "r");
		t.put(4, "d");
		
		System.out.println(t);
		
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.tailMap(4));
		System.out.println(t.headMap(4));
		
		
		NavigableSet<Integer> dsk =t.descendingKeySet();
		
		for(Integer dSet:dsk)
		{
			System.out.println(dSet);
		}
		
		System.out.println(t.descendingMap());
		
	     Collection<String> dks=t.descendingMap().values();
	     for(String dValues:dks)
	     {
	    	 System.out.println(dValues);
	     }
	     
	     
		}

}
