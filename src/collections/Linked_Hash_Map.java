package collections;

import java.util.LinkedHashMap;

public class Linked_Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashMap <String,Integer> t=new LinkedHashMap();
		
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
		
			}

}
