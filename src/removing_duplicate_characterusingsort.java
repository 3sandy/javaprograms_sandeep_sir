
public class removing_duplicate_characterusingsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {3,1,2,3,3,4,5,6};
		
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		int k=0;

		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				
				a[k]=a[i];
				
				k++;
			}
			
			
		}
		
		a[k]=a[a.length-1];

		
		for(int i=0;i<=k;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		
	}

}
