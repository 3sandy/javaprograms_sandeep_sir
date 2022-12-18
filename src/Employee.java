
public class Employee {
	
	String name;
	int eid;
	double salary;

	 Employee (String name,int eid,double salary)
	 {
		 this.name=name;
		 this.eid=eid;
		 this.salary=salary;
	 }
	 public static void details(Employee empDetails[]) {
		 
		 for(int i=0;i<empDetails.length;i++)
		 {
			 System.out.println(empDetails[i].name+" "+empDetails[i].eid+" "+empDetails[i].salary);
	 }
	 
		 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	Employee []e=new Employee[3];
	
	e[0]=new Employee("s",001,200142.2);
	e[1]=new Employee("r",002,200142.2);	

	
	 
 }
	}

}
