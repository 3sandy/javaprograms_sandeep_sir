package collections;

import java.util.Iterator;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack l=new Stack<>();
		
		l.push("ratnadeep");
		l.push("sandeep");
		l.push("subham");
		l.push("shubham");
		l.push(null);
		
		System.out.println(l);
		System.out.println(l.peek());
	      System.out.println(l.pop());
			System.out.println(l.peek());
			System.out.println(l.pop());
			
			System.out.println(l);
			
			Iterator i=l.iterator();
while(i.hasNext())
{
	System.out.println(l.pop());
}


System.out.println(l);
	}

}
