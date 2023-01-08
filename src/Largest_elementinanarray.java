
public class Largest_elementinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int [] {55,755,25,3,1};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
			
			System.out.println(max);
	}
	
}
