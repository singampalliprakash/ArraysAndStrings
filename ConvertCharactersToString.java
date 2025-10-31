package arraysAndStrings;

public class ConvertCharactersToString {
	public static String characterToString(char s[])
	{//		String t=new String(s);
		
		String t = String.valueOf(s);
		return t;
		
	}

	public static void main(String[] args) {
		char s[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's' };
		
		System.out.println(characterToString(s));

	}

}
