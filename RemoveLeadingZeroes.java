package arraysAndStrings;

public class RemoveLeadingZeroes {
	public static String removeLeadingZeroes(String s)
	{
		int f=0;
		int l=s.length();
		while(f<l&&s.charAt(f)=='0')
		{
			f++;
		}
		String r=s.substring(f, l);
		return r;
		
	}

	public static void main(String[] args) {
		String s1="000012356090";
		String s="00000123569";
		System.out.println(removeLeadingZeroes(s));

	}

}
