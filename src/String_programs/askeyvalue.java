package String_programs;

public class askeyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//askeyvalues for A=65,a=95,0=48;
		String s="a11b22c33";
		int sum=0;
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(ch>='0' && ch<='9')
//			{
//				int num=ch-48;
//				sum=sum+num;
//				
//			}
//		}
//		System.out.println(sum);
		
	int n=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
	if(ch>='0' && ch<='9')
	{
		int num=ch-48;
		n=n*10+num;
	}
	else {
		sum=sum+n;
		n=0;
	}
	
	}
	
	System.out.println(sum+n);
	}

}
