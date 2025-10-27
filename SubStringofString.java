package arraysAndStrings;

public class SubStringofString {
	

	public static void main(String[] args) {
		String s= "abcd";
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.println(s.substring(i,j+1));
			}
			
			
		}
		
	}

}
