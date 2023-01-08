
public class Secmax_firstmaxwithoutusingbubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {3,4,7,1,2};
		
		int fmax=a[0];
		int smax=a[1];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}

}
