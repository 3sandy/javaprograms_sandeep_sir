
public class Objectclassequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Objectclassequals c=new Objectclassequals();
		Objectclassequals c1=new Objectclassequals();
		
		System.out.println(c.equals(c1));
		c=c1;
		System.out.println(c.equals(c1));
	}

}
