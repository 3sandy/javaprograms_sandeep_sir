import java.util.Objects;

public class comare_two_objects {

	
	String name;
	int eid;
	double salary;
	
	
	comare_two_objects(String name,int eid,double salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		comare_two_objects a=new comare_two_objects("san",001,20000.001);
		comare_two_objects a1=new comare_two_objects("san",001,20000.001);

		System.out.println(a.equals(a1));
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());


	}
	
	@Override
	public boolean equals(Object obj) {
	
		comare_two_objects other = (comare_two_objects) obj;
		return eid == other.eid && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	

}
