package normal_java_programs;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method c
    int n1=0,n2=1;
    
    int count=10;
    System.out.print(n1+","+n2);
    int sum=0;
    for(int i=2;i<count;i++)
    {
    	sum=n1+n2;
    	n1=n2;
    	n2=sum;
    	System.out.print(","+sum);
    }
	}

}
