
public class sum_of_even_odd_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {1,2,3,4,5};
		
		int odd=0,even=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				even=even+a[i];
			}
			else {
				odd=odd+a[i];
			}
		}
		
		System.out.println("Even sum is "+even+"odd sum is "+odd);
	}

}
