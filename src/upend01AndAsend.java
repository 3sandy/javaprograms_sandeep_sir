
public class upend01AndAsend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,1,1,0,1,0,1,0,0};
		int start=0;
		int end=a.length-1;
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[start]=a[i];
				start++;
			}
			else
			{
				b[end]=a[i];
				end--;
			}
			
			System.out.println(b[i]);
		}
	}

}
