package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo_comparator_user_deffined_class {

	int age;
	String name;
	long salary;
	public Demo_comparator_user_deffined_class(int age, String name, long salary) {
		
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "age=" + age + ", name=" + name + ", salary=" + salary ;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_comparator_user_deffined_class a=new Demo_comparator_user_deffined_class(22,"a",300000);
		Demo_comparator_user_deffined_class a1=new Demo_comparator_user_deffined_class(25,"z",600000);
		Demo_comparator_user_deffined_class a2=new Demo_comparator_user_deffined_class(26,"c",800000);

		
		ArrayList b=new ArrayList();
             b.add(a1);
              b.add(a);
             b.add(a2);
             
             
        //     Collections.sort(b, new My_name_class_Comparator() );
             Collections.sort(b,  new My_salary_class_Comparator() );
             for(Object list:b)
         	{
         		System.out.println(list);
         	}
         	
             
           }


	
	

}
