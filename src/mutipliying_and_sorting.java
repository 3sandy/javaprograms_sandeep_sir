
public class mutipliying_and_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {1,2,3,1,5,3,4,2,6,5,6};
		
		//this is for squaring of array
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]*a[i];
				
		}
		
		System.out.println("After squaring");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		//This is for sorting
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting");
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]+" ");

		}
	}

}
