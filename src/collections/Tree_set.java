package collections;

import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet s=new TreeSet<>();
				
		s.add(5);
		s.add(9);
		s.add(1);
		s.add(10);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.pollFirst());
		System.out.println(s.pollLast());
		System.out.println(s);

		
	}

}
