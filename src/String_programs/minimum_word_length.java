package String_programs;

public class minimum_word_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="aminh yderabad am";
		
		String[] sp=str.split(" ");
		
		String minword=sp[0];
		
		for(int i=0;i<sp.length-1;i++)
		{
			String word=sp[i];
			int min=word.length();
			
			if(sp[i+1].length()<min) 
			{
				minword=sp[i+1];
			}
			
		}

		
		System.out.println(minword+"="+minword.length());


	}

}
