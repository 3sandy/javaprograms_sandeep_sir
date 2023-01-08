

public class Copying_onearrayintoanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		int a[]=new int[] {1,3,5};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
	
	   System.out.println("Display elements of second array");
	   for(int i=0;i<b.length;i++)
	   {
		   System.out.print(b[i]+" ");
	   }
	}
	
	

}
