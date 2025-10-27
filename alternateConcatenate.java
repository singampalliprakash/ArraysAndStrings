package arraysAndStrings;

public class alternateConcatenate {
	public static String alternateConcatenate(String s1,String s2)
	{
		StringBuilder result = new StringBuilder();
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        while(i<s1.length()&&j<s2.length())
        {
        	result.append(s1.charAt(i));
        	result.append(s2.charAt(j));
        	i++;
        	j++;
        	
        }
        while(i<s1.length())
        {
        	result.append(s1.charAt(i));
        	i++;                             
        }
        while(j<s2.length())
        {
        	result.append(s2.charAt(j));
        	j++;
        }
		return result.toString();
	}

	public static void main(String[] args) {
		String s1="ab";
		String s2="xyz";
		System.out.println(alternateConcatenate(s1, s2));
		

	}

}
