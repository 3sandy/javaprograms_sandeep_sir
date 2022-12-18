package String_programs;

public class character_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="TestYanra";
		char[] ch=s.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			System.out.println(ch[i]);
//		}
//				for(int i=0;i<s.length();i++)
//		{
//			System.out.println(s.charAt(i));
//		}
		
		//without using third variable
		
		String b="";
		for(int i=ch.length-1;i>=0;i--)
		{
			b=ch[i]+b;
		}
		System.out.println(b);
		//using temporary variable
		
//		String rev=" ";
//		for(int i=0;i<ch.length;i++) {
//			rev=ch[i]+rev;
//		}
//		System.out.println(rev);
//		
		
//		
	//	int count=0;
//		
//		for(char c:ch)
//		{
//			count++;
//		}
//		
//		for(int i=count-1;i>=0;i--)
//		{
//			System.out.println(ch[i]+" ");
//		}
		
		
		String rev="";
				
			
		for(int i=ch.length;i<ch.length;i--);
	}}
