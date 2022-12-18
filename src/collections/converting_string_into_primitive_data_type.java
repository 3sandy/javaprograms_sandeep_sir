package collections;

public class converting_string_into_primitive_data_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="123";
		System.out.println(s+1);
		int s1=Integer.parseInt(s);
		System.out.println(s1+1);
		
		boolean sb=Boolean.parseBoolean(s);
		System.out.println(sb);
		
		double sd=Double.parseDouble(s);
		System.out.println(sd);
		
		short ss=Short.parseShort(s);
		System.out.println(ss);
		
		byte se=Byte.parseByte(s);
		System.out.println(se);
				
	}
	

}
