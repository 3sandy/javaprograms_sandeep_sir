package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue l=new PriorityQueue<>();
		l.offer(23);
		l.offer(12);
		l.offer(26);
		l.offer(27);
		l.offer(32);
		
		System.out.println(l);
		
		System.out.println(l.peek());
		
		
		Iterator i=l.iterator();
		System.out.println("Removed Elements are");
		
		while(i.hasNext())
		{
			System.out.println(l.poll());
		}

		
		
	}

}
