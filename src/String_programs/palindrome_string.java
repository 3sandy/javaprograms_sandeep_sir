package String_programs;

public class palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s="sandeep";
//		String rev="";
//		
//		for(int i=0;i<s.length();i++)
//		{
//			rev=s.charAt(i)+rev;
//		}
//		
//		if(s.equals(rev))
//		{
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
		
		
		
		
		
//		
//		String s="katham ta ta bye bye";
//		String[] str=s.split(" ");
//		String rev="";
//		
//		for(int i=0;i<str.length;i++)
//		{
//			rev=str[i]+" "+rev;
//		}		
//System.out.println(rev);
		
		
		String s="katham ta ta bye bye";
		String[] str=s.split(" ");
		
		String rev="";
		
		for(int i=0;i<str.length;i++)
		{
			String sk=str[i];
			
			for(int j=sk.length()-1;j>=0;j--)
			{
				rev=rev+sk.charAt(j);
			}
			
			rev=rev+" ";
			 
		}		
       
		System.out.println(rev);
	

}}
