
public class ObjectClassEmployee {
	
	
	String name;
	int eid;
	float salary;
	ObjectClassEmployee(String name,int eid,float salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	ObjectClassEmployee a =new ObjectClassEmployee("")
		
		
	}

	@Override
	public String toString() {
		return "ObjectClassEmployee [name=" + name + ", eid=" + eid + ", salary=" + salary + "]";
	}

}
