package collections;

public class primtonon_prim_viceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int i=20;
//		Integer i1=Integer.valueOf(i);//rimitive to non primitive
//		
//		System.out.println(i1);
//		
//		double d=20.0;
		
		//Double d1=Double.valueOf(d);
//		System.out.println(d1);
//		System.out.println(i1+d1);/
		
//		//Auto Unboxing
//		Double d1=d;
//		System.out.println(d1);

		
//		//creating primitive
//		int i=10;//primitive
//		Integer i1=Integer.valueOf(i);//boxing
//		int i2=i1.intValue();//un-boxing
//		System.out.println(i2);//primitive
//		
//		//Directly creating Non primitive value
//		Double d=20.0;//non=primitive
//		double d1=d.doubleValue();//un-boxing
//		System.out.println(d1);//primitive
//		
//		//creating object of wrapper class
//		Long l=new Long(2000000);//Non primitive
//		long l1=l.longValue();//unboxing
//		System.out.println(l1);//primitive
		
		
		Integer i=20;
		int i1=i;//Auto-Boxing
		System.out.println(i1);//primmitive
		
		int a=new Integer(300);//Auto-boxing
		
		System.out.println(a);//Primitive
		double d=new Double(200.58);//Auto-Unboing
		System.out.println(d);//primitive
		byte b=1;
		byte b1=new Byte(b);//Autouboxing
		System.out.println(b1);//primitive
				
		
		
	}

}
