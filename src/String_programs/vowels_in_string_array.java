package String_programs;

public class vowels_in_string_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"Testyantra","Hyderabad","Banglore"};
		
		for(int i=0;i<s.length;i++)
		{
			String a=s[i];
			String b=a.toLowerCase();
			int count=0;
			for(int j=0;j<b.length();j++)
			{
				char ch = b.charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
			}
			System.out.println(a+"="+count);
		}
		
			}

}
