package collections;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList l=new ArrayList();
		
		System.out.println(l.isEmpty());
		
		l.add("s");
		l.add(2);
		l.add(0,true);
		l.add(null);
		l.add(true);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		
//		ArrayList a=new ArrayList<>(l);
//		a.add(67);
//		
//		System.out.println(a);

		ArrayList a=new ArrayList<>();
		a.add(67);
		a.add(l);
		a.addAll(l);
		
	//	boolean re=a.removeAll(l);//remove all the objects present in the array list
	
		boolean re=a.retainAll(i);//retainAll will retains whicha are similar
		System.out.println(re);
		
		ArrayList a2=new ArrayList ();
		
		a2.addAll(0,a);
		a2.add(l);
		a2.add(26);
		System.out.println(a2);
				l.add(2);
				l.add(null);
				System.out.println(l);
				System.out.println(l.indexOf(true));
				System.out.println(l.lastIndexOf(true));
				System.out.println(l.get(2));
				System.out.println(l.get(0));
				l.set(2, false);
			
	}

}

