
public class Adding_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4,5};
		
		int length=a.length;
		
		if(a.length<b.length)
		{
			length=b.length;
	}
		
		for(int i=0;i<length;i++)
		{
		
			try {
				System.out.print(a[i]+b[i]+" ,");
			}
			catch(Throwable t)
			{
				if(a.length>b.length)
				{
					System.out.print(a[i]);
				}
				
				else {
					System.out.print(b[i]);
				}
			}
			
		}
		
			}

}
