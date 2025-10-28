package arraysAndStrings;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseAStringUsingStack {

	private static String reverseAStringUsingStack(String s) {
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			st.push(s.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
		while(!st.isEmpty())
		{
			sb.append(st.pop());
			
		}
		return sb.toString();
		
	}
	
	

	public static void main(String[] args) {
		String s="GeeksForGeeks";
		String res=reverseAStringUsingStack(s);
		System.out.println(res);
		
	}


}
