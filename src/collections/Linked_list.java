package collections;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList l=new LinkedList();
		
		l.add("sandeep");
		l.add("subham");
		l.add("ratnadeep");
		
		LinkedList l1=new LinkedList<>(l);

		l1.add("TestYantra");
		
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.removeFirst());
		System.out.println(l1.removeLast());
		l1.addFirst("subham");
		l1.addFirst("ratnadeep");
		System.out.println(l1);
		l1.add(3,"sanjay");
		System.out.println(l1);




		
	}

}
