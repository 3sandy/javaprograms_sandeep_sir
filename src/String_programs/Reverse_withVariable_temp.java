package String_programs;

public class Reverse_withVariable_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="TestYantra";
		char[] ch=s.toCharArray();
		
		String rev=" ";
		int count =0;
		
		for(char c:ch)
		{
			count ++;
		}
		System.out.println(count);
		for(int i=0;i<ch.length;i++) {
			rev=ch[i]+rev;
		}
		System.out.println(rev);
	}

}
