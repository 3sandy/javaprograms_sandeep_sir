package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_Comparable_ implements Comparable{

	int age;
	String name;
	
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Demo_Comparable_ k=(Demo_Comparable_)o;
		
		if(k.name.compareTo(name)<0)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	@Override
	public String toString() {
		return "age=" + age + ", name=" + name ;
	}


	public Demo_Comparable_(int age, String name) {
		
		this.age = age;
		this.name = name;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo_Comparable_ d=new Demo_Comparable_(35,"s");
		Demo_Comparable_ d1=new Demo_Comparable_(36,"p");
		Demo_Comparable_ d2=new Demo_Comparable_(37,"s2");

		
		ArrayList s=new ArrayList();
		
		s.add(d);
		s.add(d1);
		s.add(d2);
		Collections.sort(s);
		
		System.out.println(s);
		for(Object list:s)
		{
			System.out.println(list);
		}
		
		
		
	}




	

}
