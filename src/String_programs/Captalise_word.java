package String_programs;

public class Captalise_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="welcome to india";
		
		String []sir=s.split(" ");
		
		
       String capitaliseWords="";
       
       for(String word:sir)
       {
    	   String After=word.substring(0,1).toUpperCase()+word.substring(1);
    	   capitaliseWords=capitaliseWords+After+" ";
       }
		
		System.out.println(capitaliseWords);
	}

}
