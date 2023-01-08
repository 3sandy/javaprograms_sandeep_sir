

public class sec_maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {2,1,3,5,6};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					
				       a[j]=a[i];
				       
				       a[i]=temp;
					
				}
			}
		}
			System.out.println(a[a.length-2]);
	
	}

}
