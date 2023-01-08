
public class find_odd_even_inanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]= {6,2,3,4,8};
		
		System.out.println("odd numbers are:-");

		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]+" ");
			}
			
		}
		
		System.out.println("even numbers are:-");

		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				
				System.out.println(a[i]+" ");
			}
			
		}
		
		
	}

}
