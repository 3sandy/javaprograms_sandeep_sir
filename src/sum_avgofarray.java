
public class sum_avgofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int []a= {1,2,3,4};
		int sum=0;
		double avg=0.0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("The sum of array is "+sum);
				avg=sum/a.length;
				System.out.println("The avg of array is"+avg);
	}

}
