package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Linked_list_implements_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue l=new LinkedList<>();
		
		l.offer(23);
		l.offer(12);
		l.offer(6);
		l.offer(5);
     System.out.println(l);

System.out.println(l.peek());

Iterator i=l.iterator();
System.out.println("RemovedElements are");
while(i.hasNext())
{
	System.out.println(l.poll());
}

	     
	}

}
