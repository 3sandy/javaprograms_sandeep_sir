package collections;

import java.util.ArrayList;

public class For_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <Integer> l=new ArrayList();
		
		l.add(2);
		l.add(null);
		l.add(65);
		
		System.out.println(l);
		
		System.out.println("Using for each loop");
		
		for(Integer list:l)
		{
			System.out.println(list);
		}
		
		System.out.println("Using for loop");
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(lis);
		}
		
		
	}

}
