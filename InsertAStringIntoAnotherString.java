package arraysAndStrings;

public class InsertAStringIntoAnotherString {
	private static void insertAStringIntoAnotherString(String s1, String s2, int index) {
		
		//using substring method
		String result=s1.substring(0,index+1)+s2+s1.substring(index+1);
		System.out.println(result);
		
		
//		int n=s1.length()+s2.length();
//		StringBuilder sb=new StringBuilder(n);
//		
//		for(int i=0;i<=index;i++)
//		{
//			
//				sb.append(s1.charAt(i));
//		}
//		
//		for(int i=0;i<s2.length();i++)
//		{
//			
//				sb.append(s2.charAt(i));
//		}
//		for(int i=index+1;i<s1.length();i++)
//		{
//			
//				sb.append(s1.charAt(i));
//		}
//		
//		System.out.println(sb.toString());
//		
	}

	public static void main(String[] args) {
		String s1="GeeksGeeks";
		String s2="For";
		int index=4;
		insertAStringIntoAnotherString(s1,s2,index);

	}

	

}
