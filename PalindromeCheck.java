package arraysAndStrings;

public class PalindromeCheck {
	public static int palindromeCheck(String s)
	{
		int left=0,right=s.length()-1;
		while(left<right)
		{
			if(s.charAt(left)!=s.charAt(right))
			{
				return 0;
			}
			left++;
			right--;
		}
		return 1;
		
	}

	public static void main(String[] args) {
		String s="abba";
		String s1="abc";
		System.out.println(palindromeCheck(s1));

	}

}

