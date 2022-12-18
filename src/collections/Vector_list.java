package collections;

import java.util.Vector;

public class Vector_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector l=new Vector();
		
		l.add("sandeep");
		l.add("subham");
		l.add("ratnadeep");
		
		System.out.println(l);
		
		System.out.println(l.elementAt(0));
		System.out.println(l.firstElement());
		System.out.println(l.lastElement());
	
		l.removeElement(23);
		System.out.println(l);
		l.removeAllElements();
		System.out.println(l);


}}
