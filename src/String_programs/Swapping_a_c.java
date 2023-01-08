package String_programs;

public class Swapping_a_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="a*b#%_z*c$";
		
		char ch[]=s.toCharArray();
		int left=0;
		int right=ch.length-1;
		
		
		
		
//		for (int i = 0; i < ch.length; i++) {
//			
//			if(i==0 || i==4) 
//			{
//				char temp=ch[left];
//				ch[left]=ch[right];
//				ch[right]=temp;
//			}
//		}
		
		
		
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[left]>='a' && ch[left]<='z')
			{
				if(ch[right]>='a' && ch[right]<='z')
				
				{
				
			if(left<right)//check with inde value
			{
				char temp=ch[left];
				ch[left]=ch[right];
				ch[right]=temp;
				left++;
				right--;
				
			}
						}
				else {
				right--;
				}
			
		}
			else {
				left++;
			}
			
			
	}

		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
}}
