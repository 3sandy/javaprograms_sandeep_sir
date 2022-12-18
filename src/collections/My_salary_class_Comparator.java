package collections;

import java.util.Comparator;

public class My_salary_class_Comparator implements Comparator {

	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Demo_comparator_user_deffined_class m=(Demo_comparator_user_deffined_class)o1;
		Demo_comparator_user_deffined_class m1=(Demo_comparator_user_deffined_class)o2;
		
		if(m.salary>m1.salary)
		{
			return -1;
		}
		else if(m.salary<m1.salary)
		{
			return 1;
		}
		return 0;
	}

}
