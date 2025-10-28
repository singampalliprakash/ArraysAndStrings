package arraysAndStrings;

public class ReplaceACharacterAtSpecificIndex {
	public static String replaceACharacter(String s)
	{
		int index=6;
		char ch = 'F';
		s=s.substring(0, index)+ch+s.substring(index+1);
		 
		return s;
		
	}

	public static void main(String[] args) {
		String s= "Geeks Gor Geeks";
		System.out.println(replaceACharacter(s));

	}

}
