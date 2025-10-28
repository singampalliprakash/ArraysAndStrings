package arraysAndStrings;


import java.util.HashMap;

public class AnagramOrNot {
	public static boolean anagramOrNot(String s1,String s2)
	{
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(Character ch:s1.toCharArray())
		{
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		for(Character ch:s2.toCharArray())
		{
			map.put(ch,map.getOrDefault(ch,0)-1);
		}
		for(var pair:map.entrySet())
		{
			if(pair.getValue()!=0)
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		  String s1 = "geeks";
	      String s2 = "kseeg";
	      System.out.println(anagramOrNot(s1, s2)?true:false);

	}

}

