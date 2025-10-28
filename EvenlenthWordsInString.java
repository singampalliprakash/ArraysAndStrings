package arraysAndStrings;

public class EvenlenthWordsInString {
	private static void evenLengthWordsInString(String s) {
		
		for(String w:s.split(" "))
		{
			if(w.length()%2==0)
			{
				System.out.println(w);
			}
		}
		
	}

	public static void main(String[] args) {
		String s="i am Geeks for Geeks and a Geek";
		evenLengthWordsInString(s);

	}

	

}
