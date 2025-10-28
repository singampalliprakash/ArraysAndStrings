package arraysAndStrings;

public class StringIsPalindromeOrNot {
	private static boolean palindromeOrNot(String s1) {
		String rev="";
		s1=s1.toLowerCase();
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev+=s1.charAt(i);
		}
		return s1.equals(rev);
		
	}

	public static void main(String[] args) {
		String s1="level";
		
		System.out.println(palindromeOrNot(s1));

	}

	

}
