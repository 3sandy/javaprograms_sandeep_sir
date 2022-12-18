package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_list_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> l=new ArrayList();
		
		l.add(2);
		l.add(null);
		l.add(65);
		l.add(31);
		l.add(56);
		
		Iterator i=l.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
		ListIterator i1=l.listIterator();
		
		System.out.println("forward direction");

		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("backward direction");
		
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
	
//        while(i1.hasNext())
//        {
//        	Object obj=i1.next();
//        	
//        	if(obj.equals(65))
//        	{
//        		i.remove();
//        		System.out.println("65 has been removed");
//        		break;
//        	}
//        }
//		
//		System.out.println(l);
//	
		ListIterator<Integer> a=l.listIterator();
		
        while(a.hasNext())
          {
          	Integ obj=a.next();
          	
          	if(obj.equals(65))
          	{
          		i.remove();
          		System.out.println("65 has been removed");
          		break;
          	}
          }
  		
  		System.out.println(l);
	
	}

}
