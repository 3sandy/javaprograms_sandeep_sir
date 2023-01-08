package normal_java_programs;

public class Square_rootOfanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	double sq=Math.sqrt(25);
//		System.out.println("square root of 25 is "+sq);
		int num=25;
		double temp;
		double sr=num/2;
		
		do {
			temp=sr;
			sr=(temp+(num/temp))/2;
			
		}
		while((temp-sr)!=0);
		{
			System.out.println("square root of a number is "+sr);
		}
	}

}


