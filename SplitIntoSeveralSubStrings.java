package arraysAndStrings;

import java.util.ArrayList;
import java.util.Iterator;

public class SplitIntoSeveralSubStrings {
	private static void splitIntoSeveralSubStrings(String s1) {
		
		ArrayList<String> li=new ArrayList<>();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				li.add(s1.substring(i, j));
				
			}
		}
		Iterator<String> itr=li.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s + " ");
		}
		
	}
	

	public static void main(String[] args) {
		String s1= new String("The Cat");
		splitIntoSeveralSubStrings(s1);

	}

	

}
