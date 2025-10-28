package arraysAndStrings;

public class PanagramOrNot {
	public static boolean panagramOrNot(String str)
	{
		str=str.toLowerCase();
		for(char c='a';c<='z';c++)
		{
			boolean flag=false;
			for(int i=0;i<str.length();i++)
			{
				if(c==str.charAt(i))
				{
					 flag=true;
					break;
				}
			}
		
			if(!flag)
			{
				return false;
			}
		}
		return true;
		 
	}

	public static void main(String[] args) {
		String str = "Abcdefghijklmnopqrstuvwxyz";
		System.out.println(panagramOrNot(str));

	}

}
