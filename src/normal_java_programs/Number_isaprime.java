package normal_java_programs;

public class Number_isaprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9;
		
		int temp=0;
		
		
	      for(int i=2;i<num/2;i++)
	      {
	    	  if(num%i==0)
	    	  {
	    		  temp=temp+1;
	    		  break;
	    	  }
	      }
	      if(temp==0)
	      {
	    	  System.out.println("Number is a prime");
	      }
	      else
	      {
	    	  System.out.println("Number is not a prime");
	      }
	    		
	}

}
