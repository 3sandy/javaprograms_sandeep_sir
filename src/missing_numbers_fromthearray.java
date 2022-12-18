
public class missing_numbers_fromthearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
		
		
		for(int i=0;i<=10;i++)
		{
			boolean status=true;
			for(int j=0;j<a.length;j++)
			{	
				
				if(i==a[j])
				{
					status=false;
					break;
				}
				
			}
			
			if(status==true)
			{
				System.out.println(i+" ");
			}
			
		}
		
		
	}

}
