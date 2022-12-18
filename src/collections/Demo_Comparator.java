package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo_Comparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
          if(i1>i2)
          {
        	  return -1;
          }
          else if(i1<i2)
          {
        	  return 1;
          }
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a=new ArrayList();
		
      a.add(25);
       a.add(1);
       a.add(63);
       a.add(100);
       Demo_Comparator b=new Demo_Comparator();
   	Collections.sort(a, b);
	
	System.out.println(a);
	for(Object list:a)
	{
		System.out.println(list);
	}
	
     
	}

	

}
